package com.atguigu.ioc.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 如果有多个实现类  用id + 类型 方法获取
        UserDao userDao = context.getBean(UserDao.class);
        userDao.run();
    }
}
