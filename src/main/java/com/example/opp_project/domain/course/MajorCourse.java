package com.example.opp_project.domain.course;

public class MajorCourse {

    private final String department;
    private final Integer grade;
    private final Integer semester;
    private final String type;
    private final String name;
    private final String competency;
    private final Integer credit;
    private final Integer hour;
    private final String note;

    public MajorCourse(
            String department,
            Integer grade,
            Integer semester,
            String type,
            String name,
            String competency,
            Integer credit,
            Integer hour,
            String note
    ) {
        this.department = department;
        this.grade = grade;
        this.semester = semester;
        this.type = type;
        this.name = name;
        this.competency = competency;
        this.credit = credit;
        this.hour = hour;
        this.note = note;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getGrade() {
        return grade;
    }

    public Integer getSemester() {
        return semester;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCompetency() {
        return competency;
    }

    public Integer getCredit() {
        return credit;
    }

    public Integer getHour() {
        return hour;
    }

    public String getNote() {
        return note;
    }
}