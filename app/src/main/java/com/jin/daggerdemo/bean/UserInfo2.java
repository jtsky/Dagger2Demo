package com.jin.daggerdemo.bean;

/**
 * Created by wlw-97 on 2016/9/6.
 */
public class UserInfo2 {
    String name;

    public void setName(String name) {
        this.name = name;
    }


    public UserInfo2() {
    }

    public String getName() {
        if (name == null)
            return "UserInfo2";

        return name;
    }
}
