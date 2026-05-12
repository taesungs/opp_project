package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;

import java.util.ArrayList;
import java.util.List;

public class ComputerInformationEngineeringCourseProvider implements MajorCourseProvider {

    @Override
    public String getDepartmentName() {
        return "컴퓨터정보공학부";
    }

    @Override
    public List<MajorCourse> getCourses() {
        List<MajorCourse> courses = new ArrayList<>();

        courses.add(new MajorCourse("컴퓨터정보공학부", 1, 1, "전선", "공학설계입문", "융합설계", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("컴퓨터정보공학부", 1, 2, "전선", "공학설계입문", "융합설계", null, null, "인융대 공동운영(편성학점제외)"));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전필", "디지털논리회로1", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전필", "객체지향프로그래밍설계\n(구, 고급프로그래밍설계)", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전선", "디지털헬스케어인공지능분석실무", "자료분석", 2, 3, "매치업사업(편성학점제외)"));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "디지털헬스케어인공지능분석실무", "자료분석", 2, 3, "매치업사업(편성학점제외)"));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전선", "회로이론", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전선", "컴퓨터공학기초실험1", "문제해결및응용", 2, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 1, 1, "전선", "컴퓨터공학입문세미나", "전공지식", 2, 2, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 1, "전선", "객체지향프로그래밍실습\n(구,고급프로그래밍실습)", "문제해결및응용", 1, 2, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전필", "디지털논리회로2", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전필", "데이터구조설계", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 1, 2, "전선", "고급C프로그래밍", "문제해결및응용", 3, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "데이터구조실습", "자료분석", 1, 2, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "어셈블리프로그램설계및실습", "전공지식", 3, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "디지털전자회로(구.전자회로)", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "컴퓨터공학기초실험2", "자료분석", 2, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "오픈소스소프트웨어설계및실습", "문제해결및응용", 3, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 2, 2, "전선", "이산수학", "", null, null, "인융대 공통 전공 교과목 개설 (컴공)-편성제외"));

        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전필", "시스템프로그래밍", "문제해결및응용", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전필", "컴퓨터구조", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전선", "컴퓨터네트워크", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전선", "신호및시스템", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전선", "소프트웨어프로젝트\n(구.소프트웨어프로젝트1)", "문제해결및응용", 3, 4, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전선", "시스템프로그래밍실습", "자료분석", 1, 2, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 1, "전선", "컴퓨터구조실험", "문제해결및응용", 1, 2, ""));

        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전필", "운영체제", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "디지털신호처리", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "마이크로프로세서", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "알고리즘", "문제해결및응용", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "인공지능", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "운영체제실습", "자료분석", 1, 2, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "데이터통신\n(구,데이터통신설계)", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "모바일프로그래밍\n(구.소프트웨어프로젝트2)", "문제해결및응용", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 3, 2, "전선", "수치해석", "", null, null, "인융대 공통 전공 교과목 개설 (컴공)-편성제외"));

        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "소프트웨어공학", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "컴퓨터비젼", "문제해결및응용", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "무선모바일네트워크\n(구.무선이동네트워크및5G, 무선이동네트워크)", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "산학협력캡스톤설계\n(구.산학협력캡스톤설계1)", "융합설계", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "정보보호이론", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "임베디드시스템S/W설계", "융합설계", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "머신러닝", "자료분석", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 1, "전선", "GPU컴퓨팅", "전공지식", 3, 3, ""));

        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 2, "전선", "데이터베이스및데이터시각화\n(구,데이터베이스및응용)", "문제해결및응용", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 2, "전선", "인공지능프로그래밍", "전공지식", 3, 3, ""));
        courses.add(new MajorCourse("컴퓨터정보공학부", 4, 2, "전선", "지능IT특론\n구.지능IoT특론,IoT특론,차세대IT특론)", "자료분석", 3, 3, "융합교과목(격년제-편성학점제외)"));

        return courses;
    }
}