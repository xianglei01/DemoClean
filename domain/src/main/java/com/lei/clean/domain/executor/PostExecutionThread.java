package com.lei.clean.domain.executor;

import io.reactivex.Scheduler;

/**
 * @author: xianglei.
 * data: 2018/7/8 13:54.
 */
public interface PostExecutionThread {
    Scheduler getScheduler();
}
