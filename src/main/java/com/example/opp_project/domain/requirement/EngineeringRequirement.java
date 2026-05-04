package com.example.opp_project.domain.requirement;

import java.util.List;

public class EngineeringRequirement extends Requirement {

    private final boolean engineeringProgramRequired;
    private final int requiredDesignCredits;
    private final int requiredMscCredits;
    private final List<String> requiredSubjects;

    public EngineeringRequirement(
            boolean engineeringProgramRequired,
            int requiredDesignCredits,
            int requiredMscCredits,
            List<String> requiredSubjects
    ) {
        super("공학인증요건");
        this.engineeringProgramRequired = engineeringProgramRequired;
        this.requiredDesignCredits = requiredDesignCredits;
        this.requiredMscCredits = requiredMscCredits;
        this.requiredSubjects = requiredSubjects;
    }

    public boolean isEngineeringProgramRequired() {
        return engineeringProgramRequired;
    }

    public int getRequiredDesignCredits() {
        return requiredDesignCredits;
    }

    public int getRequiredMscCredits() {
        return requiredMscCredits;
    }

    public List<String> getRequiredSubjects() {
        return requiredSubjects;
    }

    @Override
    public String getDetailText() {
        if (!engineeringProgramRequired) {
            return "공학인증 대상 아님";
        }

        return "공학인증 대상\n"
                + "설계 필요 학점: " + requiredDesignCredits + "학점\n"
                + "MSC 필요 학점: " + requiredMscCredits + "학점\n"
                + "공학인증 필수 과목: " + String.join(", ", requiredSubjects);
    }
}