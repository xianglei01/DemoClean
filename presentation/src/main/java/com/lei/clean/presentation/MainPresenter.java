package com.lei.clean.presentation;

import com.lei.clean.domain.interactor.MainUseCase;
import com.lei.clean.domain.model.Demo;
import com.lei.clean.presentation.http.DefaultObserver;

import javax.inject.Inject;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private final MainUseCase mMainUseCase;

    @Inject
    MainPresenter(MainUseCase mainUseCase){
        this.mMainUseCase = mainUseCase;
    }

    @Override
    public void attachView(MainContract.View view) {
        mView = view;
    }

    @Override
    public void demo() {
        mMainUseCase.execute(new DefaultObserver<Demo>() {
            @Override
            public void onNext(Demo demo) {

            }

            @Override
            public void onError(Throwable e) {

            }
        }, new Demo());

    }

    @Override
    public void onDestroy() {
        mMainUseCase.dispose();
    }


}
