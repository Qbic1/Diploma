package ru.diploma.eduCenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diploma.eduCenter.models.Teacher;

public interface TeachersRepository extends JpaRepository<Teacher, Long> {
}
