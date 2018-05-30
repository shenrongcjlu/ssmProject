package com.shenrong.ssm.mybatis.main;

import com.shenrong.ssm.mybatis.dao.RoleMapper;
import com.shenrong.ssm.mybatis.entity.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/5/30 20:21
 */
public class MybatisTest {
    public static void main(String[] args) {
        InputStream in;
        try {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

            Role role = new Role();
            role.setId(1);
            role.setRoleName("shenrong");
            role.setNote("man");

            SqlSession session = sqlSessionFactory.openSession();

            RoleMapper roleMapper = session.getMapper(RoleMapper.class);
            roleMapper.insertRole(role);

            session.commit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
