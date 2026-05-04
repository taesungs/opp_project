package com.example.opp_project.domain.department;

public class Department {

    private final String name;
    private final int code;
    private final int admissionYear;

    public Department(String name, int code, int admissionYear) {
        this.name = name;
        this.code = code;
        this.admissionYear = admissionYear;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }
}