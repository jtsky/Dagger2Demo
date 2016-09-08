package com.jin.daggerdemo.di.modules;

import android.content.Context;

import com.jin.daggerdemo.bean.UserInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wlw-97 on 2016/9/6.
 */

@Module
public class AppModule {
    private Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }


    @Singleton
    @Provides
    public Context provideContext() {
        return mContext;
    }

    @Singleton
    @Provides
    public UserInfo provideUserInfo() {
        return new UserInfo();
    }


}
