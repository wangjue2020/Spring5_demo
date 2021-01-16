package com.spring.dao.impl;

import com.spring.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiple(int a, int b) {
        return a*b;
    }
}
