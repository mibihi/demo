package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController2 {
    @RequestMapping(value = "hello2")
    public String hello2(){

        return  "index";
    }
}
