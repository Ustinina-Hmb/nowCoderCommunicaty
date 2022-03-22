package com.nocoder.community.service.impl;

import com.nocoder.community.dao.UserMapper;
import com.nocoder.community.entity.User;
import com.nocoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: hanmingbao
 * @create: 2022-03-21 17:52
 **/
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserById(int id) {
        return userMapper.selectByid(id);
    }
}
