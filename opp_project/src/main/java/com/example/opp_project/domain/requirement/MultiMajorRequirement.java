package com.example.opp_project.domain.requirement;

import java.util.List;

public class MultiMajorRequirement extends Requirement {

    private final boolean multiMajorRequired;
    private final List<MultiMajorOption> options;

    public MultiMajorRequirement(
            boolean multiMajorRequired,
            List<MultiMajorOption> options
    ) {
        super("다전공요건");
        this.multiMajorRequired = multiMajorRequired;
        this.options = options;
    }

    public boolean isMultiMajorRequired() {
        return multiMajorRequired;
    }

    public List<MultiMajorOption> getOptions() {
        return options;
    }

    public MultiMajorOption findOption(MultiMajorType type) {
        return options.stream()
                .filter(option -> option.getType() == type)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 다전공 유형의 졸업요건을 찾을 수 없습니다."));
    }

    @Override
    public String getDetailText() {
        if (multiMajorRequired) {
            return "다전공 이수 필수 대상입니다.";
        }

        return "다전공 이수 필수 대상은 아니지만 선택적으로 이수할 수 있습니다.";
    }
}