package com.example.opp_project.service.course;

import com.example.opp_project.domain.course.MajorCourse;
import java.util.List;

public interface MajorCourseProvider {
    String getDepartmentName();

    List<MajorCourse> getCourses();
}