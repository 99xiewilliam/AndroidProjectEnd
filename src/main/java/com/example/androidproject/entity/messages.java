package com.example.androidproject.entity;

import lombok.Data;


@Data
public class messages {
    private Integer id;
    private Integer chatroom_id;
    private Integer user_id;
    private String name;
    private String message;
    private String message_time;
}
