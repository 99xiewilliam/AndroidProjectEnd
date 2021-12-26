package com.example.androidproject.service;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.entity.LogInfo;


public interface LogInfoService {
    JSONObject getLogs(Integer user_id);
    JSONObject InsertLog(LogInfo logInfo);
}
