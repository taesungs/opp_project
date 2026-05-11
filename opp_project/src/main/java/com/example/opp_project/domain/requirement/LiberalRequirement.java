package com.example.opp_project.domain.requirement;

public class LiberalRequirement extends Requirement {

    private final int requiredBalancedCredits;

    public LiberalRequirement(
            int requiredBalancedCredits
    ) {
        super("교양요건");
        this.requiredBalancedCredits = requiredBalancedCredits;
    }


    public int getRequiredBalancedCredits() {
        return requiredBalancedCredits;
    }


    @Override
    public String getDetailText() {
        return "균형교양: " + requiredBalancedCredits + "학점\n";
    }
}