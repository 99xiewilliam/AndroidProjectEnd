package com.example.androidproject.controller;

import com.example.androidproject.entity.chatrooms;
import com.example.androidproject.service.chatRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chatrooms")
public class chatroomsController {

    @Autowired
    private chatRoomsService chatRoomsOfService;

    @GetMapping("/getChatRooms")
    public List<chatrooms> getChatRooms() {
        return chatRoomsOfService.getChatRooms();
    }
}
