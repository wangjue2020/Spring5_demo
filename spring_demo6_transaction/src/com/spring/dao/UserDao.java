package com.spring.dao;

import com.spring.entity.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public interface UserDao {
    public void withdraw(User user, int money);
    public void deposit(User user, int money);
}
