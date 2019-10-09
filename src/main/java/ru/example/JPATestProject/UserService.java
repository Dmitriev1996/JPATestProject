package ru.example.JPATestProject;

import ru.example.JPATestProject.entities.User;

import java.util.List;

/**
 * Created by Admin on 09.10.2019.
 */
public interface UserService {

    void save(User user);
    List<User> findAll();
}
