package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;

public class Homework implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String hwUrl;
    private Student student;
    private Topic topic;

    public Homework(long id, String hwUrl, Student student, Topic topic) {
        super();
        this.id = id;
        this.hwUrl = hwUrl;
        this.student = student;
        this.topic = topic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHwUrl() {
        return hwUrl;
    }

    public void setHwUrl(String hwUrl) {
        this.hwUrl = hwUrl;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
