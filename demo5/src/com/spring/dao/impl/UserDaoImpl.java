package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import javafx.beans.property.ListProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(User user) {
        String sql = "insert into USER values(?,?,?);";
        int res = jdbcTemplate.update(sql, user.getUserId(), user.getUsername(), user.getUstatus());
        return res;
    }

    @Override
    public int delete(User user) {
        String sql = "delete from USER where user_id=?;";
        int res = jdbcTemplate.update(sql, user.getUserId());
        return res;
    }

    @Override
    public int update(User user) {
        String sql = "update User set username=?, ustatus=? where user_id=?;";
        int res = jdbcTemplate.update(sql, user.getUsername(),user.getUstatus(), user.getUserId());
        return res;
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from USER";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User selectUserById(int userId) {
        String sql = "select * from USER where user_id=?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),1);
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        String sql = "select * from USER";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }

    @Override
    public int[] batchAdd(List<User> users){
        String sql ="insert into USER values(?,?,?);";
        List<Object[]> batchArgs = new ArrayList<>();
        for(User u: users){
            Object[] args = new Object[]{u.getUserId(), u.getUsername(), u.getUstatus()};
            batchArgs.add(args);
        }
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        return ints;
    }
}
