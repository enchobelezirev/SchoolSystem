package com.belezireva.edu.schoolsys.model;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private byte[] pic;
    private String userName;
    private String password;
    private List<Homework> hw;

    public Student(long id, String name, byte[] pic, String userName, String password, List<Homework> hw) {
        super();
        this.id = id;
        this.name = name;
        this.pic = pic;
        this.userName = userName;
        this.password = password;
        this.hw = hw;
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

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Homework> getHw() {
        return hw;
    }

    public void setHw(List<Homework> hw) {
        this.hw = hw;
    }

    @Override
    public String toString() {
        // return String.format("Student with id: {0} name: {1} user name: {2}", id, name,
        // userName).toString();
        return "Student with id: " + id + " name: " + name + " user name: " + userName;
    }

}
