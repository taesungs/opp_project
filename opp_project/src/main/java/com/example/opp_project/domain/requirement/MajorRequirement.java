package com.example.opp_project.domain.requirement;

import java.util.List;

public class MajorRequirement extends Requirement {

    private final int requiredMajorCredits;
    private final boolean majorRequiredSubjectsRequired;
    private final List<String> requiredSubjects;

    public MajorRequirement(
            int requiredMajorCredits,
            boolean majorRequiredSubjectsRequired,
            List<String> requiredSubjects
    ) {
        super("전공요건");
        this.requiredMajorCredits = requiredMajorCredits;
        this.majorRequiredSubjectsRequired = majorRequiredSubjectsRequired;
        this.requiredSubjects = requiredSubjects;
    }

    public int getRequiredMajorCredits() {
        return requiredMajorCredits;
    }

    public boolean isMajorRequiredSubjectsRequired() {
        return majorRequiredSubjectsRequired;
    }

    public List<String> getRequiredSubjects() {
        return requiredSubjects;
    }

    @Override
    public String getDetailText() {
        if (!majorRequiredSubjectsRequired) {
            return "전공 필요 학점: " + requiredMajorCredits + "학점\n"
                    + "전공필수 과목: 없음";
        }

        return "전공 필요 학점: " + requiredMajorCredits + "학점\n"
                + "전공필수 과목: " + String.join(", ", requiredSubjects);
    }
}