package com.belezireva.edu.schoolsys.dao;

import java.util.List;

import com.belezireva.edu.schoolsys.model.Student;

public class StudentDAO extends Dao<Student> {

    @Override
    public Student get(String... params) {
        Student studentFound = null;
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            studentFound = conn.getEntityMan().createQuery("Select s FROM Student s Where s.userName=:name and s.password=:pass",
                Student.class).setParameter("name", params[0]).setParameter("pass", params[1]).getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return studentFound;
    }

    @Override
    public List<Student> getAll() {
        try (DbConnection conn = new DbConnection(persistenceUnit)) {
            return conn.getEntityMan().createQuery("Select s FROM Student s", Student.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Student item) {
        Student studentToUpdate = get(item.getUserName(), item.getPassword());
        updateItem(studentToUpdate);
    }

}
