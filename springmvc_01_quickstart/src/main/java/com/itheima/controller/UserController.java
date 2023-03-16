package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//2.定义Controller
//2.1 使用@Controller定义bean
@Controller
public class UserController {

    @RequestMapping("/save")//2.2设置当前操作的访问路径
    @ResponseBody//2.3设置当前操作的返回值类型
    public String save(){
        System.out.println("user save...");
        return "{'module':'springmvc'}";
    }


    @RequestMapping("/delete")//2.2设置当前操作的访问路径
    @ResponseBody//2.3设置当前操作的返回值类型
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'springmvc delete'}";
    }



}
