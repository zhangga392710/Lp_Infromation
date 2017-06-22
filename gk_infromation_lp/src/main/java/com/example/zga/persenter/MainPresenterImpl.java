package com.example.zga.persenter;

import android.content.Context;
import android.util.Log;

import com.example.androidlibrary.util.ToastUtil;
import com.example.androidlibrary.util.dialog.DialogUtil;
import com.example.zga.bean.UsersBean;
import com.example.zga.contract.MainContract;
import com.example.zga.model.MainModelImpl;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author z`guo`an on 2017/4/13 15:03
 */

public class MainPresenterImpl implements MainContract.MainPresenter {
    private MainContract.MainView mMainView;
    private MainContract.MainModel mMainModel;

    /**
     * @param mainView
     * @Inject 通常在需要依赖的地方使用这个注解。换句话说，你用它告诉Dagger这个类或者字段需要依赖注入
     */
    @Inject
    public MainPresenterImpl(MainContract.MainView mainView) {
        mMainView = mainView;
        //父类 new 子类
        mMainModel = new MainModelImpl();
    }

    //实现交互接口
    @Override
    public void getMainData(Context context) {
        if (true) {
            DialogUtil.showLoadingDialog(context, "数据加载中");
            mMainView.showData(new UsersBean());
            DialogUtil.dismissLoadingDialog();
        } else {
            //实现数据请求的接口
            /**
             * Rxjava在和Retrofit搭配使用的时候，Retrofit的API会返回一个Observable给你，
             * 然后Rxjava的强大之处就体现出来了，可以随意切换线程！
             * 比如我们拿到Retrofit返回的observable，想让他在工作线程访问网络，
             * 直接调用subscribeOn（Schedulers.io()），在拿到数据回到Subscriber的时候，
             * 只需要调用observeOn(AndroidSchedulers.mainThread())即可，完全抛弃了Handler
             */
            mMainModel.loadMainData()
                    .observeOn(AndroidSchedulers.mainThread()) //拿到数据的时候在主线程
                    .subscribeOn(Schedulers.io())//访问数据在工作线程
                    .subscribe(new Subscriber<UsersBean>() {
                        @Override
                        public void onCompleted() {
                            //当所有onNext()执行完毕后处罚
                            DialogUtil.dismissLoadingDialog();
                        }

                        @Override
                        public void onError(Throwable e) {
                            //错误的时候触发
                            ToastUtil.showMessage("网络异常");
                        }

                        @Override
                        public void onNext(UsersBean apiBean) {
                            //当sampleObservable发生事件的时候触发
                            Log.e("wing", "onNext");
                            //调用数据绑定接口
                            mMainView.showData(apiBean);
                        }

                    });
        }
    }

//        .flatMap(new Func1<String, Observable<User>>() {  //得到token后获取用户信息
//            @Override
//            public Observable<User> onNext(String token) {
//                return service.getUser(token);
//            })
//
//
//            subscribeOn(Schedulers.newThread())//请求在新的线程中执行请求
//
//
//            observeOn(Schedulers.io())         //请求完成后在io线程中执行
//
//
//            doOnNext(new Action1<User>() {      //保存用户信息到本地
//                @Override
//                public void call (User userInfo){
//                    saveUserInfo(userInfo);
//                }
//            })
//
//            observeOn(AndroidSchedulers.mainThread())//在主线程中执行
//
//
//            subscribe(new Observer<User>() {
//                @Override
//                public void onNext (User user){
//                    //完成一次完整的登录请求
//                    userView.setUser(user);
//                }
//
//                @Override
//                public void onCompleted () {
//
//                }
//
//                @Override
//                public void onError (Throwable error){
//                    //请求失败
//                }
//            });
//    }


}
