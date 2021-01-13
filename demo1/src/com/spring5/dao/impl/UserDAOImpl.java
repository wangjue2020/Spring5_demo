package com.spring5.dao.impl;

import com.spring5.dao.UserDAO;

public class UserDAOImpl implements UserDAO{
    @Override
    public void add() {
        System.out.println("Userdao adding....");
    }
}
