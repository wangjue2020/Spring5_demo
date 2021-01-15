package com.annotation.service;

import com.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 在注解里面value属性值可以省略不写，不写的话， 默认值为类名的首字母小写（userService）
 */
@Service(value="userService")//相当于<bean id="userService" ....>
public class UserService {
    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "1234")
    private int number;
    public void callUserDao(){
        System.out.println("userService is calling userdao's method ...");
        System.out.println(number);
        userDao.userDaoMethod();
    }
}
