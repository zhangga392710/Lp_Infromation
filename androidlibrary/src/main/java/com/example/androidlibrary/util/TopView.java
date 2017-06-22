package com.example.androidlibrary.util;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.androidlibrary.R;


/**
 * TopView控件使用
 *  @author z`guo`an on on 2017/4/19 15:59
 */
public class TopView {

    public ImageButton btn_back, btn_save_top;
    public TextView title;

    public TopView(View v , String txt, boolean leftShow, boolean rightShow) {
        title = (TextView) v.findViewById(R.id.title);
        btn_back = (ImageButton) v.findViewById(R.id.btn_back);
        btn_save_top = (ImageButton) v.findViewById(R.id.btn_save);
        title.setText(txt);
        if (leftShow) {
            btn_back.setVisibility(View.VISIBLE);
        } else {
            btn_back.setVisibility(View.GONE);
        }

        if (rightShow) {
            btn_save_top.setVisibility(View.VISIBLE);
        } else {
            btn_save_top.setVisibility(View.GONE);
        }
    }
}
