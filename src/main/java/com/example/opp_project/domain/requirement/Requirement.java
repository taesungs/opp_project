package com.example.opp_project.domain.requirement;

public abstract class Requirement {

    /*
     * 요건 이름
     * 예: "전공요건", "교양요건", "전체졸업요건"
     */
    private final String requirementName;

    /*
     * 학생의 입학연도
     * 예: 2020, 2024, 2025, 2026
     */
    private final int admissionYear;

    /*
     * 학과명
     * 예: 정보융합학부
     */
    private final String department;

    /*
     * 학과 코드
     * 예: 204, 404
     */
    private final int departmentCode;

    /*
     * 전체 졸업에 필요한 총 학점
     */
    private final int requiredTotalCredits;

    /*
     * 학생이 실제로 이수한 전체 학점
     */
    private final int completedTotalCredits;

    /*
     * 현재 요건에서 필요한 학점
     * 전공요건이면 전공 필요학점,
     * 교양요건이면 교양 필요학점
     */
    private final int requiredCredits;

    /*
     * 현재 요건에서 학생이 실제로 이수한 학점
     */
    private final int completedCredits;

    /*
     * 전공 전체 필요 학점
     */
    private final int requiredMajorCredits;

    /*
     * 학생이 실제로 이수한 전공 학점
     */
    private final int completedMajorCredits;

    /*
     * 설계 필요 학점
     */
    private final int requiredDesignCredits;

    /*
     * 학생이 실제로 이수한 설계 학점
     */
    private final int completedDesignCredits;

    /*
     * 교양 전체 필요 학점
     */
    private final int requiredLiberalArtsCredits;

    /*
     * 학생이 실제로 이수한 교양 전체 학점
     */
    private final int completedLiberalArtsCredits;

    /*
     * 필수교양 필요 학점
     */
    private final int requiredEssentialCredits;

    /*
     * 학생이 실제로 이수한 필수교양 학점
     */
    private final int completedEssentialCredits;

    /*
     * 균형교양 필요 학점
     */
    private final int requiredBalancedCredits;

    /*
     * 학생이 실제로 이수한 균형교양 학점
     */
    private final int completedBalancedCredits;

    /*
     * MSC 필요 학점
     */
    private final int requiredMscCredits;

    /*
     * 학생이 실제로 이수한 MSC 학점
     */
    private final int completedMscCredits;

    /*
     * 복수전공 이수 여부
     */
    private final boolean doubleMajor;

    /*
     * 부전공 이수 여부
     */
    private final boolean minor;

    /*
     * 심화전공 이수 여부
     */
    private final boolean intensiveMajor;

    /*
     * 연계전공 이수 여부
     */
    private final boolean interdisciplinary;

    /*
     * 마이크로전공 이수 여부
     */
    private final boolean microMajor;

    /*
     * 공학프로그램 이수 여부
     */
    private final boolean engineeringProgram;

