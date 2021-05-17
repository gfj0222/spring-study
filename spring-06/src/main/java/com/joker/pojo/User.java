package com.joker.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User{
    public String name;
    @Value("gfj")
    public void setName(String name){
        this.name=name;
    }
}
