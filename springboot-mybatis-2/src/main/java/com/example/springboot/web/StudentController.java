package com.example.springboot.web;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "student/detail")
    public @ResponseBody Object queryStudentById(Integer id){
        return studentService.queryStudentById(id);
    }

    @RequestMapping(value = "student/update")
    public @ResponseBody Object updateStudentById(Integer id,Integer age,String name){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        student.setName(name);
        return studentService.updateStudentById(student);
    }
    @RequestMapping(value = "student/test")
    public @ResponseBody Object test(Integer id){
        return "studentService.queryStudentById(id)";
    }
}
