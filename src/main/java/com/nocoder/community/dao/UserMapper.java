package com.nocoder.community.dao;

import com.nocoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectByid(int id);
    User  selectByName(String name);
    User selectByEmail(String email);
    int insertUser(User user);
    int updateStatus(int id ,int status);//根据id更细身份
    int updateHeader(int id,String headrUrl);//更新头像
    int updatePassword(int id,String password);
}
