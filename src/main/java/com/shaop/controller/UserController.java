package com.shaop.controller;

import com.shaop.entity.User;
import com.shaop.service.UserService;
import org.eclipse.jetty.util.ajax.JSON;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController{
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        User temp = userService.getUser(user.getName());
        if(temp!=null){
            return "page/user/user_list";
        }
        return null;
    }

    @RequestMapping("/listUser")
    @ResponseBody
    public List<User> getList(){
        return userService.getUserList();
    }

    @RequestMapping("/insertUser")
    public String insert(User user){
        userService.insert(user);
        return "welcome";
    }
}
