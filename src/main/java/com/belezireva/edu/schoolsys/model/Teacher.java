package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TEACHER_DESCRIPTION")
    private String teacherDescr;

    @Column(name = "PIC")
    private byte[] picture;

    @OneToMany(targetEntity = Subject.class, mappedBy = "teacher", fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Subject> subjects;

    public Teacher(long id, String name, String teacherDescr, byte[] picture) {
        super();
        this.id = id;
        this.name = name;
        this.teacherDescr = teacherDescr;
        this.picture = picture;
    }

    public Teacher() {
        // TODO Auto-generated constructor stub
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
}
