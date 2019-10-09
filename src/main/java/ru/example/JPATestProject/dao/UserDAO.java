package ru.example.JPATestProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.JPATestProject.entities.User;

/**
 * Created by Admin on 09.10.2019.
 */
public interface UserDAO extends JpaRepository<User, Long> {
}
