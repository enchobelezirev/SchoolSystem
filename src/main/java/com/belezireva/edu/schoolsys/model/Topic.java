package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TOPIC")
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ASSIGNMENT")
    private URL assingment;

    @Column(name = "DIFFICULTY")
    private int difficulty;

    @Column(name = "DESCR")
    private String description;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "SAMPLEAPPS")
    private String sampleApps;

    @OneToMany(targetEntity = Homework.class, mappedBy = "topic", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Homework> homeWork;

    
    @ManyToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name = "SUBJECT_ID")
    private Subject subject;

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

    public Topic() {
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
