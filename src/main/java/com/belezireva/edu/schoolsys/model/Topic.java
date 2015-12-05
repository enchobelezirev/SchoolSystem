package com.belezireva.edu.schoolsys.model;

import java.net.URL;
import java.util.List;

public class Topic  {
    private long id;
    private String name;
    private URL assingment;
    private int difficulty;
    private String description;
    private String notes;
    private Subject subject;
    private String sampleApps;
    private List<Homework> homeWork;

    public Topic(long id, String name, URL assingment, int difficulty, String description, String notes, String sampleApps, List<Homework> homework, Subject subject) {
        super();
        this.id = id;
        this.name = name;
        this.assingment = assingment;
        this.difficulty = difficulty;
        this.description = description;
        this.notes = notes;
        this.sampleApps = sampleApps;
        this.homeWork = homework;
        this.subject = subject;
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

    public URL getAssingment() {
        return assingment;
    }

    public void setAssingment(URL assingment) {
        this.assingment = assingment;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSampleApps() {
        return sampleApps;
    }

    public void setSampleApps(String sampleApps) {
        this.sampleApps = sampleApps;
    }

    public Subject getSubject() {
        return subject;
    }
    

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Homework> getHomeWork() {
        return homeWork;
    }
    

    public void setHomeWork(List<Homework> homeWork) {
        this.homeWork = homeWork;
    }
    
    


}
