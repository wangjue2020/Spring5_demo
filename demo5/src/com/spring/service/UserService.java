package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int addNewUser(User user){
        int res = userDao.insert(user);
        return res;
    }

    public int updateUser(User user){
        return userDao.update(user);
    }

    public int deleteUser(User user){
        return userDao.delete(user);
    }

    public int findCount(){
        return userDao.selectCount();
    }

    public User selectUserById(int userId){
        return userDao.selectUserById(userId);
    }

    public List<User> findAllUser(){
        return userDao.selectAllUser();
    }

    public int[] addAllUsers(List<User> users){
        return userDao.batchAdd(users);
    }
}
