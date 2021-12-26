package com.example.androidproject.service.serviceImpl;

import com.example.androidproject.dao.chatroomsMapper;
import com.example.androidproject.entity.chatrooms;
import com.example.androidproject.service.chatRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class chatRoomsServiceImpl implements chatRoomsService {

    @Autowired
    private chatroomsMapper chatroomsOfMapper;
    @Override
    public List<chatrooms> getChatRooms() {
        return chatroomsOfMapper.getChatRooms();
    }
}
