package com.example.androidproject.entity;

import lombok.Data;

@Data
public class LogInfo {
    private Integer id;
    private String message;
    private String message_time;
    private String name;
    private Integer user_id;
}
