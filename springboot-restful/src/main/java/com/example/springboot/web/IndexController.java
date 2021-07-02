package com.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(value = "index/{id}")
    public @ResponseBody String index(@PathVariable("id") Integer id){
        return "ID ->"+id;
    }
    @RequestMapping(value = "index/{id}/{name}")
    public @ResponseBody String index2(@PathVariable("id") Integer id,
                                       @PathVariable("name") String name,
                                       Integer age){
        return "ID ->"+id+"  name->"+name+"  age->"+age;
    }

    @RequestMapping(value = "index")
    public @ResponseBody String index3(Integer id,String name,Integer age){
        return "ID ->"+id+"  name->"+name+"  age->"+age;
    }
}
