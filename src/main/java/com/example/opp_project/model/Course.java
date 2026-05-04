package com.example.opp_project.model;

public class Course {

    private String year;
    private String semester;
    private String name;
    private String type;
    private int credit;

    public Course(String year, String semester, String name, String type, int credit) {
        this.year = year;
        this.semester = semester;
        this.name = name;
        this.type = type;
        this.credit = credit;
    }

    public String getYear() {
        return year;
    }

    public String getSemester() {
        return semester;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCredit() {
        return credit;
    }
}