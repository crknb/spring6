package com.atguigu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        // 根据id
        User user = (User) context.getBean("user");
        System.out.println(user);
        // 根据类型 要求ioc中的bean只能有一个
        User user1 = context.getBean(User.class);
        System.out.println("根据类型"+user1);
        // 根据id和类型
        User user2 = context.getBean("user", User.class);
        System.out.println(user2);

    }
}
