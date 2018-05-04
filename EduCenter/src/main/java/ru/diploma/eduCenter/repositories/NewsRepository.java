package ru.diploma.eduCenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.diploma.eduCenter.models.News;

public interface NewsRepository extends JpaRepository<News, Long> {
}
