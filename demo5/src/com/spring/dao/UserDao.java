package com.spring.dao;

import com.spring.entity.User;

import java.util.List;

public interface UserDao {
    public int insert(User user);
    public int delete(User user);
    public int update(User user);
    public int selectCount();
    public User selectUserById(int userId);
    public List<User> selectAllUser();
    public int[] batchAdd(List<User> users);
}
