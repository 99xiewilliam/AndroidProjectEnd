package com.example.androidproject.dao;

import com.example.androidproject.entity.chatrooms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface chatroomsMapper {
    List<chatrooms> getChatRooms();
}
