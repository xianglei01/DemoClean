package com.lei.clean.data.repository;

import android.content.Context;

import com.lei.clean.domain.model.Demo;
import com.lei.clean.domain.repository.RemoteRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author xianglei
 * @created 2018/7/17 14:23
 */
public class RemoteImplRepository implements RemoteRepository {

    private final PreferenceImplRepository appPreferencesHelper;
    private final Context context;

    @Inject
    RemoteImplRepository(PreferenceImplRepository preferenceImplRepository, Context context) {
        this.appPreferencesHelper = preferenceImplRepository;
        this.context = context;
    }

    @Override
    public Observable<Demo> demo(Demo demo) {
        return null;
    }
}
