package com.shenrong.ssm.mybatis.dao;

import com.shenrong.ssm.mybatis.entity.WorkCard;

public interface WorkCardMapper {
    WorkCard getWorkCard(Long empId);
}
