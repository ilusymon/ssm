package com.atguigu.mapper;

import com.atguigu.bean.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> getStusByClazzId(Integer clazzId);
}
