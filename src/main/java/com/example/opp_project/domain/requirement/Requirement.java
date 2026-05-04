package com.example.opp_project.domain.requirement;

public abstract class Requirement {

    private final String requirementName;

    protected Requirement(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public abstract String getDetailText();
}