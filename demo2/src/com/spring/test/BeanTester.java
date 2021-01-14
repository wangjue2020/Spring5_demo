package com.spring.test;

import com.spring.bean.Books;
import com.spring.bean.Course;
import com.spring.bean.MyBean;
import com.spring.bean.Student;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTester {
    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
    }

    @Test
    public void testStudentCourse(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Books books = context.getBean("books1", Books.class);
        System.out.println(books);
    }

    @Test
    public void testMyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course mybean1 = context.getBean("mybean", Course.class);
        Course mybean2 = context.getBean("mybean", Course.class);
        System.out.println(mybean1 == mybean2);
    }
}
