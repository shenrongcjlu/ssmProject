package com.shenrong.ssm.mybatis.dao;

import com.shenrong.ssm.mybatis.entity.EmployeeTask;

public interface EmployeeTaskMapper {
    EmployeeTask getEmployeeTaskByEmpId(long empId);
}
