package com.example.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springboot.web.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @GetMapping(value = "/student/count")
    public String studentCount(Model model){
        //调用远程接口
        Integer allStudentCount = studentService.queryAllStudentCount();
        model.addAttribute("allStudentCount",allStudentCount);
        return "studentCount";
    }

}
