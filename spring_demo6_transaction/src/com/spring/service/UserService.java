package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    public void transfer(User from, User to, int money){
        log.info("hello log info");
        userDao.deposit(to, money);
//        int i = 1 / 0;
        userDao.withdraw(from, money);
    }
}
