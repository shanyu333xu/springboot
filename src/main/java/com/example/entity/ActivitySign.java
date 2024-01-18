package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *@Author：xys
 *@Date：2023-12-24-11:37
 *@Description：com.example.entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivitySign {
    private Integer id;
    private Integer userId;
    private Integer activityId;

    private String time;

    private String activityName;
    private String userName;

}
