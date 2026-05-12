package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;
import java.util.ArrayList;
import java.util.List;

public class InformationConvergenceCourseProvider implements MajorCourseProvider {

    @Override
    public String getDepartmentName() {
        return "정보융합학부";
    }

    @Override
    public List<MajorCourse> getCourses() {
        List<MajorCourse> courses = new ArrayList<>();

        courses.add(new MajorCourse("정보융합학부", 1, 1, "전선", "창의설계입문", "기반능력", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("정보융합학부", 1, 2, "전선", "창의설계입문", "기반능력", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("정보융합학부", 1, 2, "전선", "그래픽디자인(구,컴퓨터그래픽디자인)", "기반능력", 3, 3, ""));

        courses.add(new MajorCourse("정보융합학부", 2, 1, "전선", "컴퓨터네트워크", "기반능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 1, "전선", "AI수학", "기반능력", 3, 3, "이수구분 변경(전필->전선)"));
        courses.add(new MajorCourse("정보융합학부", 2, 1, "전선", "객체지향프로그래밍", "기반능력", 3, 3, "이수구분 변경(전필->전선)"));
        courses.add(new MajorCourse("정보융합학부", 2, 1, "전선", "오픈소스소프트웨어실습(구.오픈소스소프트웨어)", "기반능력", 3, 4, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 1, "전선", "인터랙티브미디어개론", "기반능력", 3, 3, ""));

        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "선형대수", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "자료구조", "기반능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "인터랙티브심리학(구, UX심리학)", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "모바일프로그래밍", "기반능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "데이터마이닝(구, 데이터마이닝분석)", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "비주얼컴퓨팅", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 2, 2, "전선", "이산수학", "", null, null, "인융대 공통 전공 교과목 개설 (정융)-편성제외"));

        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "데이터베이스", "기반능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "컴퓨터그래픽스", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "텍스트마이닝(구, 텍스트및오피니언마이닝)", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "IoT시스템설계및실습(구IoT프로그래밍)", "문제해결능력", 3, 4, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "컴퓨터비전", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "인과추론(구.실험설계및분석)", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "UX/UI디자인", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 1, "전선", "기계학습", "전문지식능력", 3, 3, ""));

        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "데이터애널리틱스", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "딥러닝프로그래밍", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "빅데이터알고리즘(구,빅데이터처리및응용)", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "확장현실(구.가상현실)", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "Physical AI 실습", "문제해결능력", 3, 4, "실습교과목 신설"));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "AI서비스설계및실습", "문제해결능력", 3, 4, "실습교과목 신설"));
        courses.add(new MajorCourse("정보융합학부", 3, 2, "전선", "HCI와UX평가", "융합적사고", 3, 3, ""));

        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "AI기반영상처리", "전문지식능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "영상AI생성모델(구.AI생성모델)", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "네트워크데이터분석(구.소셜네트워크분석)", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "MLOps엔지니어링(구.인터랙티브AI)", "문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "산학협력캡스톤설계1", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 1, "전선", "데이터시각화(구,IoT및 SNS데이터분석)", "문제해결능력", 3, 3, ""));

        courses.add(new MajorCourse("정보융합학부", 4, 2, "전선", "인공지능응용(구,빅데이터기획분석론)", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 2, "전선", "ICT융합전략", "융합적사고", 3, 3, ""));
        courses.add(new MajorCourse("정보융합학부", 4, 2, "전선", "산학협력캡스톤설계2", "융합적사고", 3, 3, ""));

        return courses;
    }
}