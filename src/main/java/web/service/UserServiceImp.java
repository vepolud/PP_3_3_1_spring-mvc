package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements web.service.UserService {


    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

//    @Autowired
//    public UserServiceImp(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Transactional
//    @Override
//    public void add(User user) {
//        userDao.add(user);
//    }
//
//
//    @Override
//    public List<User> listUsers() {
//        return userDao.listUsers();
//    }
//
//    @Transactional
//    @Override
//    public void addCar(Car car) {
//        userDao.addCar(car);
//    }
//
//
//    @Override
//    public User getUser(String model, int series) {
//        return userDao.getUser(model, series);
//    }
}
