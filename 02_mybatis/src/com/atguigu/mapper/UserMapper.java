package com.atguigu.mapper;

import com.atguigu.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User selectUserById(@Param("id") Integer id);

    List<User> selectUserByNameOrSex(@Param("lastname") String lastName, @Param("sex") Integer sex);

    List<User> selectUserByNameLike(@Param("lastname") String lastName);

    List<User> selectUserForMap(Map<String, Object> map);

}
