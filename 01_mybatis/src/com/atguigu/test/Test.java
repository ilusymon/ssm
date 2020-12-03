package com.atguigu.test;

import com.atguigu.bean.User;
import com.atguigu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/10/24 10:21
 */
public class Test {
    SqlSession getSqlSession() {
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
    public void test() throws IOException {
        UserMapper mapper = getUserMapper();
        User user = mapper.getUserById(1);
        //System.out.println(sqlSession);
        //User user = (User) sqlSession.selectOne("com.atguigu.mapper.UserMapper.getUserById", 1);
        System.out.println(user);
    }

    @org.junit.Test
    public void testInsert() {
        SqlSession sqlSession = getSqlSession();
        User user = new User(null, "lisa", 0);
        sqlSession.insert("insertUser", user);
        System.out.println(user.getId());
        sqlSession.commit();
        //getUserMapper().insertUser(new User(null, "Tom", 1));
    }

    @org.junit.Test
    public void testFindAll() {
        UserMapper userMapper = getUserMapper();
        List<User> allUsers = userMapper.findAllUsers();
        allUsers.forEach(System.out::println);
        getSqlSession().close();
    }
}
