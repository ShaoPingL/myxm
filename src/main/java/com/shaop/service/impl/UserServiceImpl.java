package com.shaop.service.impl;

import com.shaop.dao.UserMapper;
import com.shaop.entity.User;
import com.shaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public void insert(User record) {
        userMapper.insert(record);
    }

    public List<User> getUserList(){
        return userMapper.getUserList();
    }

    public User getUser(String name) {
        return userMapper.getUser(name);
    }

    ;

}
