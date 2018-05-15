package ru.diploma.eduCenter.forms;

import lombok.Data;

@Data
public class CourseForm {
    private String title;
    private String description;
    private String dateStart;
    private String dateFinish;
}
