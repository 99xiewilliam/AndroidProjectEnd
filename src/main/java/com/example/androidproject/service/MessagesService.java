package com.example.androidproject.service;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.entity.messages;

public interface MessagesService {
    JSONObject getMessages(Integer chatroom_id, Integer page);
    JSONObject InsertMessage(messages messages);
}
