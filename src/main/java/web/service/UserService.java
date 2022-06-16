package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void removeUser(long id);
    List<User> listUsers();

    User getUserById(long id);
}
