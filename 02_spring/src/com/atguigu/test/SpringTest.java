package com.atguigu.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlShowColumnOutpuVisitor;
import com.atguigu.bean.Book;
import com.atguigu.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.aop.TargetSource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

/**
 * @author Symon
 * @version 1.0
 * @className SpringTest
 * @description TODO
 * @date 2020/10/28 19:54
 */
public class SpringTest {

    @Test
    public void test() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        PreparedStatement statement = connection.prepareStatement("select * from book where id<=?");
        statement.setInt(1, 100);
        ResultSet resultSet = statement.executeQuery();
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            System.out.println(metaData.getColumnLabel(i + 1));
        }
        while (resultSet.next()) {
            Book book = null;
            for (int i = 0; i < columnCount; i++) {
                // System.out.println(metaData.getColumnLabel(i + 1));
                book = new Book(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getString(7));
            }
            System.out.println(book);
        }

        /*for (int i = 0; i < columnCount; i++) {
            String columnLabel = metaData.getColumnLabel(i + 1);
            Object object = resultSet.getObject(columnLabel);
            System.out.println(object);

        }*/
    }


    @Test
    public void testSpringEL() {
        ApplicationContext context = new ClassPathXmlApplicationContext("EL.xml");
        User user = context.getBean("user1", User.class);
        System.out.println(user);

    }

    @Test
    public void testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        // System.out.println(context.getBean("car"));
        // System.out.println(context.getBean("car"));
        System.out.println(context.getBean("carDao"));
        System.out.println(context.getBean("carDaoExt"));
        System.out.println(context.getBean("carService"));
        System.out.println(context.getBean("carController"));
    }


}
