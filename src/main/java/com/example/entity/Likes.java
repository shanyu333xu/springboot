package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *@Author：xys
 *@Date：2023-12-22-23:31
 *@Description：com.example.entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Likes {
    private int id;
    private int fid;
    private int userId;

    private String module;

}
