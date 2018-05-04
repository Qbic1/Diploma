package ru.diploma.eduCenter.forms;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class UserForm {
    private String firstName;
    private String lastName;
    private String birth;
    private String city;
    private String phoneNumber;
    private String email;
    private String password;
}
