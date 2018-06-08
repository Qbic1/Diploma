package ru.diploma.eduCenter.services;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.forms.CourseForm;
import ru.diploma.eduCenter.models.Course;
import ru.diploma.eduCenter.models.Status;
import ru.diploma.eduCenter.models.User;
import ru.diploma.eduCenter.repositories.CoursesRepository;
import ru.diploma.eduCenter.repositories.UsersRepository;
import ru.diploma.eduCenter.security.details.UserDetailsImpl;
import ru.diploma.eduCenter.transfer.CourseDto;

import java.time.LocalDate;
import java.util.List;

@Service
public class CoursesPageServiceImpl implements CoursesPageService{

    UserDetailsImpl details;

    @Autowired
    CoursesRepository coursesRepository;

    @Autowired
    UsersRepository usersRepository;

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

    @Override
    public void enrollCourse(Authentication authentication, String title) {
        details = (UserDetailsImpl) authentication.getPrincipal();
        User current = details.getUser();
        Course course = coursesRepository.getOneByTitle(title);
        Hibernate.initialize(current.getCourses());
        List<Course> temp = current.getCourses();
        if(!temp.contains(course))
            temp.add(course);
        current.setCourses(temp);
        usersRepository.save(current);
    }
}
