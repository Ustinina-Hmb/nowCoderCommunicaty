package com.nocoder.community.dao;

import com.nocoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
* @author 韩明保
* @description 针对表【discuss_post】的数据库操作Mapper
* @createDate 2022-03-21 15:19:31
* @Entity com.nocoder.community.entity.DiscussPost
*/
@Mapper
public interface DiscussPostMapper  {
    //查询用户发的帖子 offset帖子的当前页的页码，limit表示每页显示多少条
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    //查询出总共有多少条记录  在动态sql中必须使用别名<if>
    int selectDiscussRows(@Param("userId") int userId);
}
