package com.spring.test;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = "classpath:db_xml.xml")
@SpringJUnitConfig(locations = "classpath:db_xml.xml")
public class Junit5Tester {
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        User from = new User(1, null, null, null);
        User to = new User(4, null, null, null);
        userService.transfer(from, to, 100);
    }
}
