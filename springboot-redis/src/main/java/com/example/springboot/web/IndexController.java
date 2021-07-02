package com.example.springboot.web;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
public class IndexController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "index")
    public @ResponseBody Object index(Integer id){
        Student student = studentService.queryStudentById(id);
        return student;
    }

    @RequestMapping(value = "count")
    public @ResponseBody Object count(){
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i=0;i<1000;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Integer count = studentService.queryAllStudentCount();
                }
            });
        }
        executorService.shutdown();
        return 0;
    }
}
