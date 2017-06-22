package com.example.zga.contract;

import android.content.Context;

import com.example.zga.bean.UsersBean;

import rx.Observable;

/**
 * @author z`guo`an on 2017/4/13 15:11
 */

public class MainContract {
    //V层数据获取接收数据
    public interface MainView {
        //数据绑定
        void showData(UsersBean usersBean);
        //加载动画
//        void showProgressBar();
    }

    //V发起交互
    public interface MainPresenter {
        void getMainData(Context context);
    }

    //P发起数据请求
    public interface MainModel {
        Observable loadMainData();
    }

}
