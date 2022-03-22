package com.nocoder.community;

import com.nocoder.community.dao.DiscussPostMapper;
import com.nocoder.community.dao.UserMapper;
import com.nocoder.community.entity.DiscussPost;
import com.nocoder.community.entity.User;
import com.nocoder.community.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @description:
 * @author: hanmingbao
 * @create: 2022-03-21 14:50
 **/

@SpringBootTest
public class MapperTest{
    @Autowired
    UserMapper userMapper;
    @Test
    public void testuserMapper(){
        System.out.println(userMapper.selectByid(1));
        System.out.println(userMapper.selectByEmail("nowcoder24@sina.com"));
        System.out.println(userMapper.selectByName("nowcoder23"));
        User user=new User();
        user.setCreateTime(new Date());
//        user.setActivationCode();
        user.setEmail("2345@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setUsername("zhangsan");
        user.setPassword("1234");
        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.getId());
    }

    @Test
    public  void testupdate(){
        int i = userMapper.updateHeader(150, "http://www.nowcoder.com/111.png");
        System.out.println(i);
        int i1 = userMapper.updatePassword(150, "33333");
        System.out.println(i1);
        int i2 = userMapper.updateStatus(150, 1);
        System.out.println(i2);

    }
    @Autowired
    DiscussPostMapper discussPostMapper;
    @Test
    public void testDisussPostMapper(){
//        System.out.println();
        for(DiscussPost item:discussPostMapper.selectDiscussPosts(101, 1, 10)){
            System.out.println(item);
        }
        System.out.println(discussPostMapper.selectDiscussRows(101));
    }
    @Autowired
    UserService userService;
    @Test
    public  void  teestUserService(){
        System.out.println(userService.findUserById(101));
    }
}
