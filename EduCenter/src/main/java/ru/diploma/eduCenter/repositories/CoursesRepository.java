package ru.diploma.eduCenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diploma.eduCenter.models.Course;

public interface CoursesRepository extends JpaRepository<Course, Long> {
}
