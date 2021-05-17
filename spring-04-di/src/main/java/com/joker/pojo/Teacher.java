package com.joker.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String name;
    @Value("gfj")
    public void setName(String name){
        this.name=name;
    }
}
