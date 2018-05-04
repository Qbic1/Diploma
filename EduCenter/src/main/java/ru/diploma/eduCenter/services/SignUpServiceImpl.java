package ru.diploma.eduCenter.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.diploma.eduCenter.forms.UserForm;
import ru.diploma.eduCenter.models.Role;
import ru.diploma.eduCenter.models.State;
import ru.diploma.eduCenter.models.User;
import ru.diploma.eduCenter.repositories.UsersRepository;

import java.time.LocalDate;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm form) {
        String hashPassword = passwordEncoder.encode(form.getPassword());

        User user = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .birth(LocalDate.parse(form.getBirth()))
                .city(form.getCity())
                .phoneNumber(form.getPhoneNumber())
                .hashPassword(hashPassword)
                .email(form.getEmail())
                .role(Role.STUDENT)
                .state(State.ACTIVE)
                .build();

        usersRepository.save(user);
    }
}
