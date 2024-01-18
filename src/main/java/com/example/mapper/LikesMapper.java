package com.example.mapper;

/*
 *@Author：xys
 *@Date：2023-12-22-23:28
 *@Description：com.example.mapper
 */

import com.example.entity.Likes;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {

    void insert(Likes likes);

    Likes selectUserLikes(Likes likes);

    void deleteById(Integer id);

    int selectByFidAndModule(@Param("fid") Integer fid, @Param("module") String module);
}
