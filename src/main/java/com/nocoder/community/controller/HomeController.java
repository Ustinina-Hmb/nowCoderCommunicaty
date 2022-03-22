package com.nocoder.community.controller;

import com.nocoder.community.entity.DiscussPost;
import com.nocoder.community.entity.Page;
import com.nocoder.community.entity.User;
import com.nocoder.community.service.DiscussPostService;
import com.nocoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:首页功能的实现
 * @author: hanmingbao
 * @create: 2022-03-21 19:35
 **/
@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @Autowired
    DiscussPostService discussPostService;


    @GetMapping("/index")
    public  String getIndexPage(Model model, Page page){
        System.out.println("index执行");
        page.setPath("/index");
        page.setRows(discussPostService.findDiscussRows(0));
//        查询首页数据
        List<DiscussPost> list = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        //将结果放入map中
        List<Map<String,Object>> listMaps=new ArrayList<>();
        if (list!=null){
            for(DiscussPost item:list){
                Map<String,Object> map=new HashMap<>();
                //将帖子放入map
                map.put("post",item);
                User user = userService.findUserById(Integer.parseInt(item.getUserId()));
                //将用户放入map
                map.put("user", user);
                listMaps.add(map);
            }
        }
        model.addAttribute("discussPosts",listMaps);
        System.out.println(listMaps);
        return "index";
    }

}
