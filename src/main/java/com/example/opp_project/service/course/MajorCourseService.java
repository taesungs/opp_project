package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;

import java.util.ArrayList;
import java.util.List;

public class MajorCourseService {

    private final List<MajorCourseProvider> providers;

    public MajorCourseService() {
        this.providers = List.of(
                new InformationConvergenceCourseProvider(),
                new ComputerInformationEngineeringCourseProvider(),
                new SoftwareCourseProvider(),
                new RoboticsCourseProvider()
        );
    }

    public List<MajorCourse> findAll() {
        List<MajorCourse> courses = new ArrayList<>();

        for (MajorCourseProvider provider : providers) {
            courses.addAll(provider.getCourses());
        }

        return courses;
    }

    public List<MajorCourse> findByDepartment(String departmentName) {
        List<MajorCourse> result = new ArrayList<>();

        for (MajorCourse course : findAll()) {
            if (course.getDepartment().equals(departmentName)) {
                result.add(course);
            }
        }

        return result;
    }
}