package ru.diploma.eduCenter.services;


import org.springframework.security.core.Authentication;
import ru.diploma.eduCenter.forms.CourseForm;
import ru.diploma.eduCenter.transfer.CourseDto;

import java.util.List;

public interface CoursesPageService {
    List<CourseDto> getCourses();
    void addCourse(CourseForm courseForm);
    void enrollCourse(Authentication authentication, String title);
}
