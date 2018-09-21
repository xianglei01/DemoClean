package com.lei.clean.presentation.di.modules;


import com.lei.clean.data.repository.PreferenceImplRepository;
import com.lei.clean.data.repository.RemoteImplRepository;
import com.lei.clean.domain.repository.PreferenceRepository;
import com.lei.clean.domain.repository.RemoteRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * @author xianglei
 * @created 2018/7/11 14:40
 * <p>
 * 自定义接口使用Inject必须添加
 */
@Module
public interface UseModule {

    @Singleton
    @Binds
    PreferenceRepository providePreferenceRepository(PreferenceImplRepository preferenceImplRepository);

    @Singleton
    @Binds
    RemoteRepository provideRemoteRepository(RemoteImplRepository remoteImplRepository);

}

