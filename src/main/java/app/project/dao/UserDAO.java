package app.project.dao;

import app.project.model.User;
import java.util.List;

public interface UserDAO {
        void create(User user);

        User read(int id);

        void update(User user);

        void delete(User user);

        List<User> getUserList();
}
