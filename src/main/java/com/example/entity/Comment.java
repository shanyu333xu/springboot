package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 *@Author：xys
 *@Date：2023-12-23-10:59
 *@Description：com.example.entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    /** ID */
    private Integer id;
    /** 内容 */
    private String content;
    /** 评论人 */
    private Integer userId;
    /** 父级ID */
    private Integer pid;
    /** 根节点ID */
    private Integer rootId;
    /** 评论时间 */
    private String time;


    /** 博客ID 关联 通用 所有模块的评论区关联*/
    private Integer fid;
    /*区分出这个模块是博客 还是 活动 */
    private String module;
    private String userName;
    private String avatar;
    private List<Comment> children;
    private String replyUser;//回复给谁 就是谁的名称

}
