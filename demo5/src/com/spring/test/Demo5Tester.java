package com.spring.test;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo5Tester {
    @Test
    public void UserDaoInsertTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int res = userService.addNewUser(new User(2, "John", "active"));
        System.out.println(res);
    }

    @Test
    public void UserDaoUpdateTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int res = userService.updateUser(new User( 1, "John", "inactive"));
        System.out.println(res);
    }

    @Test
    public void UserDaoDeleteTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int res = userService.deleteUser(new User(1, null, null));
        System.out.println(res);
    }

    @Test
    public void UserDaoSelectCountTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int count = userService.findCount();
        System.out.println(count);
    }

    @Test
    public void UserDaoSelectUserById(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.selectUserById(1);
        System.out.println(user);
    }

    @Test
    public void UserDaoSelectAllUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> users = userService.findAllUser();
        System.out.println(users);
    }

    @Test
    public void UserDaoAddAllUsers(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> users = new ArrayList<>();
        users.add(new User(3, "Wang","A"));
        users.add(new User(4, "Jenny","A"));
        users.add(new User(5, "Jack","I"));
        int[] ints = userService.addAllUsers(users);
        System.out.println(Arrays.toString(ints));
    }
}
