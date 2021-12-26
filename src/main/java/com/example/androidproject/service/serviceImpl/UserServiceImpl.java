package com.example.androidproject.service.serviceImpl;

import com.example.androidproject.dao.UserMapper;
import com.example.androidproject.entity.User;
import com.example.androidproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String userName, String password) {
        return userMapper.getUser(userName, password);
    }
}
