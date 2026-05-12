package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;

import java.util.ArrayList;
import java.util.List;

public class RoboticsCourseProvider implements MajorCourseProvider {

    @Override
    public String getDepartmentName() {
        return "로봇학부";
    }

    @Override
    public List<MajorCourse> getCourses() {
        List<MajorCourse> courses = new ArrayList<>();

        courses.add(new MajorCourse("로봇학부", 1, 1, "전선", "로봇학입문", "소통협업역량", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("로봇학부", 1, 2, "전선", "로봇학입문", "소통협업역량", null, null, "인융대 공동운영(편성학점제외)"));

        courses.add(new MajorCourse("로봇학부", 2, 1, "전필", "로봇학실험1", "소통협업역량", 3, 4, "(정보제어• 지능시스템전공)"));
        courses.add(new MajorCourse("로봇학부", 2, 1, "전필", "AI로봇실험1", "소통협업역량", 3, 4, "(AI로봇전공)"));
        courses.add(new MajorCourse("로봇학부", 2, 1, "전선", "디지털공학", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 1, "전선", "전자기학(구,전자기학1)", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 1, "전선", "회로이론1(구,회로이론)", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 1, "전선", "기초역학", "전문실무역량", 3, 3, ""));

        courses.add(new MajorCourse("로봇학부", 2, 2, "전필", "로봇학실험2", "소통협업역량", 3, 4, "(정보제어• 지능시스템전공)"));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전필", "AI로봇실험2", "소통협업역량", 3, 4, "(AI로봇전공)"));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전선", "컴퓨터구조", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전선", "회로이론2(구,회로및시스템)", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전선", "신호및시스템", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전선", "메카니즘해석", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 2, 2, "전선", "알고리즘", "전문실무역량", 3, 3, ""));

        courses.add(new MajorCourse("로봇학부", 3, 1, "전필", "로봇학실험3", "소통협업역량", 3, 4, "(정보제어• 지능시스템전공)"));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전필", "AI로봇실험3", "소통협업역량", 3, 4, "전필 신설(AI로봇전공)"));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전필", "로봇운동학(구,메카트로닉스)", "전문실무역량", 3, 3, "(정보제어• 지능시스템전공/AI로봇전공 공통)"));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "마이크로프로세서", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "자동제어1(구.자동제어)", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "컴퓨터네트워크", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "AI수학", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "기계학습", "전문실무역량", 3, 3, ""));

        courses.add(new MajorCourse("로봇학부", 3, 2, "전필", "로봇학실험4", "소통협업역량", 3, 4, "(정보제어• 지능시스템전공)"));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전필", "AI로봇실험4", "소통협업역량", 3, 4, "전필 신설(AI로봇전공)"));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "센서공학", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "자동제어2(구.제어시스템설계)", "", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "임베디드시스템", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "컴퓨터비전", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "모터제어", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "로봇제어(구,로봇공학)", "전문실무역량", 3, 3, ""));

        courses.add(new MajorCourse("로봇학부", 3, 1, "전선", "로봇게임세미나26-1\n(구.로봇게임세미나25-1,로봇게임세미나24-1,로봇게임세미나23-1)", "글로벌역량", 3, 3, "로빛학생전용(편성학점제외\n동일교과목 제외, 학기별 개설)"));
        courses.add(new MajorCourse("로봇학부", 3, 2, "전선", "로봇게임세미나26-2\n(구.로봇게임세미나25-2,로봇게임세미나24-2,로봇게임세미나23-2)", "글로벌역량", 3, 3, "로빛학생전용(편성학점제외\n동일교과목 제외, 학기별 개설)"));

        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "피지컬AI", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "전자회로", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "캡스톤설계", "소통협업역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "로봇응용시스템", "창의융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 2, "전선", "강화학습", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 2, "전선", "온디바이스인공지능", "전문실무역량", 3, 3, ""));
        courses.add(new MajorCourse("로봇학부", 4, 2, "전선", "로봇내비게이션", "전문실무역량", 3, 3, ""));

        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "로봇시스템설계26-1\n(구.로봇시스템설계25-1,로봇시스템설계24-1,로봇시스템설계23-1)", "글로벌역량", 3, 3, "로빛학생전용(편성학점제외\n동일교과목 제외, 학기별 개설)"));
        courses.add(new MajorCourse("로봇학부", 4, 2, "전선", "로봇시스템설계26-2\n(구.로봇시스템설계25-2,로봇시스템설계24-2,로봇시스템설계23-2)", "글로벌역량", 3, 3, "로빛학생전용(편성학점제외\n동일교과목 제외, 학기별 개설)"));

        courses.add(new MajorCourse("로봇학부", 4, 1, "전선", "딥러닝", "전문실무역량", null, null, "단과대변경-인융대 공동운영(편성학점제외)"));

        courses.add(new MajorCourse("로봇학부", null, 1, "전선", "로봇산업입문", "창의융합적사고", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));
        courses.add(new MajorCourse("로봇학부", null, 2, "전선", "로봇산업입문", "창의융합적사고", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));
        courses.add(new MajorCourse("로봇학부", null, 1, "전선", "제어알고리즘설계및실습", "전문실무역량", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));
        courses.add(new MajorCourse("로봇학부", null, 2, "전선", "제어알고리즘설계및실습", "전문실무역량", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));
        courses.add(new MajorCourse("로봇학부", null, 1, "전선", "인체데이터분석및실습", "전문실무역량", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));
        courses.add(new MajorCourse("로봇학부", null, 2, "전선", "인체데이터분석및실습", "전문실무역량", null, null, "인융대 공동운영(편성학점 제외)- 매치업사업-로봇분야(로봇)"));

        return courses;
    }
}