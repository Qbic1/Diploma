package ru.diploma.eduCenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diploma.eduCenter.models.CourseStudent;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Long> {
}
