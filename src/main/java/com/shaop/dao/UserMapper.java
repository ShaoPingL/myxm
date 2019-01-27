package com.shaop.dao;

import com.shaop.entity.User;

import java.util.List;

public interface UserMapper {

    int insert(User record);

    List<User> getUserList();

    User getUser(String name);
}