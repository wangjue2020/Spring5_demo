package com.spring.test;

import com.spring.autowire.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireTester {

    @Test
    public void testEmpDep(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_autowire.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
