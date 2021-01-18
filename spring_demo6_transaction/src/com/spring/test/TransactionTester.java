package com.spring.test;

import configuration.Config;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TransactionTester {
    @Test
    public void testGenericApplicationContext(){
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean(User.class, ()->new User());
        User user =(User) context.getBean("com.spring.entity.User");
        System.out.println(user);
    }
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User from = new User(1, null, null, null);
        User to = new User(4, null, null, null);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer(to, from, 100);
    }
    @Test
    public void test(){
        User from = new User(1, null, null, null);
        User to = new User(4, null, null, null);
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer(from, to, 100);
    }
}
