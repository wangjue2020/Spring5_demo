package com.spring.proxy;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import com.sun.deploy.net.proxy.ProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserDaoProxy {
    public static void main(String[] args) {
        Class[] interfaces = new Class[]{UserDao.class};
        UserDaoImpl udi = new UserDaoImpl();
        UserDao o = (UserDao) Proxy.newProxyInstance(UserDaoProxy.class.getClassLoader(), interfaces, new MyInvocationHandler(udi));
        o.add(1,3);
        o.multiple(1,3);

    }
}
//创建代理对象代码
class MyInvocationHandler implements InvocationHandler {
    //被代理的对象
    private Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }
    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("actions before method...");
        //被增强的方法
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("action after method..." + "result: "+res);
        return res;

    }
}
