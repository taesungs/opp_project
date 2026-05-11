package com.example.opp_project.domain.data;

import com.example.opp_project.domain.department.Department;
import com.example.opp_project.domain.requirement.EngineeringRequirement;
import com.example.opp_project.domain.requirement.GraduationRequirement;
import com.example.opp_project.domain.requirement.LiberalRequirement;
import com.example.opp_project.domain.requirement.MajorRequirement;
import com.example.opp_project.domain.requirement.MultiMajorOption;
import com.example.opp_project.domain.requirement.MultiMajorRequirement;
import com.example.opp_project.domain.requirement.MultiMajorType;

import java.util.List;

public class GraduationRequirementData {

    public static final GraduationRequirement IC_2023 = new GraduationRequirement(
            new Department("정보융합학부", 204, 2023),
            133,
            List.of(
                    new MajorRequirement(
                            60,
                            false,
                            List.of()
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            false,
                            0,
                            0,
                            List.of()
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement IC_2024 = new GraduationRequirement(
            new Department("정보융합학부", 404, 2024),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            false,
                            List.of()
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            false,
                            0,
                            0,
                            List.of()
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement IC_2025 = new GraduationRequirement(
            new Department("정보융합학부", 404, 2025),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            false,
                            List.of()
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            false,
                            0,
                            0,
                            List.of()
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement IC_2026 = new GraduationRequirement(
            new Department("정보융합학부", 404, 2026),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            false,
                            List.of()
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            false,
                            0,
                            0,
                            List.of()
                    ),
                    new MultiMajorRequirement(
                            true,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement SW_2023 = new GraduationRequirement(
            new Department("소프트웨어학부", 203, 2023),
            133,
            List.of(
                    new MajorRequirement(
                            60,
                            true,
                            List.of("자료구조실습", "응용소프트웨어실습", "자료구조", "알고리즘")
                    ),
                    new LiberalRequirement(
                            22
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("C프로그래밍", "인공지능과 컴퓨팅사고", "고급C프로그래밍설계")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement SW_2024 = new GraduationRequirement(
            new Department("소프트웨어학부", 403, 2024),
            133,
            List.of(
                    new MajorRequirement(
                            60,
                            true,
                            List.of("자료구조실습", "응용소프트웨어실습", "자료구조", "알고리즘")
                    ),
                    new LiberalRequirement(
                            31
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("C프로그래밍", "인공지능과컴퓨팅사고")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement SW_2025 = new GraduationRequirement(
            new Department("소프트웨어학부", 403, 2025),
            133,
            List.of(
                    new MajorRequirement(
                            45,
                            true,
                            List.of()
                    ),
                    new LiberalRequirement(
                            31
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("C프로그래밍", "인공지능과컴퓨팅사고")
                    ),
                    new MultiMajorRequirement(
                            true,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement SW_2026 = new GraduationRequirement(
            new Department("소프트웨어학부", 403, 2026),
            133,
            List.of(
                    new MajorRequirement(
                            45,
                            true,
                            List.of()
                    ),
                    new LiberalRequirement(
                            33
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("C프로그래밍", "인공지능과컴퓨팅사고", "고급C프로그래밍설계")
                    ),
                    new MultiMajorRequirement(
                            true,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement CE_2023 = new GraduationRequirement(
            new Department("컴퓨터정보공학부", 202, 2023),
            133,
            List.of(
                    new MajorRequirement(
                            60,
                            true,
                            List.of("자료구조", "알고리즘", "운영체제", "컴퓨터구조")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement CE_2024 = new GraduationRequirement(
            new Department("컴퓨터정보공학부", 402, 2024),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("자료구조", "알고리즘", "운영체제", "컴퓨터구조")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement CE_2025 = new GraduationRequirement(
            new Department("컴퓨터정보공학부", 402, 2025),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("자료구조", "알고리즘", "운영체제", "컴퓨터구조")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement CE_2026 = new GraduationRequirement(
            new Department("컴퓨터정보공학부", 402, 2026),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("자료구조", "알고리즘", "운영체제", "컴퓨터구조")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            true,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement RB_2023 = new GraduationRequirement(
            new Department("로봇학부", 741, 2023),
            133,
            List.of(
                    new MajorRequirement(
                            60,
                            true,
                            List.of("로봇공학개론", "동역학", "제어공학", "로봇프로그래밍")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement RB_2024 = new GraduationRequirement(
            new Department("로봇학부", 406, 2024),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("로봇공학개론", "동역학", "제어공학", "로봇프로그래밍")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement RB_2025 = new GraduationRequirement(
            new Department("로봇학부", 406, 2025),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("로봇공학개론", "동역학", "제어공학", "로봇프로그래밍")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            false,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static final GraduationRequirement RB_2026 = new GraduationRequirement(
            new Department("로봇학부", 406, 2026),
            130,
            List.of(
                    new MajorRequirement(
                            57,
                            true,
                            List.of("로봇공학개론", "동역학", "제어공학", "로봇프로그래밍")
                    ),
                    new LiberalRequirement(
                            60
                    ),
                    new EngineeringRequirement(
                            true,
                            12,
                            30,
                            List.of("공학설계입문", "캡스톤디자인")
                    ),
                    new MultiMajorRequirement(
                            true,
                            createDefaultMultiMajorOptions()
                    )
            )
    );

    public static List<GraduationRequirement> getRequirements() {
        return List.of(
                IC_2023,
                IC_2024,
                IC_2025,
                IC_2026,

                SW_2023,
                SW_2024,
                SW_2025,
                SW_2026,

                CE_2023,
                CE_2024,
                CE_2025,
                CE_2026,

                RB_2023,
                RB_2024,
                RB_2025,
                RB_2026
        );
    }

    private static List<MultiMajorOption> createDefaultMultiMajorOptions() {
        return List.of(
                new MultiMajorOption(
                        MultiMajorType.INTENSIVE_MAJOR,
                        30,
                        List.of("심화전공 지정 과목 이수"),
                        "본전공을 더 깊게 이수하는 유형입니다."
                ),
                new MultiMajorOption(
                        MultiMajorType.DOUBLE_MAJOR,
                        36,
                        List.of("복수전공 필수 과목 이수", "복수전공 최소 학점 이수"),
                        "다른 학과의 전공을 추가로 이수하는 유형입니다."
                ),
                new MultiMajorOption(
                        MultiMajorType.MINOR,
                        21,
                        List.of("부전공 최소 학점 이수"),
                        "타 학과 전공을 부전공 수준으로 이수하는 유형입니다."
                ),
                new MultiMajorOption(
                        MultiMajorType.INTERDISCIPLINARY_MAJOR,
                        36,
                        List.of("연계전공 교육과정 이수"),
                        "둘 이상의 학문 분야를 연계한 전공을 이수하는 유형입니다."
                ),
                new MultiMajorOption(
                        MultiMajorType.STUDENT_DESIGNED_CONVERGENCE_MAJOR,
                        36,
                        List.of("학생설계 교육과정 승인", "승인된 과목 이수"),
                        "학생이 직접 설계한 융합전공 교육과정을 이수하는 유형입니다."
                ),
                new MultiMajorOption(
                        MultiMajorType.MICRO_MAJOR,
                        12,
                        List.of("마이크로전공 지정 과목 이수"),
                        "소규모 전공 단위의 교육과정을 이수하는 유형입니다."
                )
        );
    }
}