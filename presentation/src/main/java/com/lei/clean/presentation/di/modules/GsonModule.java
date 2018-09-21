package com.lei.clean.presentation.di.modules;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * @author xianglei
 * @created 2018/7/11 14:40
 */
@Module
public class GsonModule {

    @Provides
    Gson provideGson() {
        return new Gson();
    }
}
