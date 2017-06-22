package com.example.zga;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.example.androidlibrary.BaseApplication;

import java.util.HashSet;
import java.util.Set;

/**
 * @author z`guo`an on 2017/4/18 16:31
 */

public class MyApplications extends BaseApplication {

    private Set<Activity> allActivities;

    public static int SCREEN_WIDTH = -1;

    public static int SCREEN_HEIGHT = -1;

    public static float DIMEN_RATE = -1.0F;

    public static int DIMEN_DPI = -1;

    @Override

    public void onCreate() {
        super.onCreate();
        instance = this;
        context = this.getApplicationContext();

        getScreenSize();
    }

    /**
     * 初始化屏幕宽高
     */

    public void getScreenSize() {
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        Display display = windowManager.getDefaultDisplay();
        display.getMetrics(dm);
        DIMEN_RATE = dm.density / 1.0F;
        DIMEN_DPI = dm.densityDpi;
        SCREEN_WIDTH = dm.widthPixels;
        SCREEN_HEIGHT = dm.heightPixels;
        if (SCREEN_WIDTH > SCREEN_HEIGHT) {
            int t = SCREEN_HEIGHT;
            SCREEN_HEIGHT = SCREEN_WIDTH;
            SCREEN_WIDTH = t;
        }
    }

    /**
     * 添加activity
     */

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }

    /**
     * 移除activity
     */

    public void removeActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }

    /**
     * 退出app
     */

    public void exitApp() {

        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
