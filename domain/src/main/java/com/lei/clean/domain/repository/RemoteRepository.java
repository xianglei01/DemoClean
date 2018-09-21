package com.lei.clean.domain.repository;

import com.lei.clean.domain.model.Demo;

import io.reactivex.Observable;

/**
 * @author xianglei
 * @created 2018/7/17 14:20
 */
public interface RemoteRepository {

    Observable<Demo> demo(Demo demo);

}
