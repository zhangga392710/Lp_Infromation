package com.example.zga.view.activity.commonality;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.androidlibrary.util.ToastUtil;
import com.example.zga.R;
import com.example.zga.databinding.LoginDataBind;

/**
 * @author z`guo`an on 2017/4/19 09:19
 */

public class Login_Acty extends Activity {

    LoginDataBind mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.acty_login);
        ToastUtil.showMessage("初始化成功");
    }

    public void Login (View view){
        Intent intent = new Intent();
        intent.setClass(this,Select_Acty.class);
        startActivity(intent);
    }
}
