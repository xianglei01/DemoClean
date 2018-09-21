package com.lei.clean.presentation.di.modules;

import com.lei.clean.presentation.MainActivity;
import com.lei.clean.presentation.di.scope.ActivityScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author xianglei
 * @created Activity Module 每一个Activity都必须添加注入
 */
@Module
public abstract class BindingActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = BlankActivityModule.class)
    abstract MainActivity mainActivity();

}
