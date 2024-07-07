package app.project.service;

import app.project.dao.UserDAO;
import app.project.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;


    }

    @Transactional
    @Override
    public void create(User user) {
        userDAO.create(user);
    }

    @Transactional
    @Override
    public User read(int id) {
        return userDAO.read(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Transactional
    @Override
    public List<User> getUserList() {
        return userDAO.getUserList();
    }
}
