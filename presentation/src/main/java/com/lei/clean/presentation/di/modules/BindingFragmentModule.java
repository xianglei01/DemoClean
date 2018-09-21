package com.lei.clean.presentation.di.modules;


import com.lei.clean.presentation.di.components.BaseFragmentSubcomponent;

import dagger.Module;


/**
 * @author xianglei
 * @created 2018/7/9 14:23
 * <p>
 * Fragment Module(每一个Fragment都必须添加)
 */
@Module(subcomponents = BaseFragmentSubcomponent.class)
public abstract class BindingFragmentModule {

//    @FragmentScoped
//    @ContributesAndroidInjector(modules = BlankFragmentModule.class)
//    abstract HomeFragment homeFragment();


}
