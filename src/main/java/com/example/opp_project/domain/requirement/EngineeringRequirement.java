package com.example.opp_project.domain.requirement;

import java.util.List;

public class EngineeringRequirement extends Requirement {

    private final boolean engineeringProgramRequired;
    private final int requiredDesignCredits;
    private final int completedDesignCredits;
    private final int requiredMscCredits;
    private final int completedMscCredits;
    private final List<String> requiredSubjects;

    public EngineeringRequirement(
            boolean engineeringProgramRequired,
            int requiredDesignCredits,
            int completedDesignCredits,
            int requiredMscCredits,
            int completedMscCredits,
            List<String> requiredSubjects
    ) {
        super("공학인증요건", 0, 0);
        this.engineeringProgramRequired = engineeringProgramRequired;
        this.requiredDesignCredits = requiredDesignCredits;
        this.completedDesignCredits = completedDesignCredits;
        this.requiredMscCredits = requiredMscCredits;
        this.completedMscCredits = completedMscCredits;
        this.requiredSubjects = requiredSubjects;
    }

    public boolean isEngineeringProgramRequired() {
        return engineeringProgramRequired;
    }

    @Override
    public boolean isCompleted() {
        if (!engineeringProgramRequired) {
            return true;
        }

        return completedDesignCredits >= requiredDesignCredits
                && completedMscCredits >= requiredMscCredits;
    }

    @Override
    public String getDetailText() {
        if (!engineeringProgramRequired) {
            return "공학인증 대상 아님";
        }

        return "설계학점 " + completedDesignCredits + "/" + requiredDesignCredits
                + ", MSC " + completedMscCredits + "/" + requiredMscCredits
                + ", 필수과목: " + String.join(", ", requiredSubjects);
    }
}