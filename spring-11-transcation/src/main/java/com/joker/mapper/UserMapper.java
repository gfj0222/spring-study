package com.joker.mapper;

import com.joker.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    public void addUser(User user);

    public void deleteUser(int id);
}
