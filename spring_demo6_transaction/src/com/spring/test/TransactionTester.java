package com.spring.test;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTester {
    @Test
    public void test(){
        User from = new User(1, null, null, null);
        User to = new User(4, null, null, null);
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transfer(from, to, 100);
    }
}
