package com.shenrong.ssm.mybatis.dao;

import com.shenrong.ssm.mybatis.entity.Employee;

public interface EmployeeMapper {
    Employee getEmployee(Long id);
}
