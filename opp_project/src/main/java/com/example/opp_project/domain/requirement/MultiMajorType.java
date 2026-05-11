package com.example.opp_project.domain.requirement;

public enum MultiMajorType {

    INTENSIVE_MAJOR("심화전공"),
    DOUBLE_MAJOR("복수전공"),
    MINOR("부전공"),
    INTERDISCIPLINARY_MAJOR("연계전공"),
    STUDENT_DESIGNED_CONVERGENCE_MAJOR("학생설계 융합전공"),
    MICRO_MAJOR("마이크로전공");

    private final String displayName;

    MultiMajorType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static MultiMajorType fromDisplayName(String displayName) {
        for (MultiMajorType type : values()) {
            if (type.displayName.equals(displayName)) {
                return type;
            }
        }

        throw new IllegalArgumentException("존재하지 않는 다전공 유형입니다.");
    }
}