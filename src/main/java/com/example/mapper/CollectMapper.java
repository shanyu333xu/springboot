package com.example.mapper;

/*
 *@Author：xys
 *@Date：2023-12-23-10:46
 *@Description：com.example.mapper
 */


import com.example.entity.Collect;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {

    void insert(Collect collect);

    Collect selectUserCollect(Collect collect);

    void deleteById(Integer id);

    int selectByFidAndModule(@Param("fid") Integer fid, @Param("module") String module);
}