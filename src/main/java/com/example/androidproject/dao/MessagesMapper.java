package com.example.androidproject.dao;

import com.example.androidproject.entity.messages;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MessagesMapper {
    List<messages> getMessages(Integer chatroom_id);
    Integer insertMessage(messages messages);
}
