package com.example.androidlibrary;

import android.app.Application;
import android.content.Context;

/**
 * @author z`guo`an on 2017/4/18 16:27
 */

public class BaseApplication extends Application {

    protected static BaseApplication instance;
    protected static Context context;

    public static BaseApplication getInstance() {
        if (instance == null) {
            instance = new BaseApplication();
        }
        return instance;
    }

}
