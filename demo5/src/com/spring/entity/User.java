package com.spring.entity;

import java.math.BigInteger;

public class User {
    private Integer userId;
    private String username;
    private String ustatus;

    public User() {
    }

    public User(Integer userId, String username, String ustatus) {
        this.userId = userId;
        this.username = username;
        this.ustatus = ustatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
