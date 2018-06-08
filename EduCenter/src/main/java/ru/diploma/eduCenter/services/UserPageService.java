package ru.diploma.eduCenter.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.diploma.eduCenter.security.details.UserDetailsImpl;
import ru.diploma.eduCenter.transfer.CourseDto;
import ru.diploma.eduCenter.transfer.UserDto;

import java.util.List;


public interface UserPageService {
    UserDto getUser(Authentication authentication);
    void delete(Authentication authentication);
    List<CourseDto> getMyCourses(Authentication authentication);
}
