package com.example.zga.di.moudel;

import com.example.zga.contract.MainContract;

import dagger.Module;
import dagger.Provides;

/**
 * @author z`guo`an on 2017/4/13 15:23
 * @Module 注解，这样Dagger在构造类的实例的时候，就知道从哪里去找到需要的依赖。
 */
//提供依赖
@Module
public class MainModule {

    private MainContract.MainView mMainView;

    //Module的构造器，传入一个MainView， 提供给Component
    public MainModule(MainContract.MainView mMainView) {
        this.mMainView = mMainView;
    }

    /**
     * @return
     * @Provide: 在modules中，我们定义的方法是用这个注解，以此来告诉Dagger我们想要构造对象并提供这些依赖。
     */

    //Provides注解代表提供的参数，为构造器传进来的
    //告诉Dagger我们想要构造对象并提供这些依赖。
    @Provides
    public MainContract.MainView inject() {
        return mMainView;
    }

}
