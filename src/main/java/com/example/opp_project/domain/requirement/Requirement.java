package com.example.opp_project.domain.requirement;

public abstract class Requirement {

    private final String requirementName;
    private final int requiredCredits;
    private final int completedCredits;

    protected Requirement(String requirementName, int requiredCredits, int completedCredits) {
        this.requirementName = requirementName;
        this.requiredCredits = requiredCredits;
        this.completedCredits = completedCredits;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    public int getRemainingCredits() {
        return Math.max(requiredCredits - completedCredits, 0);
    }

    public boolean isCompleted() {
        return completedCredits >= requiredCredits;
    }

    public abstract String getDetailText();

    public String getStatusText() {
        return isCompleted() ? "충족" : "미충족";
    }
}