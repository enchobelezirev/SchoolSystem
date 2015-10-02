package com.belezireva.edu.schoolsys.dao;

import java.util.List;

import com.belezireva.edu.schoolsys.model.Teacher;

public class TeacherDAO extends Dao<Teacher> {

    @Override
    public Teacher get(String... params) {
        Teacher teacherFound = null;
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            teacherFound = conn.getEntityMan().createQuery("Select t FROM Teacher t Where t.id=:id", Teacher.class).setParameter("id",
                params[0]).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teacherFound;
    }

    @Override
    public List<Teacher> getAll() {
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            return conn.getEntityMan().createQuery("Select t FROM Teacher t", Teacher.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Teacher item) {
        // TODO Auto-generated method stub
        
    }

}
