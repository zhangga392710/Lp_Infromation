package com.example.zga.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidlibrary.util.ToastUtil;
import com.example.zga.R;
import com.example.zga.bean.UsersBean;
import com.example.zga.contract.MainContract;
import com.example.zga.databinding.MainDataBind;
import com.example.zga.di.component.DaggerMainComponent;
import com.example.zga.di.moudel.MainModule;

/**
 * @author z`guo`an on 2017/4/19 09:13
 */

public class PersonalInfo_Frnt extends Fragment  implements MainContract.MainView{

    private MainDataBind mBinding;
    MainContract.MainPresenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_personal_info,container,false);
        //进行Dagger注入操作
        mPresenter = DaggerMainComponent.builder().mainModule(new MainModule(this)).build().getPresenter();
        ToastUtil.showMessage("绑定成功");
        return mBinding.getRoot();
    }

    public void getData(View view) {
        //使用presenter操作M与V的交互
        //发起交互请求
        mPresenter.getMainData(getActivity());
        Toast.makeText(getActivity(), "监听到人机交互", Toast.LENGTH_SHORT).show();
    }

    //实现数据绑定接口
    @Override
    public void showData(UsersBean usersBean) {
        mBinding.setUserB(usersBean);
    }

}
