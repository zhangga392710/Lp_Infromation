package com.example.zga.view.activity.commonality;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.androidlibrary.util.ToastUtil;
import com.example.zga.R;
import com.example.zga.databinding.SelectDataBind;

/**
 * @author z`guo`an on 2017/4/19 09:27
 */

public class Select_Acty extends Activity {

    SelectDataBind mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.acty_select);

        ToastUtil.showMessage("登录成功");
    }

    public void Selectpeople (View view){
        Intent intent = new Intent();
        intent.setClass(this,PeopleList_Acty.class);
        startActivity(intent);
    }
}
