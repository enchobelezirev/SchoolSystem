package com.belezireva.edu.schoolsys.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection implements AutoCloseable{
    private EntityManager entityMan = null;
    private EntityManagerFactory entityManFactory = null;
    
    public DbConnection(String persistenceUnit) {
        try {
            entityManFactory = Persistence.createEntityManagerFactory(persistenceUnit);
            entityMan = entityManFactory.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
    public EntityManager getEntityMan() {
        return entityMan;
    }
    
    public void close() throws Exception {
        if (entityMan != null) {
            entityMan.close();
        }
        if (entityManFactory != null) {
            entityManFactory.close();
        }
    }
}
