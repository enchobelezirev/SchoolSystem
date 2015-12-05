package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String teacherDescr;
    private byte[] picture;
    private List<Subject> subjects;

    public Teacher(long id, String name, String teacherDescr, byte[] picture) {
        super();
        this.id = id;
        this.name = name;
        this.teacherDescr = teacherDescr;
        this.picture = picture;
    }
    
    public Teacher() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherDescr() {
        return teacherDescr;
    }

    public void setTeacherDescr(String teacherDescr) {
        this.teacherDescr = teacherDescr;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
    

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setPic(byte[] picBytes) {
        this.picture = picBytes;
    }
    
    @Override
    public String toString() {
        return "Name: "+this.name+" Description: "+this.teacherDescr;
    }
    
}
