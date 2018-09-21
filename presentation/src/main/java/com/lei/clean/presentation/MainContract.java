package com.lei.clean.presentation;

/**
 * @author xianglei
 * @created 2018/9/21 16:31
 */
public class MainContract {

    interface View{

    }

    interface Presenter{
        void attachView(View view);

        void demo();

        void onDestroy();
    }
}
