package com.belezireva.edu.schoolsys.dao;

import java.sql.Connection;
import java.util.List;

import com.belezireva.edu.schoolsys.model.Homework;
import com.belezireva.edu.schoolsys.persistence.Repository;

public class HomeworkDAO implements Repository<Homework> {

    @Override
    public void add(Homework item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Homework getRecordById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateRecordById(long id, Homework item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int deleteById(long id) {
        return 0;
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Homework> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection getConnection() {
        // TODO Auto-generated method stub
        return null;
    }


}
