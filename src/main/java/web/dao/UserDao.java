package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public void updateUser(User user);

    public User getUserById(long id);

    public void removeUser(long id);

    public List<User> listUsers();

}
