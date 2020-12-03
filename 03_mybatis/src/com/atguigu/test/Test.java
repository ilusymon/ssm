package com.atguigu.test;

import com.atguigu.bean.User;
import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/10/26 11:18
 */
public class Test {
    static SqlSession getSqlSession() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    static UserMapper getUserMapper() {

        return getSqlSession().getMapper(UserMapper.class);
    }

    @org.junit.Test
    public void t0() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // System.out.println(mapper.getUsersByNameAndSex(new User(null, "lisa", 0)));
        Random random = new Random();
        ArrayList<User> users = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                name.append((char) (random.nextInt('z' - 'a') + 'a'));
            }
            users.add(new User(null, name.toString(), random.nextInt(2)));
        }
        mapper.insertUsersBatch(users);
        sqlSession.commit();
    }

}
