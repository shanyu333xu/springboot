package com.example.common.enums;

/*
 *@Author：xys
 *@Date：2023-12-22-23:38
 *@Description：com.example.common.enums
 */

public enum LikesModuleEnum {
    BLOG("博客"),
    ACTIVITY("活动");
    private String value;

    public String getValue() {
        return value;
    }

    LikesModuleEnum(String value) {
        this.value = value;
    }
}
