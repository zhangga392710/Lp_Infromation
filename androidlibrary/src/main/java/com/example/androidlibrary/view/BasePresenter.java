package com.example.androidlibrary.view;


/**
 * @author z`guo`an on 2017/4/17 09:30
 * Redefine the form statement cycle
 */

public interface  BasePresenter<T> {

    void attachView(T view);

    void detachView();

}
