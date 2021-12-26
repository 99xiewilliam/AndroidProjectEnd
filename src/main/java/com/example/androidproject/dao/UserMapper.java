package com.example.androidproject.dao;

import com.example.androidproject.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    User getUser(String user_name, String password);
}
