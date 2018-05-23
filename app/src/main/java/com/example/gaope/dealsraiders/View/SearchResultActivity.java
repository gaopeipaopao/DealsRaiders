package com.example.gaope.dealsraiders.View;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.example.gaope.dealsraiders.Adapter.SearchResultViewPagerAdapter;
import com.example.gaope.dealsraiders.Adapter.ViewPagerAdapter;
import com.example.gaope.dealsraiders.Fragment.FootmarkFragment;
import com.example.gaope.dealsraiders.Fragment.HomePageFragment;
import com.example.gaope.dealsraiders.Fragment.OwnFragment;
import com.example.gaope.dealsraiders.Fragment.SearchPlayFragment;
import com.example.gaope.dealsraiders.Fragment.SearchStrategyFragment;
import com.example.gaope.dealsraiders.Fragment.StrategyFragment;
import com.example.gaope.dealsraiders.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 展示搜索的结果，分为游记和攻略，用ViewPager+Tablayout
 */

public class SearchResultActivity extends AppCompatActivity {

    private static final String TAG = "SearchResultActivity";

    private Button backSearch;
    private String[]  titles=new String[]{"攻略","游记"};
    private XTabLayout tabLayout;
    private ViewPager viewPager;
    private SearchResultViewPagerAdapter searchResultViewPagerAdapter;
    List<Fragment> mfragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        backSearch = (Button)findViewById(R.id.back_search);
        backSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tabLayout = (XTabLayout)findViewById(R.id.tab_search_result);
        viewPager = (ViewPager) findViewById(R.id.viewpager_search_result);
        initContent();



        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
    }

    private void initContent(){
        mfragment = new ArrayList<>();
        mfragment.add(new SearchPlayFragment());
        mfragment.add(new SearchStrategyFragment());
        searchResultViewPagerAdapter = new SearchResultViewPagerAdapter(mfragment, getSupportFragmentManager());
        viewPager.setAdapter(searchResultViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
