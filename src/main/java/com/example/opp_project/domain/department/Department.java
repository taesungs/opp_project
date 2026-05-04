package com.example.opp_project.domain.department;

public class Department {

    private final String departmentName;
    private final int departmentCode;
    private final int admissionYear;

    public Department(String departmentName, int departmentCode, int admissionYear) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.admissionYear = admissionYear;
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
}