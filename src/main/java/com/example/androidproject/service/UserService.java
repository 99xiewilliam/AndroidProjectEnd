package com.example.androidproject.service;

import com.example.androidproject.entity.User;

public interface UserService {
    User getUser(String userName, String password);
}
