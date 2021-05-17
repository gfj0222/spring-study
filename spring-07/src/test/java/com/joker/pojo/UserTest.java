package com.joker.pojo;

import com.joker.config.JokerConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void test(){
        //如果完全使用了配置及方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class类加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(JokerConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser);

    }

}