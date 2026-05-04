package com.example.opp_project.domain.data;

import com.example.opp_project.domain.requirement.GraduationRequirement;

import java.util.List;

public class GraduationRequirementData {

    public static final GraduationRequirement IC_2023 = new GraduationRequirement(
            "정보융합학부",
            204,
            2023,
            133,
            60,
            60,
            13,
            false,
            false,
            false,
            0,
            0,
            List.of(),
            List.of(),
            List.of("졸업작품", "영어졸업인증")
    );

    public static final GraduationRequirement IC_2026 = new GraduationRequirement(
            "정보융합학부",
            404,
            2026,
            130,
            57,
            60,
            13,
            false,
            false,
            true,
            0,
            0,
            List.of(),
            List.of(),
            List.of("졸업작품", "영어졸업인증", "다전공 이수")
    );

    public static final GraduationRequirement SW_2023 = new GraduationRequirement(
            "소프트웨어학부",
            203,
            2023,
            133,
            60,
            60,
            13,
            true,
            true,
            false,
            12,
            30,
            List.of("자료구조", "알고리즘", "운영체제", "데이터베이스"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업작품", "영어졸업인증")
    );

    public static final GraduationRequirement SW_2026 = new GraduationRequirement(
            "소프트웨어학부",
            403,
            2026,
            130,
            57,
            60,
            13,
            true,
            true,
            true,
            12,
            30,
            List.of("자료구조", "알고리즘", "운영체제", "소프트웨어공학"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업작품", "영어졸업인증", "다전공 이수")
    );

    public static List<GraduationRequirement> getRequirements() {
        return List.of(
                IC_2023,
                IC_2026,
                SW_2023,
                SW_2026
        );
    }
}