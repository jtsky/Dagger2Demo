package com.jin.daggerdemo;

import android.app.Application;
import android.util.Log;

import com.jin.daggerdemo.bean.UserInfo;
import com.jin.daggerdemo.di.components.AppComponent;
import com.jin.daggerdemo.di.components.DaggerAppComponent;
import com.jin.daggerdemo.di.modules.AppModule;

import javax.inject.Inject;


/**
 * Created by wlw-97 on 2016/9/6.
 */

public class MyAppliction extends Application {
    private final String TAG = "MyAppliction";
    AppComponent mAppComponent;

    @Inject
    UserInfo mUserInfo;


    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();

        mAppComponent.inject(this);
        mUserInfo.setName("ssssss");
        Log.i(TAG, "=====>" + mUserInfo.getName());
    }
}
