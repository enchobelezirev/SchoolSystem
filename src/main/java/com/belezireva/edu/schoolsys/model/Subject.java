package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;
import java.util.List;

public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String description;
    private int difficulty;
    private String subjectLang;
    private List<Topic> topics;
    private Teacher teacher;

    public Subject(long id, String name, String description, int difficulty, String subjectLang, List<Topic> topics) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.subjectLang = subjectLang;
        this.topics = topics;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getSubjectLang() {
        return subjectLang;
    }

    public void setSubjectLang(String subjectLang) {
        this.subjectLang = subjectLang;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addTopic(Topic t) {
        this.topics.add(t);
        t.setSubject(this);
    }
    
    public void removeTopic(Topic t){
        this.topics.remove(t);
        t.setSubject(null);
    }

}
