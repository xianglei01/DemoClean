package com.lei.clean.domain.repository;

import com.lei.clean.domain.model.Demo;

/**
 * @author xianglei
 * @created 2018/7/16 15:02
 */
public interface PreferenceRepository {

    void setDemo(Demo demo);

    Demo getDemo();
}
