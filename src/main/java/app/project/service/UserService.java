package app.project.service;

import app.project.model.User;
import java.util.List;

public interface UserService {

    void create(User user);

    User read(int id);

    void update(User user);

    void delete(User user);

    List<User> getUserList();
}
