package com.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="user")
public class User {
    public User() {
    }

    public int add(int a , int b){
        System.out.println(a + b);
        return a+b;
    }
    public int multi(int a , int b){
        System.out.println(a * b);
        return a*b;
    }
}
