package com.example.gaope.dealsraiders.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaope on 2018/5/23.
 */

public class SearchResultViewPagerAdapter extends FragmentPagerAdapter {

    private String[]  titles=new String[]{"攻略","游记"};
    private String[]  titles1=new String[]{"已发布","草稿"};

    private List<Fragment> mFragment=new ArrayList<>();
    private int one;


    public SearchResultViewPagerAdapter(int one,List<Fragment> mfragment, FragmentManager fm) {
        super(fm);
        this.mFragment=mfragment;
        this.one = one;
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
        if (one == 0){
            return titles[position];
        }
        if (one == 1){
            return titles1[position];
        }
        return titles[position];
    }
}
