package com.example.opp_project.domain.requirement;

import com.example.opp_project.domain.department.Department;

import java.util.List;

public class GraduationRequirement {

    private final Department department;
    private final int requiredTotalCredits;
    private final List<Requirement> requirements;

    public GraduationRequirement(
            Department department,
            int requiredTotalCredits,
            List<Requirement> requirements
    ) {
        this.department = department;
        this.requiredTotalCredits = requiredTotalCredits;
        this.requirements = requirements;
    }

    public Department getDepartment() {
        return department;
    }

    public int getRequiredTotalCredits() {
        return requiredTotalCredits;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public MultiMajorRequirement getMultiMajorRequirement() {
        for (Requirement requirement : requirements) {
            if (requirement instanceof MultiMajorRequirement) {
                return (MultiMajorRequirement) requirement;
            }
        }

        return null;
    }
}