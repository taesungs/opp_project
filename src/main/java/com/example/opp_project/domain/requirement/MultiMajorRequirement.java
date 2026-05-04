package com.example.opp_project.domain.requirement;

public class MultiMajorRequirement extends Requirement {

    private final boolean multiMajorRequired;
    private final boolean multiMajorCompleted;

    public MultiMajorRequirement(boolean multiMajorRequired, boolean multiMajorCompleted) {
        super("다전공요건", 0, 0);
        this.multiMajorRequired = multiMajorRequired;
        this.multiMajorCompleted = multiMajorCompleted;
    }

    @Override
    public boolean isCompleted() {
        if (!multiMajorRequired) {
            return true;
        }

        return multiMajorCompleted;
    }

    @Override
    public String getDetailText() {
        if (!multiMajorRequired) {
            return "다전공 필수 대상 아님";
        }

        return multiMajorCompleted ? "다전공 이수 완료" : "다전공 이수 필요";
    }
}