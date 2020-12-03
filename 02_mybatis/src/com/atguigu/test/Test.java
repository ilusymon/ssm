package com.atguigu.test;

import com.atguigu.bean.Clazz;
import com.atguigu.bean.Key;
import com.atguigu.mapper.ClazzMapper;
import com.atguigu.mapper.KeyMapper;
import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

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

    UserMapper getUserMapper() {

        return getSqlSession().getMapper(UserMapper.class);
    }


    @org.junit.Test
    public void t0() {
        UserMapper mapper = getUserMapper();
        // System.out.println(mapper.selectUserById(5));
        // System.out.println(mapper.selectUserByNameOrSex("lisa", 1));
        // System.out.println(mapper.selectUserByNameLike("li"));
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "lisa");
        map.put("sex", 1);
        System.out.println(mapper.selectUserForMap(map));
    }

    @org.junit.Test
    public void t1() {
        KeyMapper mapper = getSqlSession().getMapper(KeyMapper.class);
        System.out.println(mapper.getKeyById(1));
    }

    @org.junit.Test
    public void t2() {
        KeyMapper mapper = getSqlSession().getMapper(KeyMapper.class);
        System.out.println(mapper.queryKeyById(1).getName());
    }

    @org.junit.Test
    public void t3() {
        ClazzMapper mapper = getSqlSession().getMapper(ClazzMapper.class);
        Clazz clazz = mapper.getClazzById(2);
        System.out.println(clazz.getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clazz.getStus().forEach(System.out::println);
    }

}
