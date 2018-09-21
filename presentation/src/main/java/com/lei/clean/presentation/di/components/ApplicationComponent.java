package com.lei.clean.presentation.di.components;

import android.app.Application;

import com.lei.clean.presentation.App;
import com.lei.clean.presentation.di.modules.ApplicationModule;
import com.lei.clean.presentation.di.modules.BindingActivityModule;
import com.lei.clean.presentation.di.modules.BindingFragmentModule;
import com.lei.clean.presentation.di.modules.BindingServiceModule;
import com.lei.clean.presentation.di.modules.GsonModule;
import com.lei.clean.presentation.di.modules.UseModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        BindingActivityModule.class,
        BindingFragmentModule.class,
        BindingServiceModule.class,
        GsonModule.class,
        UseModule.class,
        AndroidSupportInjectionModule.class
})
public interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        ApplicationComponent.Builder application(Application application);

        ApplicationComponent build();
    }

}
