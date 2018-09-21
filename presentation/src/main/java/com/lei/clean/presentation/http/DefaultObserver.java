package com.lei.clean.presentation.http;

import io.reactivex.observers.DisposableObserver;

public abstract class DefaultObserver<T> extends DisposableObserver<T> {


    public DefaultObserver() {
    }

    @Override
    public void onComplete() {
    }

}
