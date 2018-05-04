package ru.diploma.eduCenter.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.diploma.eduCenter.models.User;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class UserDto {

    private String firstName;
    private String lastName;
    private LocalDate birth;
    private String email;
    private String city;
    private String phoneNumber;

    public static UserDto from(User user) {
        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .birth(user.getBirth())
                .email(user.getEmail())
                .city(user.getCity())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
