package com.belezireva.edu.schoolsys.dao;

import java.util.List;

import com.belezireva.edu.schoolsys.model.Subject;

public class SubjectDAO extends Dao<Subject> {

    @Override
    public Subject get(String... params) {
        Subject subjectFound = null;
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            // subjectFound = conn.getEntityMan().find(Subject.class, new Long(params[0]));
            subjectFound = conn.getEntityMan().createQuery("Select s FROM Subject s Where s.id=:id", Subject.class).setParameter("id",
                new Long(params[0])).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjectFound;
    }

    @Override
    public List<Subject> getAll() {
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            return conn.getEntityMan().createQuery("Select s FROM Subject s Where s.id=:id", Subject.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Subject item) {
        Subject subjectDb = get(new Long(item.getId()).toString());
        subjectDb.setName(item.getName());
        // TODO: Set the new vals
        updateItem(subjectDb);
    }

}
