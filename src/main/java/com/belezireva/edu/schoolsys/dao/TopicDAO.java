package com.belezireva.edu.schoolsys.dao;

import java.util.List;

import com.belezireva.edu.schoolsys.model.Topic;

public class TopicDAO extends Dao<Topic> {

    @Override
    public Topic get(String... params) {
        Topic topicFound = null;
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            topicFound = conn.getEntityMan().createQuery("Select t FROM Topic t Where t.id=:id", Topic.class).setParameter("id",
                new Long(params[0])).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return topicFound;
    }

    @Override
    public List<Topic> getAll() {
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            return conn.getEntityMan().createQuery("Select t FROM Topic t", Topic.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Topic item) {
        // TODO Auto-generated method stub
        
    }

}
