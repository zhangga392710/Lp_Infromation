package com.example.zga.view.activity.commonality;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.androidlibrary.util.ToastUtil;
import com.example.zga.R;
import com.example.zga.databinding.PeopleListDataBind;
import com.example.zga.view.activity.message.PersonalInfo_Acty;

/**
 * @author z`guo`an on 2017/4/19 09:46
 */

public class PeopleList_Acty extends Activity {

    PeopleListDataBind mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.acty_peoplelist);
        ToastUtil.showMessage("查询成功");
    }

    public void SelectArchive (View view){
        Intent intent = new Intent();
        intent.setClass(this,PersonalInfo_Acty.class);
        startActivity(intent);
    }
}
