package com.jin.daggerdemo.bean;

/**
 * Created by wlw-97 on 2016/9/6.
 */
public class UserInfo {
    String name;

    public void setName(String name) {
        this.name = name;
    }


    public UserInfo() {
    }

    public String getName() {
        if (name == null)
            return "UserInfo";

        return name;
    }
}
