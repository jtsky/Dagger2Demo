package com.jin.daggerdemo.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by wlw-97 on 2016/9/7.
 */

@Scope
@Retention(RUNTIME)
public @interface PreActivity {
}
