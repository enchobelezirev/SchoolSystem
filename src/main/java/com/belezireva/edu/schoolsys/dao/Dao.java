package com.belezireva.edu.schoolsys.dao;

import com.belezireva.edu.schoolsys.persistence.Repository;

public abstract class Dao<T> implements Repository<T>{
    protected final String persistenceUnit = "PersistenceUnit";

    @Override
    public void add(T object) {
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            conn.getEntityMan().getTransaction().begin();
            conn.getEntityMan().persist(object);
            conn.getEntityMan().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void updateItem(T item){
        try(DbConnection conn = new DbConnection(persistenceUnit)){
            conn.getEntityMan().getTransaction().begin();
            conn.getEntityMan().merge(item);
            conn.getEntityMan().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void delete(T item){
        try(DbConnection conn = new DbConnection(persistenceUnit)){
            conn.getEntityMan().getTransaction().begin();
            conn.getEntityMan().remove(item);
            conn.getEntityMan().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

}
