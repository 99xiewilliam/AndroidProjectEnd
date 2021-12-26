package com.example.androidproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.entity.messages;
import com.example.androidproject.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessagesController {
    @Autowired
    private MessagesService messagesService;

    @GetMapping("/get_messages")
    public JSONObject getMessages(Integer chatroom_id, Integer page) {
        return messagesService.getMessages(chatroom_id, page);
    }

    @PostMapping("/send_message")
    public JSONObject insertMessage(Integer chatroom_id, Integer user_id, String name, String message) {
        messages messages = new messages();
        messages.setMessage(message);
        messages.setChatroom_id(chatroom_id);
        messages.setName(name);
        messages.setUser_id(user_id);
        return messagesService.InsertMessage(messages);
    }
}
