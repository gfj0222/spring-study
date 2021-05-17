package com.joker.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    //get set
@AllArgsConstructor //有参构造
@NoArgsConstructor  //无参构造
public class User {
    private int id;
    private String name;
    private String pwd;
}
