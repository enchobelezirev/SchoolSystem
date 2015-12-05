package com.belezireva.edu.schoolsys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.belezireva.edu.schoolsys.dao.SqlExecutor.StatementExecutor;
import com.belezireva.edu.schoolsys.model.Teacher;
import com.belezireva.edu.schoolsys.persistence.Repository;

public class TeacherDAO implements Repository<Teacher> {

    @Override
    public void add(final Teacher item) {
        SqlExecutor<Boolean> executor = new TeacherSQLExecutor<Boolean>();
        try {
            executor.execute(new StatementExecutor<Boolean>() {
                @Override
                public Boolean execute(Connection connection) throws SQLException {
                    PreparedStatement insertStatement = connection.prepareStatement("Insert into TEACHER VALUES(NULL, ?, ?, ?)");

                    insertStatement.setString(1, item.getName());
                    insertStatement.setBytes(2, item.getPicture());
                    insertStatement.setString(3, item.getTeacherDescr());

                    int rowsInserted = insertStatement.executeUpdate();
                    return rowsInserted == 1;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Teacher getRecordById(final long id) {
        SqlExecutor<Teacher> selectExecutor = new TeacherSQLExecutor<Teacher>();
        try {
            return selectExecutor.execute(new StatementExecutor<Teacher>() {

                @Override
                public Teacher execute(Connection connection) throws SQLException {
                    PreparedStatement selectStatement = connection.prepareStatement("Select * FROM TEACHER WHERE ID=?");

                    selectStatement.setLong(1, id);
                    ResultSet resultSet = selectStatement.executeQuery();
                    resultSet.next();

                    return getTeacher(resultSet);
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void updateRecordById(final long id, final Teacher item) {
        SqlExecutor<Void> updateExecutor = new TeacherSQLExecutor<>();
        try {
            updateExecutor.execute(new StatementExecutor<Void>() {

                @Override
                public Void execute(Connection connection) throws SQLException {
                    PreparedStatement updateStatement = connection.prepareStatement("UPDATE TEACHER SET NAME=?, PIC=?, TEACHER_DESCRIPTION=? WHERE ID=?");
                    
                    updateStatement.setString(1, item.getName());
                    updateStatement.setBytes(2, item.getPicture());
                    updateStatement.setString(3, item.getTeacherDescr());
                    updateStatement.setLong(4, id);
                    
                    updateStatement.executeUpdate();
                    return null;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int deleteById(final long id) {
        SqlExecutor<Integer> deleteExecutor = new TeacherSQLExecutor<>();
        try {
            return deleteExecutor.execute(new StatementExecutor<Integer>() {
                
                @Override
                public Integer execute(Connection connection) throws SQLException {

                    PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM TEACHER WHERE ID=?");
                    
                    deleteStatement.setLong(1, id);
                    
                    return deleteStatement.executeUpdate();
                }
            });
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public List<Teacher> getAll() {
        SqlExecutor<List<Teacher>> selectAllExecutor = new TeacherSQLExecutor<>();
        try {
            return selectAllExecutor.execute(new StatementExecutor<List<Teacher>>() {

                @Override
                public List<Teacher> execute(Connection connection) throws SQLException {
                    PreparedStatement selectAllStatement = connection.prepareStatement("Select * FROM TEACHER");
                    
                    List<Teacher> teachers = new ArrayList<>();
                    ResultSet rs = selectAllStatement.executeQuery();
                    while (rs.next()) {
                        teachers.add(getTeacher(rs));
                    }
                    
                    return teachers;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Teacher getTeacher(ResultSet rs) throws SQLException {
        Teacher teacher = new Teacher();

        teacher.setId(rs.getLong(1));
        teacher.setName(rs.getString(2));
        teacher.setPic(rs.getBytes(3));
        teacher.setTeacherDescr(rs.getString(4));

        return teacher;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(H2_CONN_STRING);
    }

    private class TeacherSQLExecutor<T> extends SqlExecutor<T> {
        @Override
        protected Connection getConnection() throws SQLException {
            return TeacherDAO.this.getConnection();
        }
    }

}
