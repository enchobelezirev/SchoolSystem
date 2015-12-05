package com.belezireva.edu.schoolsys.dao;

import java.sql.Connection;
import java.sql.SQLException;

class SqlExecutor<T> {
    public T execute(StatementExecutor<T> statementExecutor) throws SQLException {
        T result = null;
        try {
            Connection connection = getConnection();
            try {
                result = statementExecutor.execute(connection);
            } finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw e;
        }
        return result;
    }

    protected Connection getConnection() throws SQLException {
        return null;
    }

    protected interface StatementExecutor<T> {
        T execute(Connection connection) throws SQLException;
    }
}
