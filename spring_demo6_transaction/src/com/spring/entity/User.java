package com.spring.entity;

public class User {
    private Integer userId;
    private String username;
    private String ustatus;
    private Integer balance;

    public User() {
    }

    public User(Integer userId, String username, String ustatus, Integer balance) {
        this.userId = userId;
        this.username = username;
        this.ustatus = ustatus;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", balance=" + balance +
                '}';
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

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
