package com.example.androidproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.entity.User;
import com.example.androidproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/getUser")
    public JSONObject getUser(@RequestBody User user) {
        User userExist = userService.getUser(user.getUserName(), user.getPassword());
        JSONObject jsonObject = new JSONObject();
        if (userExist != null) {
            jsonObject.put("status", "OK");
            return jsonObject;
        }else {
            jsonObject.put("status", "NO");
            return jsonObject;
        }
    }
}
