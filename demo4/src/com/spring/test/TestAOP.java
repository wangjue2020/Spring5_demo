package com.spring.test;

import com.configuration.SpringConfig;
import com.spring.bean.User;
import com.spring.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    @Test
    public void testAop(){
//        ApplicationContext  context  = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        int res = user.add(1, 2);
        user.multi(1, 2);
    }
}
