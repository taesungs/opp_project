package com.example.opp_project.domain.requirement;

import com.example.opp_project.domain.department.Department;

import java.util.List;

public class GraduationRequirement {

    private final Department department;
    private final int requiredTotalCredits;
    private final int completedTotalCredits;
    private final List<Requirement> requirements;

    public GraduationRequirement(
            Department department,
            int requiredTotalCredits,
            int completedTotalCredits,
            List<Requirement> requirements
    ) {
        this.department = department;
        this.requiredTotalCredits = requiredTotalCredits;
        this.completedTotalCredits = completedTotalCredits;
        this.requirements = requirements;
    }

    public Department getDepartment() {
        return department;
    }

    public int getRequiredTotalCredits() {
        return requiredTotalCredits;
    }

    public int getCompletedTotalCredits() {
        return completedTotalCredits;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public boolean isTotalCreditCompleted() {
        return completedTotalCredits >= requiredTotalCredits;
    }

    public boolean isGraduationCompleted() {
        if (!isTotalCreditCompleted()) {
            return false;
        }

        for (Requirement requirement : requirements) {
            if (!requirement.isCompleted()) {
                return false;
            }
        }

        return true;
    }
}