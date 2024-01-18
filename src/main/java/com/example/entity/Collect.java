package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *@Author：xys
 *@Date：2023-12-23-10:44
 *@Description：com.example.entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collect {
    private int id;
    private int fid;
    private int userId;

    private String module;

}
