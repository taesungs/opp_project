package com.example.opp_project.domain.data;

import com.example.opp_project.domain.department.Department;
import com.example.opp_project.domain.requirement.EngineeringRequirement;
import com.example.opp_project.domain.requirement.GraduationRequirement;
import com.example.opp_project.domain.requirement.LiberalRequirement;
import com.example.opp_project.domain.requirement.MajorRequirement;
import com.example.opp_project.domain.requirement.MultiMajorRequirement;

import java.util.List;

public class GraduationRequirementData {

    public static final Department IC_2023_DEPARTMENT =
            new Department("정보융합학부", 204, 2023);

    public static final Department SW_2026_DEPARTMENT =
            new Department("소프트웨어학부", 403, 2026);

    public static final GraduationRequirement IC_2023 = new GraduationRequirement(
            IC_2023_DEPARTMENT,
            133,
            0,
            List.of(
                    new MajorRequirement(
                            60,
                            0,
                            false,
                            List.of()
                    ),
                    new LiberalRequirement(
                            60,
                            0,
                            13,
                            0,
                            9,
                            0
                    ),
                    new EngineeringRequirement(
                            false,
                            0,
                            0,
                            0,
                            0,
                            List.of()
                    ),
                    new MultiMajorRequirement(
                            false,
                            false
                    )
            )
    );

    public static final GraduationRequirement SW_2026 = new GraduationRequirement(
            SW_2026_DEPARTMENT,
            130,
            0,
            List.of(
                    new MajorRequirement(
                            57,
                            0,
                            true,
                            List.of("자료구조", "알고리즘", "운영체제", "소프트웨어공학")
                    ),
                    new LiberalRequirement(
                            60,
                            0,
                            13,
                            0,
                            18,
                            0
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            0,
                            30,
                            0,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            true,
                            false
                    )
            )
    );

    public static List<GraduationRequirement> getRequirements() {
        return List.of(
                IC_2023,
                SW_2026
        );
    }
}