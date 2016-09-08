package com.jin.daggerdemo.di.modules;

import com.jin.daggerdemo.bean.UserInfo2;
import com.jin.daggerdemo.di.scope.PreActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wlw-97 on 2016/9/6.
 */

@Module
public class ActivityModule {

    @PreActivity
    @Provides
    public UserInfo2 provideUserInfo2() {
        return new UserInfo2();
    }


}
