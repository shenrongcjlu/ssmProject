package com.shenrong.ssm.mybatis.utils;

import jdk.internal.util.xml.impl.Input;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.logging.Logger;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/5/30 21:06
 */
public class SqlSessionFactoryUtils {

    private static final Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;


    private static SqlSessionFactory sqlSessionFactory;

    private SqlSessionFactoryUtils(){}

    public static SqlSessionFactory getSqlSessionFactory() {
        synchronized (LOCK) {
            if (null != sqlSessionFactory) {
                return sqlSessionFactory;
            }

            InputStream inputStream = null;

            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                return sqlSessionFactory;
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("create sqlSessionFactory fail", e);
            }
        }
    }

    public static SqlSession openSession() {

        synchronized (LOCK) {
            if (null == sqlSessionFactory) {
                getSqlSessionFactory();
            }
        }
        return sqlSessionFactory.openSession();
    }
}
