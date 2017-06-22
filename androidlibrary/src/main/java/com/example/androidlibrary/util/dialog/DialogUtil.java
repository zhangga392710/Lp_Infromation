package com.example.androidlibrary.util.dialog;

import android.content.Context;

/**
 * @author z`guo`an on 2017/4/18 16:34
 */

public class DialogUtil {
    public static LoadingDialog mDialog = null;

    public static void showLoadingDialog(Context ctxt) {
        if (mDialog != null) {
            mDialog.dismiss();
            mDialog = null;
        }
        mDialog = new LoadingDialog(ctxt);
        mDialog.showAnimation();
        mDialog.show();
    }

    public static void showLoadingDialog(Context ctxt, String tips) {
        if (mDialog != null) {
            mDialog.dismiss();
            mDialog = null;
        }
        mDialog = new LoadingDialog(ctxt);
        mDialog.showAnimation();
        mDialog.setMessage(tips);
        mDialog.show();
    }

    public static void dismissLoadingDialog() {
        if (mDialog != null) {
            mDialog.dismiss();
            mDialog = null;
        }
    }
}
