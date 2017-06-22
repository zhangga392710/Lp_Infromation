package com.example.zga.view.activity.message;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.example.androidlibrary.util.TopView;
import com.example.zga.R;
import com.example.zga.databinding.PersonalActyDataBind;
import com.example.zga.view.fragment.PersonalInfo_Frnt;

/**
 * @author z`guo`an on 2017/4/13 14:42
 */

public class PersonalInfo_Acty extends FragmentActivity {

    PersonalActyDataBind mBinding;

    TopView topView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.acty_personal_info);
        topView = new TopView(mBinding.getRoot(), getString(R.string.personal_message_txt26), true, true);
        topView.btn_back.setImageDrawable(this.getResources().getDrawable(R.mipmap.ic_launcher));

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content,new PersonalInfo_Frnt()).commit();
    }
}
