package com.lei.clean.domain.interactor;

import com.lei.clean.domain.executor.PostExecutionThread;
import com.lei.clean.domain.executor.ThreadExecutor;
import com.lei.clean.domain.model.Demo;
import com.lei.clean.domain.repository.RemoteRepository;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * @author xianglei
 * @created 2018/9/21 16:50
 */
public class MainUseCase extends UseCase<Demo, Demo> {

    private final RemoteRepository remoteRepository;

    @Inject
    MainUseCase(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, RemoteRepository remoteRepository) {
        super(threadExecutor, postExecutionThread);
        this.remoteRepository = remoteRepository;
    }

    @Override
    Observable<Demo> buildUseCaseObservable(Demo demo) {
        return remoteRepository.demo(demo);
    }
}
