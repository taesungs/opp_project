package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;

import java.util.ArrayList;
import java.util.List;

public class SoftwareCourseProvider implements MajorCourseProvider {

    @Override
    public String getDepartmentName() {
        return "소프트웨어학부";
    }

    @Override
    public List<MajorCourse> getCourses() {
        List<MajorCourse> courses = new ArrayList<>();

        courses.add(new MajorCourse("소프트웨어학부", 1, 1, "전선", "공학설계입문", "융합설계능력", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("소프트웨어학부", 1, 2, "전선", "공학설계입문", "융합설계능력", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("소프트웨어학부", 1, 1, "전선", "소프트웨어입문세미나", "글로벌정신", 1, 1, ""));
        courses.add(new MajorCourse("소프트웨어학부", 1, 2, "전선", "고급C프로그래밍및설계", "자료분석및검증기술", 3, 3, ""));

        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "디지털논리", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "고급프로그래밍", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "웹프로그래밍\n(구,인터넷프로그래밍)", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "파이썬기반인공지능기초", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "리눅스활용실습\n(구,소프트웨어실습1)", "융합설계능력", 2, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 1, "전선", "이산수학(구, 이산구조)", "전문실무지식및문제해결능력", null, null, "인융대 공통 전공 교과목 개설 (소프트)-편성제외"));

        courses.add(new MajorCourse("소프트웨어학부", 2, 2, "전선", "자료구조", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 2, "전선", "시스템소프트웨어", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 2, "전선", "자료구조실습\n(구,시스템소프트웨어실습)", "융합설계능력", 2, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 2, "전선", "객체지향프로그래밍\n(구,프로그래밍언어)", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 2, 2, "전선", "오픈소스소프트웨어개발", "자료분석및검증기술", 3, 3, ""));

        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "알고리즘", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "운영체제", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "컴퓨터구조", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "데이터베이스", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "데이터통신", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "가상세계", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "모바일프로그래밍\n(구,임베디드운영체제)", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 1, "전선", "응용소프트웨어실습\n(구,소프트웨어실습3)", "융합설계능력", 3, 4, ""));

        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "인공지능", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "컴퓨터네트워크", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "프로그래밍언어론", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "심화전공실습(구,심화전공실습1)", "융합설계능력", 3, 4, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "컴퓨터그래픽스", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "컴퓨터비전(구,디지털영상처리)", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "빅데이터처리및응용\n(구,데이터베이스응용)", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 3, 2, "전선", "수치해석", "자료분석및검증기술", null, null, "인융대 공통 전공 교과목 개설 (소프트)-편성제외"));

        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "소프트웨어공학", "융합설계능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "컴파일러", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "딥러닝실습", "융합설계능력", 2, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "정보시스템응용", "자료분석및검증기술", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "컴퓨터애니메이션실습\n(구,심화전공실습2)", "융합설계능력", 2, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "네트워크보안", "글로벌정신", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "무선네트워크", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "컴퓨터애니메이션\n(구,게임공학)", "융합설계능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "산학협력캡스톤설계1\n(구,캡스톤설계1)", "융합설계능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 1, "전선", "기계학습", "전문실무지식및문제해결능력", 3, 3, ""));

        courses.add(new MajorCourse("소프트웨어학부", 4, 2, "전선", "혼합현실(구,가상현실)", "융합설계능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 2, "전선", "미래네트워크특강\n(구,차세대네트워크응용)", "전문실무지식및문제해결능력", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 2, "전선", "최신정보보안이론", "글로벌정신", 3, 3, ""));
        courses.add(new MajorCourse("소프트웨어학부", 4, 2, "전선", "산학협력캡스톤설계2\n(구,캡스톤설계2)", "융합설계능력", 3, 3, ""));

        return courses;
    }
}