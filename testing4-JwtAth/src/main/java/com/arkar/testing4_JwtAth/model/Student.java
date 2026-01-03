package com.arkar.testing4_JwtAth.model;

public class Student {
    private int id;
    private String username;
    private int marks;

    public Student(int id, String username, int marks) {
        this.id = id;
        this.username = username;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
