package ru.diploma.eduCenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.diploma.eduCenter.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long>{

    Optional<User> findOneByEmail(String email);
}
