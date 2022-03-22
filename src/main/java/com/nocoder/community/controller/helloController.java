package com.nocoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

/**
 * @description:
 * @author: hanmingbao
 * @create: 2022-03-20 17:32
 **/
@Controller
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/say")
    @ResponseBody
    public String hello(){
        return  "Hello springBoot";
    }

}
