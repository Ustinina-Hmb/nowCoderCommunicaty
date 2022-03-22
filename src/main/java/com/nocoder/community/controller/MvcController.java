package com.nocoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: hanmingbao
 * @create: 2022-03-20 21:19
 **/
@Controller
public class MvcController {
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    @ResponseBody
    public  String student(@PathVariable("id") int id){
        System.out.println(id);
        return id+"这个学号的学生";
    }
    @RequestMapping(path = "/students",method = RequestMethod.GET)
    @ResponseBody
    public  String getstudents(
            @RequestParam(name = "current",required = false,defaultValue = "1" ) int current,
            @RequestParam(name = "limit",required = false,defaultValue = "10" ) int limit)
    {

        return limit+"--"+current+"students";

    }
    @GetMapping("/view")
    public ModelAndView view(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("name",999);
        modelAndView.addObject("password",909090);
        modelAndView.setViewName("/demo/view");
        return modelAndView;
    }
    @GetMapping("/view1")
    public  String getview(Model model){
        model.addAttribute("Stringmodel","这是个stringview");
        return  "/demo/view";
    }

    @GetMapping("/emp")
    @ResponseBody
    public Map<String,Object> getString(){
        Map<String,Object> map=new HashMap<>();
        map.put("name", "张三");
        map.put("age", 19);
        return map;
    }



}

