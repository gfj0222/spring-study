package com.joker.mapper;

import com.joker.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{


    public List<User> selectUser() {
        User user = new User(5, "小王", "2314");

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(5);

            return mapper.selectUser();

        }

    @Override
    public void addUser(User user) {
         getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public void deleteUser(int id) {
          getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

}
