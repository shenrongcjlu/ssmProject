package com.shenrong.ssm.mybatis.dao;

import com.shenrong.ssm.mybatis.entity.Task;

public interface TaskMapper {
    Task getTask(Long id);
}
