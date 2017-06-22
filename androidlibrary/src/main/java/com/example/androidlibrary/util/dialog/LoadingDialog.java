package com.example.androidlibrary.util.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.androidlibrary.R;

/**
 * @author z`guo`an on 2017/4/18 16:34
 */
public class LoadingDialog extends Dialog {

    private static int default_width = 180;
    private static int default_height = 180;

    public LoadingDialog(Context context, int layout) {
        this(context, default_width, default_height, layout);
    }

    public LoadingDialog(Context context) {
        this(context, default_width, default_height, R.layout.layout_dialog);
    }

    public LoadingDialog(Context context, int width, int height, int layout) {
        super(context, R.style.Theme_dialog);
        setContentView(layout);
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();

        float density = getDensity(context);
        params.width = (int) (width * density);
        params.height = (int) (height * density);
        params.gravity = Gravity.CENTER;

        window.setAttributes(params);
    }

    public LoadingDialog(Context context, int width, int height, int layout, int gravity) {
        super(context, R.style.Theme_dialog);
        setContentView(layout);
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();

        float density = getDensity(context);
        params.width = (int) (width * density);
        params.height = (int) (height * density);
        params.gravity = gravity;

        window.setAttributes(params);
    }

    public void showAnimation() {
        AnimationDrawable scanAnimation = (AnimationDrawable) findViewById(R.id.img_progress).getBackground();
        if (scanAnimation != null) {
            scanAnimation.start();
        }
    }

    public void setMessage(String msg) {
        TextView mMessage = (TextView) this.findViewById(R.id.message);
        if (mMessage != null) {
            mMessage.setText(msg);
        }
    }

    private float getDensity(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.density;
    }

}