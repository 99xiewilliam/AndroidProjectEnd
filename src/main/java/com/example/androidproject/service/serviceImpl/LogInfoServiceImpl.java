package com.example.androidproject.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.example.androidproject.dao.LogInfoMapper;
import com.example.androidproject.entity.LogInfo;
import com.example.androidproject.entity.messages;
import com.example.androidproject.service.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LogInfoServiceImpl implements LogInfoService {
    @Autowired
    private LogInfoMapper logInfoMapper;

    @Override
    public JSONObject getLogs(Integer user_id) {
        List<LogInfo> logInfos = logInfoMapper.getLogs(user_id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("logs", logInfos);
        return jsonObject;
    }

    @Override
    public JSONObject InsertLog(LogInfo logInfo) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateTime = simpleDateFormat.format(date);
        logInfo.setMessage_time(dateTime);
        Integer judge = logInfoMapper.insertLog(logInfo);

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
