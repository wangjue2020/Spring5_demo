package com.spring.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "userPtoxy")
@Aspect
@Order(1)
public class UserProxy {
    @Pointcut(value="execution(* com.spring.bean.User.*(..))")
    public void point(){

    }
    //前置通知
    @Before(value="point()")
    public void before(){
        System.out.println("pre actions...");
    }

    @After(value="point()")
    public void after(){
        System.out.println("post actions...");
    }
}
