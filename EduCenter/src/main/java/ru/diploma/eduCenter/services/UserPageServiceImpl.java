package ru.diploma.eduCenter.services;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.security.details.UserDetailsImpl;
import ru.diploma.eduCenter.transfer.UserDto;

@Service
public class UserPageServiceImpl implements UserPageService {
    UserDetailsImpl details;

    @Override
    public UserDto getUser(Authentication authentication) {
        details = (UserDetailsImpl) authentication.getPrincipal();
        return UserDto.from(details.getUser());
    }
}
