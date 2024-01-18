package com.example.entity;

/*
 *@Author：xys
 *@Date：2023-12-22-11:34
 *@Description：com.example.entity
 */


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    /** ID */
    private Integer id;
    /** 活动名称 */
    private String name;
    /** 活动简介 */
    private String descr;
    /** 开始时间 */
    private String start;
    /** 结束时间 */
    private String end;
    /** 活动形式 */
    private String form;
    /** 活动地址 */
    private String address;
    /** 主办方 */
    private String host;
    /** 浏览量 */
    private Integer readCount;
    private String content;
    private String cover;

    private Boolean isEnd;//活动是否结束
    private Boolean isSign;//是否报名

    private Integer likesCount;
    private Integer collectCount;
    private Boolean isLike;
    private  Boolean isCollect;
    private Integer userId;

    public void setIsEnd(Boolean end) {
        isEnd = end;
    }


}