package com.jin.daggerdemo.di.components;

import com.jin.daggerdemo.BaseActivity;
import com.jin.daggerdemo.bean.UserInfo2;
import com.jin.daggerdemo.di.modules.ActivityModule;
import com.jin.daggerdemo.di.scope.PreActivity;

import dagger.Component;

/**
 * Created by wlw-97 on 2016/9/6.
 */
@PreActivity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(BaseActivity activity);

    UserInfo2 getUserInfo2();


}
