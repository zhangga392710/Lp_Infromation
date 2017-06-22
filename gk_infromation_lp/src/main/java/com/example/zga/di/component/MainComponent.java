package com.example.zga.di.component;

import com.example.zga.di.moudel.MainModule;
import com.example.zga.persenter.MainPresenterImpl;

import dagger.Component;

/**
 * @author z`guo`an on 2017/4/13 15:30
 */
//注入器， @Inject @Module 的桥梁
@Component(modules = MainModule.class)
public interface MainComponent {
    MainPresenterImpl getPresenter();
}
