package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void withdraw(User user, int money) {
        String sql = "update USER set balance=balance-? where user_id=?";
        jdbcTemplate.update(sql, money,user.getUserId());
    }

    @Override
    public void deposit(User user,int money) {
        String sql = "update USER set balance=balance+? where user_id=?";
        jdbcTemplate.update(sql, money,user.getUserId());
    }
}
