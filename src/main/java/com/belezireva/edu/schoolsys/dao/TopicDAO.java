package com.belezireva.edu.schoolsys.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.belezireva.edu.schoolsys.model.Topic;
import com.belezireva.edu.schoolsys.persistence.Repository;

public class TopicDAO implements Repository<Topic> {

    @Override
    public void add(Topic item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Topic getRecordById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateRecordById(long id, Topic item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int deleteById(long id) {
        return 0;
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Topic> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection getConnection() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

}
