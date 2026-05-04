package com.example.opp_project.domain.requirement;

import java.util.List;

public class GraduationRequirement {

    private final String departmentName;
    private final int departmentCode;
    private final int admissionYear;

    private final int requiredTotalCredits;
    private final int requiredMajorCredits;
    private final int requiredLiberalCredits;
    private final int requiredEtcCredits;

    private final boolean engineeringProgramRequired;
    private final boolean majorRequiredSubjectsRequired;
    private final boolean multiMajorRequired;

    private final int requiredDesignCredits;
    private final int requiredMscCredits;

    private final List<String> majorRequiredSubjects;
    private final List<String> engineeringRequiredSubjects;
    private final List<String> graduationRequiredItems;

    public GraduationRequirement(
            String departmentName,
            int departmentCode,
            int admissionYear,
            int requiredTotalCredits,
            int requiredMajorCredits,
            int requiredLiberalCredits,
            int requiredEtcCredits,
            boolean engineeringProgramRequired,
            boolean majorRequiredSubjectsRequired,
            boolean multiMajorRequired,
            int requiredDesignCredits,
            int requiredMscCredits,
            List<String> majorRequiredSubjects,
            List<String> engineeringRequiredSubjects,
            List<String> graduationRequiredItems
    ) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.admissionYear = admissionYear;
        this.requiredTotalCredits = requiredTotalCredits;
        this.requiredMajorCredits = requiredMajorCredits;
        this.requiredLiberalCredits = requiredLiberalCredits;
        this.requiredEtcCredits = requiredEtcCredits;
        this.engineeringProgramRequired = engineeringProgramRequired;
        this.majorRequiredSubjectsRequired = majorRequiredSubjectsRequired;
        this.multiMajorRequired = multiMajorRequired;
        this.requiredDesignCredits = requiredDesignCredits;
        this.requiredMscCredits = requiredMscCredits;
        this.majorRequiredSubjects = majorRequiredSubjects;
        this.engineeringRequiredSubjects = engineeringRequiredSubjects;
        this.graduationRequiredItems = graduationRequiredItems;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public int getRequiredTotalCredits() {
        return requiredTotalCredits;
    }

    public int getRequiredMajorCredits() {
        return requiredMajorCredits;
    }

    public int getRequiredLiberalCredits() {
        return requiredLiberalCredits;
    }

    public int getRequiredEtcCredits() {
        return requiredEtcCredits;
    }

    public boolean isEngineeringProgramRequired() {
        return engineeringProgramRequired;
    }

    public boolean isMajorRequiredSubjectsRequired() {
        return majorRequiredSubjectsRequired;
    }

    public boolean isMultiMajorRequired() {
        return multiMajorRequired;
    }

    public int getRequiredDesignCredits() {
        return requiredDesignCredits;
    }

    public int getRequiredMscCredits() {
        return requiredMscCredits;
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