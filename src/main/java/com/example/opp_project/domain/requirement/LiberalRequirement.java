package com.example.opp_project.domain.requirement;

public class LiberalRequirement extends Requirement {

    private final int requiredEssentialCredits;
    private final int requiredBalancedCredits;
    private final int completedEssentialCredits;
    private final int completedBalancedCredits;

    public LiberalRequirement(
            int requiredCredits,
            int completedCredits,
            int requiredEssentialCredits,
            int completedEssentialCredits,
            int requiredBalancedCredits,
            int completedBalancedCredits
    ) {
        super("교양요건", requiredCredits, completedCredits);
        this.requiredEssentialCredits = requiredEssentialCredits;
        this.completedEssentialCredits = completedEssentialCredits;
        this.requiredBalancedCredits = requiredBalancedCredits;
        this.completedBalancedCredits = completedBalancedCredits;
    }

    @Override
    public boolean isCompleted() {
        return super.isCompleted()
                && completedEssentialCredits >= requiredEssentialCredits
                && completedBalancedCredits >= requiredBalancedCredits;
    }

    @Override
    public String getDetailText() {
        return "필수교양 " + completedEssentialCredits + "/" + requiredEssentialCredits
                + ", 균형교양 " + completedBalancedCredits + "/" + requiredBalancedCredits;
    }
}