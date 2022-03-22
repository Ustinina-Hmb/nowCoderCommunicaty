package com.nocoder.community.service;

import com.nocoder.community.entity.DiscussPost;

import java.util.List;


/**
* @author 韩明保
* @description 针对表【discuss_post】的数据库操作Service
* @createDate 2022-03-21 15:19:31
*/
public interface DiscussPostService  {
    List<DiscussPost> findDiscussPosts(int userId,int offset,int limit);
    int findDiscussRows(int userId);
}