    protected Requirement(
            String requirementName,
            int admissionYear,
            String department,
            int departmentCode,
            int requiredTotalCredits,
            int completedTotalCredits,
            int requiredCredits,
            int completedCredits,
            int requiredMajorCredits,
            int completedMajorCredits,
            int requiredDesignCredits,
            int completedDesignCredits,
            int requiredLiberalArtsCredits,
            int completedLiberalArtsCredits,
            int requiredEssentialCredits,
            int completedEssentialCredits,
            int requiredBalancedCredits,
            int completedBalancedCredits,
            int requiredMscCredits,
            int completedMscCredits,
            boolean doubleMajor,
            boolean minor,
            boolean intensiveMajor,
            boolean interdisciplinary,
            boolean microMajor,
            boolean engineeringProgram
    ) {
        this.requirementName = requirementName;
        this.admissionYear = admissionYear;
        this.department = department;
        this.departmentCode = departmentCode;
        this.requiredTotalCredits = requiredTotalCredits;
        this.completedTotalCredits = completedTotalCredits;
        this.requiredCredits = requiredCredits;
        this.completedCredits = completedCredits;
        this.requiredMajorCredits = requiredMajorCredits;
        this.completedMajorCredits = completedMajorCredits;
        this.requiredDesignCredits = requiredDesignCredits;
        this.completedDesignCredits = completedDesignCredits;
        this.requiredLiberalArtsCredits = requiredLiberalArtsCredits;
        this.completedLiberalArtsCredits = completedLiberalArtsCredits;
        this.requiredEssentialCredits = requiredEssentialCredits;
        this.completedEssentialCredits = completedEssentialCredits;
        this.requiredBalancedCredits = requiredBalancedCredits;
        this.completedBalancedCredits = completedBalancedCredits;
        this.requiredMscCredits = requiredMscCredits;
        this.completedMscCredits = completedMscCredits;
        this.doubleMajor = doubleMajor;
        this.minor = minor;
        this.intensiveMajor = intensiveMajor;
        this.interdisciplinary = interdisciplinary;
        this.microMajor = microMajor;
        this.engineeringProgram = engineeringProgram;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public String getDepartment() {
        return department;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public int getRequiredTotalCredits() {
        return requiredTotalCredits;
    }

    public int getCompletedTotalCredits() {
        return completedTotalCredits;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    public int getRequiredMajorCredits() {
        return requiredMajorCredits;
    }

    public int getCompletedMajorCredits() {
        return completedMajorCredits;
    }

    public int getRequiredDesignCredits() {
        return requiredDesignCredits;
    }

    public int getCompletedDesignCredits() {
        return completedDesignCredits;
    }

    public int getRequiredLiberalArtsCredits() {
        return requiredLiberalArtsCredits;
    }

    public int getCompletedLiberalArtsCredits() {
        return completedLiberalArtsCredits;
    }

    public int getRequiredEssentialCredits() {
        return requiredEssentialCredits;
    }

    public int getCompletedEssentialCredits() {
        return completedEssentialCredits;
    }

    public int getRequiredBalancedCredits() {
        return requiredBalancedCredits;
    }

    public int getCompletedBalancedCredits() {
        return completedBalancedCredits;
    }

    public int getRequiredMscCredits() {
        return requiredMscCredits;
    }

    public int getCompletedMscCredits() {
        return completedMscCredits;
    }

    public boolean isDoubleMajor() {
        return doubleMajor;
    }

    public boolean isMinor() {
        return minor;
    }

    public boolean isIntensiveMajor() {
        return intensiveMajor;
    }

    public boolean isInterdisciplinary() {
        return interdisciplinary;
    }

    public boolean isMicroMajor() {
        return microMajor;
    }

    public boolean isEngineeringProgram() {
        return engineeringProgram;
    }

    public boolean isTotalCreditCompleted() {
        return completedTotalCredits >= requiredTotalCredits;
    }

    public boolean isCurrentRequirementCompleted() {
        return completedCredits >= requiredCredits;
    }

    public boolean isMajorCreditCompleted() {
        return completedMajorCredits >= requiredMajorCredits;
    }

    public boolean isDesignCreditCompleted() {
        return completedDesignCredits >= requiredDesignCredits;
    }

    public boolean isLiberalArtsCreditCompleted() {
        return completedLiberalArtsCredits >= requiredLiberalArtsCredits;
    }

    public boolean isEssentialCreditCompleted() {
        return completedEssentialCredits >= requiredEssentialCredits;
    }

    public boolean isBalancedCreditCompleted() {
        return completedBalancedCredits >= requiredBalancedCredits;
    }

    public boolean isMscCreditCompleted() {
        return completedMscCredits >= requiredMscCredits;
    }

    public int getRemainingTotalCredits() {
        return Math.max(requiredTotalCredits - completedTotalCredits, 0);
    }

    public int getRemainingCredits() {
        return Math.max(requiredCredits - completedCredits, 0);
    }

    public int getRemainingMajorCredits() {
        return Math.max(requiredMajorCredits - completedMajorCredits, 0);
    }

    public int getRemainingDesignCredits() {
        return Math.max(requiredDesignCredits - completedDesignCredits, 0);
    }

    public int getRemainingLiberalArtsCredits() {
        return Math.max(requiredLiberalArtsCredits - completedLiberalArtsCredits, 0);
    }

    public int getRemainingEssentialCredits() {
        return Math.max(requiredEssentialCredits - completedEssentialCredits, 0);
    }

    public int getRemainingBalancedCredits() {
        return Math.max(requiredBalancedCredits - completedBalancedCredits, 0);
    }

    public int getRemainingMscCredits() {
        return Math.max(requiredMscCredits - completedMscCredits, 0);
    }
}