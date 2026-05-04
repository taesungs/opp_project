package com.example.opp_project.domain.requirement;

public class LiberalRequirement extends Requirement {

    private final int requiredLiberalCredits;
    private final int requiredEssentialCredits;
    private final int requiredBalancedCredits;
    private final int requiredMscCredits;

    public LiberalRequirement(
            int requiredLiberalCredits,
            int requiredEssentialCredits,
            int requiredBalancedCredits,
            int requiredMscCredits
    ) {
        super("교양요건");
        this.requiredLiberalCredits = requiredLiberalCredits;
        this.requiredEssentialCredits = requiredEssentialCredits;
        this.requiredBalancedCredits = requiredBalancedCredits;
        this.requiredMscCredits = requiredMscCredits;
    }

    public int getRequiredLiberalCredits() {
        return requiredLiberalCredits;
    }

    public int getRequiredEssentialCredits() {
        return requiredEssentialCredits;
    }

    public int getRequiredBalancedCredits() {
        return requiredBalancedCredits;
    }

    public int getRequiredMscCredits() {
        return requiredMscCredits;
    }

    @Override
    public String getDetailText() {
        return "교양 필요 학점: " + requiredLiberalCredits + "학점\n"
                + "필수교양: " + requiredEssentialCredits + "학점\n"
                + "균형교양: " + requiredBalancedCredits + "학점\n"
                + "MSC: " + requiredMscCredits + "학점";
    }
}