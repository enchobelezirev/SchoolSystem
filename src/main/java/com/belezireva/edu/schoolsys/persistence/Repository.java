package com.belezireva.edu.schoolsys.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public interface Repository<T> {
    static final String H2_CONN_STRING = "jdbc:h2:~/schoolsystem";
    void add(T item);
    T getRecordById(long id) throws SQLException;
    void updateRecordById(long id, T item);
    int deleteById(long id);
    List<T> getAll();
    Connection getConnection() throws SQLException;
    
}
