package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
public void addUser(User user);
public void updateUser(User user);
public User getUserById(int id);
public void removeUser(int id);
public List<User> listUsers();

}
