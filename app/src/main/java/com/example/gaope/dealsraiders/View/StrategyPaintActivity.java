package com.example.gaope.dealsraiders.View;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androidkun.xtablayout.XTabLayout;
import com.example.gaope.dealsraiders.Adapter.SearchResultViewPagerAdapter;
import com.example.gaope.dealsraiders.Fragment.DraftStrategyFragment;
import com.example.gaope.dealsraiders.Fragment.HavePaintStrategyFragment;
import com.example.gaope.dealsraiders.Fragment.SearchPlayFragment;
import com.example.gaope.dealsraiders.Fragment.SearchStrategyFragment;
import com.example.gaope.dealsraiders.R;

import java.util.ArrayList;
import java.util.List;

public class StrategyPaintActivity extends AppCompatActivity {

    private Button backSearch;
    private String[]  titles=new String[]{"已发布","草稿"};
    private XTabLayout tabLayout;
    private ViewPager viewPager;
    private SearchResultViewPagerAdapter searchResultViewPagerAdapter;
    List<Fragment> mfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_paint);

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
        mfragment.add(new HavePaintStrategyFragment());
        mfragment.add(new DraftStrategyFragment());
        searchResultViewPagerAdapter = new SearchResultViewPagerAdapter(1,mfragment, getSupportFragmentManager());
        viewPager.setAdapter(searchResultViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
