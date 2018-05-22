package com.example.gaope.dealsraiders.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaope on 2018/5/22.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[]  titles=new String[]{"首页","攻略","足迹","我的"};

    private List<Fragment> mFragment=new ArrayList<>();


    public ViewPagerAdapter(List<Fragment> mfragment, FragmentManager fm) {
        super(fm);
        this.mFragment=mfragment;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
