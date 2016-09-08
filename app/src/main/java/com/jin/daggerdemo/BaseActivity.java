package com.jin.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jin.daggerdemo.bean.UserInfo;
import com.jin.daggerdemo.bean.UserInfo2;
import com.jin.daggerdemo.di.components.ActivityComponent;
import com.jin.daggerdemo.di.components.AppComponent;
import com.jin.daggerdemo.di.components.DaggerActivityComponent;
import com.jin.daggerdemo.di.modules.ActivityModule;

import javax.inject.Inject;

/**
 * Created by wlw-97 on 2016/9/7.
 */

public class BaseActivity extends AppCompatActivity {
    MyAppliction mAppliction;
    AppComponent mAppComponent;
    ActivityComponent mActivityComponent;

    @Inject
    UserInfo mUserInfo;

    @Inject
    UserInfo2 mUserInfo2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAppliction = (MyAppliction) getApplication();
        mAppComponent = mAppliction.getAppComponent();

        mActivityComponent = DaggerActivityComponent
                .builder()
                .appComponent(mAppComponent)
                .activityModule(new ActivityModule())
                .build();

        mActivityComponent.inject(this);
    }
}
