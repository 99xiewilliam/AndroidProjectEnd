package com.example.androidproject.dao;

import com.example.androidproject.entity.LogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LogInfoMapper {
    List<LogInfo> getLogs(Integer user_id);
    Integer insertLog(LogInfo logInfo);
}
