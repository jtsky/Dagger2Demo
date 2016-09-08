package com.jin.daggerdemo.di.components;

import android.content.Context;

import com.jin.daggerdemo.BaseActivity;
import com.jin.daggerdemo.MyAppliction;
import com.jin.daggerdemo.bean.UserInfo;
import com.jin.daggerdemo.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wlw-97 on 2016/9/6.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context getContext();

    UserInfo getUserInfo();

    void inject(MyAppliction appliction);



}
