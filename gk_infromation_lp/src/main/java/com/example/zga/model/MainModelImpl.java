package com.example.zga.model;

import com.example.zga.Constant;
import com.example.zga.api.Api;
import com.example.zga.bean.UserBean;
import com.example.zga.contract.MainContract;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * @author z`guo`an on 2017/4/13 15:13
 */
public class MainModelImpl implements MainContract.MainModel {

    private Api mApi;
    private static final int DEFAULT_TIMEOUT = 5;

    public MainModelImpl() {

        //手动创建一个OkHttpClient并设置超时时间
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
        httpClientBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        //创建Retrofit的  Observable
        mApi = new Retrofit
                .Builder()
                .baseUrl(Constant.HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build().create(Api.class);
    }

    //实现数据请求接口
    @Override
    public Observable<UserBean> loadMainData() {
        //发起请求
        return mApi.getData();
    }
}
