package com.shenrong.ssm.mybatis.service;

import com.shenrong.ssm.mybatis.dao.RoleMapper;
import com.shenrong.ssm.mybatis.entity.Role;
import com.shenrong.ssm.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/5/30 21:16
 */
public class RoleService {

    public static void main(String[] args) {
        Role role = new Role();
        role.setId(1);
        role.setRoleName("shenrong");
        role.setNote("man");

        SqlSession session = SqlSessionFactoryUtils.openSession();
        RoleMapper roleMapper = session.getMapper("");

    }

}
