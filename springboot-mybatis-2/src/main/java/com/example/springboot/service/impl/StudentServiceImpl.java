package com.example.springboot.service.impl;

import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int updateStudentById(Student student) {
        int updateCount = studentMapper.updateByPrimaryKey(student);
        return updateCount;
    }
}
