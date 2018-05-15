package ru.diploma.eduCenter.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.diploma.eduCenter.security.details.UserDetailsImpl;
import ru.diploma.eduCenter.transfer.UserDto;


public interface UserPageService {
    UserDto getUser(Authentication authentication);
}
