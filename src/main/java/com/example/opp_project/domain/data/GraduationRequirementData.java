package com.example.opp_project.domain.data;

import com.example.opp_project.domain.department.Department;
import com.example.opp_project.domain.requirement.GraduationRequirement;

import java.util.List;

public class GraduationRequirementData {

    public static final GraduationRequirement IC_2023 = new GraduationRequirement(
            new Department("정보융합학부", 204, 2023),
            133,
            60,
            60,
            List.of("자료구조", "알고리즘", "데이터베이스", "운영체제"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업논문", "졸업작품", "영어졸업인증")
    );

    public static final GraduationRequirement IC_2024 = new GraduationRequirement(
            new Department("정보융합학부", 404, 2024),
            130,
            57,
            60,
            List.of("자료구조", "알고리즘", "데이터베이스"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업작품", "영어졸업인증")
    );

    public static final GraduationRequirement SW_2023 = new GraduationRequirement(
            new Department("소프트웨어학부", 203, 2023),
            133,
            60,
            60,
            List.of("자료구조", "알고리즘", "운영체제"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업논문", "영어졸업인증")
    );

    public static final GraduationRequirement SW_2024 = new GraduationRequirement(
            new Department("소프트웨어학부", 403, 2024),
            130,
            57,
            60,
            List.of("자료구조", "알고리즘", "소프트웨어공학"),
            List.of("공학설계입문", "캡스톤디자인"),
            List.of("졸업작품", "영어졸업인증")
    );

    public static List<GraduationRequirement> getRequirements() {
        return List.of(
                IC_2023,
                IC_2024,
                SW_2023,
                SW_2024
                // 여기에 나머지 12개 추가
        );
    }
}