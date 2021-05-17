package com.joker.mapper;

import com.joker.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }

}