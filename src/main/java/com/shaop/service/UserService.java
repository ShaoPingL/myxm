package com.shaop.service;


import com.shaop.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void insert(User record);

    List<User> getUserList();

    User getUser(String name);

}