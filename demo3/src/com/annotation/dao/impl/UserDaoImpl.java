package com.annotation.dao.impl;

import com.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value="userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void userDaoMethod() {
        System.out.println("UserDaoImpl method running....");
    }
}
