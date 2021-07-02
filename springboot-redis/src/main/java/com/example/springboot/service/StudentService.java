package com.example.springboot.service;

import com.example.springboot.model.Student;

public interface StudentService {
    Student queryStudentById(Integer id);
    /**
     * 获取学生总人数
     */
    Integer queryAllStudentCount();
}
