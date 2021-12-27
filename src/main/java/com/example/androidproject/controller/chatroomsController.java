package com.example.androidproject.controller;

import com.alibaba.fastjson.JSONObject;
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
    public JSONObject getChatRooms() {
        JSONObject jsonObject = new JSONObject();
        List<chatrooms> chatRooms = chatRoomsOfService.getChatRooms();
        jsonObject.put("data", chatRooms);
        jsonObject.put("status", "OK");
        return jsonObject;
    }
}
