package com.example.androidproject.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.dao.MessagesMapper;
import com.example.androidproject.entity.messages;
import com.example.androidproject.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessagesServiceImpl implements MessagesService {

    @Autowired
    private MessagesMapper messagesMapper;

    @Override
    public JSONObject getMessages(Integer chatroom_id, Integer page) {
        JSONObject jsonObject = new JSONObject();
        if (chatroom_id == null || page == null || page < 0 || chatroom_id < 0) {
            jsonObject.put("message", "<error message>");
            jsonObject.put("status", "ERROR");
            return jsonObject;
        }
        List<messages> messages = messagesMapper.getMessages(chatroom_id);

        double totalPages = Math.ceil(messages.size() / 5.0);
        String message = null;
        String name = null;
        String message_time = null;
        Integer userId = null;

        Integer length = page * 5;
        Integer start = 0;
        List<JSONObject> jsonObjects = new ArrayList<>();
        if (totalPages >= page) {
            if (messages.size() < length) {
                length = messages.size();
            }
            if (length - 5 < 0) {
                start = 0;
            }else {
                start = page * 5 - 5;
            }

            for (int i = start; i < length; i++) {
                JSONObject obj = new JSONObject();
                message = messages.get(i).getMessage();
                name = messages.get(i).getName();
                message_time = messages.get(i).getMessage_time();
                userId = messages.get(i).getUser_id();
                obj.put("message", message);
                obj.put("name", name);
                obj.put("message_time", message_time);
                obj.put("user_id", userId);
                jsonObjects.add(obj);
            }

        }
        jsonObject.put("current_page", page);
        jsonObject.put("messages", jsonObjects);
        jsonObject.put("total_pages", (int)Math.ceil(messages.size() / 5.0));

        JSONObject jsonSend = new JSONObject();
        jsonSend.put("data", jsonObject);
        jsonSend.put("status", "OK");
        return jsonSend;
    }

    @Override
    public JSONObject InsertMessage(messages messages) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateTime = simpleDateFormat.format(date);
        messages.setMessage_time(dateTime);
        Integer judge = messagesMapper.insertMessage(messages);

        if (judge == 1) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("status", "OK");
            return jsonObject;
        }else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "<error message>");
            jsonObject.put("status", "ERROR");
            return jsonObject;
        }
    }
}
