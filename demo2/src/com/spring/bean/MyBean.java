package com.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course>{
    @Override
    public Course getObject() throws Exception {
        Course c = new Course();
        c.setCourseName("MAT135h1");
        return c;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
