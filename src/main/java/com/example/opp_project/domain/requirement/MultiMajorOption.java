package com.example.opp_project.domain.requirement;

import java.util.List;

public class MultiMajorOption {

    private final MultiMajorType type;
    private final int requiredCredits;
    private final List<String> requiredItems;
    private final String description;

    public MultiMajorOption(
            MultiMajorType type,
            int requiredCredits,
            List<String> requiredItems,
            String description
    ) {
        this.type = type;
        this.requiredCredits = requiredCredits;
        this.requiredItems = requiredItems;
        this.description = description;
    }

    public MultiMajorType getType() {
        return type;
    }

    public int getRequiredCredits() {
        return requiredCredits;
    }

    public List<String> getRequiredItems() {
        return requiredItems;
    }

    public String getDescription() {
        return description;
    }

    public String getDetailText() {
        StringBuilder builder = new StringBuilder();

        builder.append(type.getDisplayName()).append(" 졸업요건\n");
        builder.append("필요 학점: ").append(requiredCredits).append("학점\n");

        if (requiredItems == null || requiredItems.isEmpty()) {
            builder.append("필수 조건: 별도 지정 없음\n");
        } else {
            builder.append("필수 조건: ").append(String.join(", ", requiredItems)).append("\n");
        }

        builder.append("설명: ").append(description);

        return builder.toString();
    }
}