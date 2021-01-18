package com.spring.test;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:db_xml.xml")
public class JUnitTester {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User from = new User(1, null, null, null);
        User to = new User(4, null, null, null);
        userService.transfer(from, to, 100);
    }

}
