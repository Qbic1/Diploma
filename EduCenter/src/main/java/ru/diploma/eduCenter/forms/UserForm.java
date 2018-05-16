package ru.diploma.eduCenter.forms;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserForm {
    @NotNull(message = "First name must be set")
    @Size(min = 2, max = 50, message = "First name must contains between 2 and 50 characters")
    private String firstName;
    @NotNull(message = "Last name must be set")
    @Size(min = 2, max = 50, message = "Last name must contains between 2 and 50 characters")
    private String lastName;
    @NotNull(message = "Birth date must be set")
    //@Past(message = "Wrong date")
    private String birth;
    @Size(min = 2, max = 50, message = "City must contains between 2 and 50 characters")
    private String city;
    private String phoneNumber;
    @NotNull(message = "Email must be set")
    @Email(message = "Email must be valid - example@example.com")
    private String email;
    @NotNull(message = "Password must be set")
    @Size(min = 6, max = 50, message = "Password must contains between 6 and 50 characters")
    private String password;
}
