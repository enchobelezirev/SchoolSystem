package com.belezireva.edu.schoolsys;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.belezireva.edu.schoolsys.dao.Dao;
import com.belezireva.edu.schoolsys.dao.HomeworkDAO;
import com.belezireva.edu.schoolsys.dao.StudentDAO;
import com.belezireva.edu.schoolsys.dao.SubjectDAO;
import com.belezireva.edu.schoolsys.dao.TopicDAO;
import com.belezireva.edu.schoolsys.model.Homework;
import com.belezireva.edu.schoolsys.model.Student;
import com.belezireva.edu.schoolsys.model.Subject;
import com.belezireva.edu.schoolsys.model.Teacher;
import com.belezireva.edu.schoolsys.model.Topic;

public class App {
    public static void main(String[] args) throws MalformedURLException {
        List<Topic> topics = new ArrayList<>();
        // Subject s = new Subject();
        // s.setDescription("");
        // s.setDifficulty(1);
        // s.setName("Javaaaa");
        // s.setSubjectLang("Java");
        // Teacher teacher = new Teacher();
        // teacher.setName("tonza");
        // teacher.setPicture(new byte[]{});
        // teacher.setTeacherDescr("test");
        // s.setTeacher(teacher);
        // Dao<Subject> sDao = new SubjectDAO();
        // Subject s = sDao.get("1");
        // System.out.println(s.getTopics().toString());
        // Topic t = new Topic();
        // t.setName("test1");
        // t.setDescription("");
        // t.setAssingment(new URL("http://test.com"));
        // t.setDifficulty(1);
        // t.setNotes("");
        // t.setSampleApps("sample1");
        // t.setSubject(s);
        // topics = s.getTopics();
        // topics.add(t);
        // s.setTopics(topics);
//        TopicDAO tDao = new TopicDAO();
//        Topic t = tDao.get("1");
//        //
//        Student stud = new Student();
//        stud.setName("encho1");
//        stud.setPassword("1234");
//        stud.setPic(new byte[] {});
//        stud.setUserName("enjoycho1");
//
//        Homework hw = new Homework();
//        hw.setHwUrl("test1");
//        List<Homework> hws = new ArrayList<>();
//
//        hw.setStudent(stud);
//        hw.setTopic(t);
//
//        hws.add(hw);
//        stud.setHw(hws);
//        t.setHomeWork(hws);
//
//        Dao<Homework> hwDao = new HomeworkDAO();
//        hwDao.add(hw);
        Dao<Subject> subjectDao = new SubjectDAO();
        Subject s = subjectDao.get("1");
        Topic t = new Topic();
        t.setAssingment(new URL("http://test"));
        t.setDescription("nqma");
        t.setDifficulty(2);
        t.setName("undef");
        t.setNotes("");
        t.setSampleApps("");
        t.setSubject(s);
        s.addTopic(t);
        Dao<Topic> tDao = new TopicDAO();
        tDao.add(t);
    }
}
