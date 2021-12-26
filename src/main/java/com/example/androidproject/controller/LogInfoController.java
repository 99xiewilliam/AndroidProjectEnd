package com.example.androidproject.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.entity.LogInfo;
import com.example.androidproject.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogInfoController {
    @Autowired
    private LogInfoService logInfoService;

    @GetMapping("/getLogs")
    public JSONObject getLogs(Integer user_id) {
        return  logInfoService.getLogs(user_id);
    }

    @PostMapping("insertLog")
    public JSONObject insertLog(Integer user_id, String name, String message) {
        LogInfo logInfo = new LogInfo();
        logInfo.setMessage(message);
        logInfo.setName(name);
        logInfo.setUser_id(user_id);

        return logInfoService.InsertLog(logInfo);
    }
}
