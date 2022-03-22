package com.nocoder.community.service.impl;

import com.nocoder.community.entity.DiscussPost;
import com.nocoder.community.service.DiscussPostService;
import com.nocoder.community.dao.DiscussPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 韩明保
* @description 针对表【discuss_post】的数据库操作Service实现
* @createDate 2022-03-21 15:19:31
*/
@Service
public class DiscussPostServiceImpl implements DiscussPostService{
    @Autowired
    DiscussPostMapper discussPostMapper;
    @Override
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPosts(userId, offset,limit);

    }

    @Override
    public int findDiscussRows(int userId) {
        return discussPostMapper.selectDiscussRows(userId);
    }
}
