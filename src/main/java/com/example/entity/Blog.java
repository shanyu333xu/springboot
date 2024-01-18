package com.example.entity;

/*
 *@Author：xys
 *@Date：2023-12-22-9:39
 *@Description：com.example.entity
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * 博客信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    /** ID */
    private Integer id;
    /** 标题 */
    private String title;
    /** 内容 */
    private String content;
    /** 简介 */
    private String descr;
    /** 封面 */
    private String cover;
    /** 标签 */
    private String tags;
    /** 发布人ID */
    private Integer userId;
    /** 发布日期 */
    private String date;
    /** 浏览量 */
    private Integer readCount;
    private Integer categoryId;

    private String categoryName;
    private String userName;
    private User user;
    private Integer likesCount;

    private boolean userLike;

    private Integer CollectCount;
    private boolean userCollect;

    //判断比较的对象是否一致
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(id, blog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
