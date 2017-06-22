package com.example.zga.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.zga.view.fragment.PersonalInfo_Frnt;

/**
 * Created by Administrator on 2016/9/28
 */

public class Personal_pter extends FragmentPagerAdapter {

    private String from;
    private String area;
    private String jmid;

    public Personal_pter(FragmentManager fm,  String from, String area, String jmid) {
        super(fm);
//        this.yyrtwom = yyrtwom;
        this.from = from;
        this.area = area;
        this.jmid = jmid;
    }


    @Override
    public Fragment getItem(int position) {
        return intentValues(position);
    }

    @Override
    public int getCount() {
//        int lndex = (yyrtwom.getList() == null ? 1 : yyrtwom.getList().size() + 1);
//        if (lndex > 3) {
//            lndex = 4;
//        }
        return 0;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
    }

    private Fragment intentValues(int indexid) {
        PersonalInfo_Frnt personalInfo_frnt = new PersonalInfo_Frnt();
//        Bundle b = new Bundle();
//        b.putSerializable("YyrOneTwoModel", yyrtwom);
//        b.putString("FROM", from);
//        b.putString("JMID", jmid);
//        b.putString("GM_AREA_ID", area);
//        b.putInt("indexid", indexid);
//        yyrOneTwoVisitFragment.setArguments(b);
        return personalInfo_frnt;
    }

}
