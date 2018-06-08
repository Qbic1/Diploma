package ru.diploma.eduCenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.models.State;
import ru.diploma.eduCenter.models.User;
import ru.diploma.eduCenter.repositories.UsersRepository;
import ru.diploma.eduCenter.security.details.UserDetailsImpl;
import ru.diploma.eduCenter.transfer.CourseDto;
import ru.diploma.eduCenter.transfer.UserDto;

import java.util.List;

@Service
public class UserPageServiceImpl implements UserPageService {
    UserDetailsImpl details;

    @Autowired
    private UsersRepository repository;

    @Override
    public UserDto getUser(Authentication authentication) {
        details = (UserDetailsImpl) authentication.getPrincipal();
        return UserDto.from(details.getUser());
    }

    @Override
    public void delete(Authentication authentication) {
        User user = details.getUser();
        user.setState(State.DELETED);
        repository.save(user);
    }

    @Override
    public List<CourseDto> getMyCourses(Authentication authentication) {
        User user = details.getUser();
        return CourseDto.from(user.getCourses());
    }
}
