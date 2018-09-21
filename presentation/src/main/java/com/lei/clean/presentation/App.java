package com.lei.clean.presentation;


import android.content.Context;

import com.lei.clean.presentation.di.components.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author xianglei
 * @created 2018/9/21 16:36
 */
public class App extends DaggerApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent.builder().application(this).build();
    }
}
