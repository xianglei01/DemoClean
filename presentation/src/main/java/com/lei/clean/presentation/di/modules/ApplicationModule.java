package com.lei.clean.presentation.di.modules;

import android.app.Application;
import android.content.Context;

import com.lei.clean.data.executor.JobExecutor;
import com.lei.clean.domain.executor.PostExecutionThread;
import com.lei.clean.domain.executor.ThreadExecutor;
import com.lei.clean.presentation.UIThread;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ApplicationModule {

    @Singleton
    @Binds
    abstract Context provideApplicationContext(Application application);

    @Singleton
    @Binds
    abstract ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor);

    @Singleton
    @Binds
    abstract PostExecutionThread providePostExecutionThread(UIThread uiThread);

}
