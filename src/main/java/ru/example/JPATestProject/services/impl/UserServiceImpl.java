package ru.example.JPATestProject.services.impl;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.JPATestProject.UserService;
import ru.example.JPATestProject.dao.UserDAO;
import ru.example.JPATestProject.entities.User;

import java.util.List;

/**
 * Created by Admin on 09.10.2019.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
