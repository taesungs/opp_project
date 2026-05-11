package com.example.opp_project.service;

import com.example.opp_project.domain.data.GraduationRequirementData;
import com.example.opp_project.domain.requirement.GraduationRequirement;

public class GraduationRequirementService {

    public GraduationRequirement findByStudent(int admissionYear, int departmentCode) {
        return GraduationRequirementData.getRequirements()
                .stream()
                .filter(requirement ->
                        requirement.getDepartment().getAdmissionYear() == admissionYear
                                && requirement.getDepartment().getDepartmentCode() == departmentCode
                )
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 학번/학과의 졸업요건을 찾을 수 없습니다."));
    }
}