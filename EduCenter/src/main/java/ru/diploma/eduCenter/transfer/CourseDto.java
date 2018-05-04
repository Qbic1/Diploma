package ru.diploma.eduCenter.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ru.diploma.eduCenter.models.Course;
import ru.diploma.eduCenter.models.Status;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class CourseDto {
    private String title;
    private String description;
    private LocalDate dateStart;
    private LocalDate dateFinish;
    private Status status;

    public static CourseDto from(Course course){
        return CourseDto.builder()
                .title(course.getTitle())
                .description(course.getDescription())
                .dateStart(course.getDateStart())
                .dateFinish(course.getDateFinish())
                .status(course.getStatus())
                .build();
    }
}
