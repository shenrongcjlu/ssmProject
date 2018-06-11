package com.shenrong.ssm.mybatis.main;

import com.shenrong.ssm.mybatis.dao.EmployeeMapper;
import com.shenrong.ssm.mybatis.entity.Employee;
import com.shenrong.ssm.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/5/30 20:21
 */
public class MybatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.getEmployee(1L);

    }
}
