package com.example.opp_project.domain.requirement;

import com.example.opp_project.domain.department.Department;

import java.util.List;

public class GraduationRequirement {

    private final Department department;

    private final int totalCredits;
    private final int majorCredits;
    private final int liberalCredits;

    private final List<String> majorRequiredSubjects;
    private final List<String> engineeringRequiredSubjects;
    private final List<String> graduationRequiredItems;

    public GraduationRequirement(
            Department department,
            int totalCredits,
            int majorCredits,
            int liberalCredits,
            List<String> majorRequiredSubjects,
            List<String> engineeringRequiredSubjects,
            List<String> graduationRequiredItems
    ) {
        this.department = department;
        this.totalCredits = totalCredits;
        this.majorCredits = majorCredits;
        this.liberalCredits = liberalCredits;
        this.majorRequiredSubjects = majorRequiredSubjects;
        this.engineeringRequiredSubjects = engineeringRequiredSubjects;
        this.graduationRequiredItems = graduationRequiredItems;
    }

    public Department getDepartment() {
        return department;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public int getMajorCredits() {
        return majorCredits;
    }

    public int getLiberalCredits() {
        return liberalCredits;
    }

    public List<String> getMajorRequiredSubjects() {
        return majorRequiredSubjects;
    }

    public List<String> getEngineeringRequiredSubjects() {
        return engineeringRequiredSubjects;
    }

    public List<String> getGraduationRequiredItems() {
        return graduationRequiredItems;
    }
}