package com.belezireva.edu.schoolsys.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.belezireva.edu.schoolsys.model.Subject;
import com.belezireva.edu.schoolsys.persistence.Repository;

public class SubjectDAO implements Repository<Subject> {

    @Override
    public void add(Subject item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Subject getRecordById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateRecordById(long id, Subject item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int deleteById(long id) {
        return 0;
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Subject> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection getConnection() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }


}
