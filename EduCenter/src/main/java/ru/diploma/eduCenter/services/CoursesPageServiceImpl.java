package ru.diploma.eduCenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.forms.CourseForm;
import ru.diploma.eduCenter.models.Course;
import ru.diploma.eduCenter.models.Status;
import ru.diploma.eduCenter.repositories.CoursesRepository;
import ru.diploma.eduCenter.transfer.CourseDto;

import java.time.LocalDate;
import java.util.List;

@Service
public class CoursesPageServiceImpl implements CoursesPageService{

    @Autowired
    CoursesRepository coursesRepository;

    @Override
    public List<CourseDto> getCourses() {
        return CourseDto.from(coursesRepository.findAll());
    }

    @Override
    public void addCourse(CourseForm courseForm) {
        Course course = Course.builder()
                .title(courseForm.getTitle())
                .description(courseForm.getDescription())
                .dateStart(LocalDate.parse(courseForm.getDateStart()))
                .dateFinish(LocalDate.parse(courseForm.getDateFinish()))
                .status(Status.FUTURE)
                .build();

        coursesRepository.save(course);
    }
}
