package com.lei.clean.presentation.di.components;

import android.support.v4.app.Fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * @author xianglei
 * @created 2018/7/9 14:23
 *
 * Fragment组件
 */
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface BaseFragmentSubcomponent extends AndroidInjector<Fragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Fragment>{

    }
}
