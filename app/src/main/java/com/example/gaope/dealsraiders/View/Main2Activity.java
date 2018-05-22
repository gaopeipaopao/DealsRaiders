package com.example.gaope.dealsraiders.View;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.gaope.dealsraiders.Adapter.ViewPagerAdapter;
import com.example.gaope.dealsraiders.Fragment.FootmarkFragment;
import com.example.gaope.dealsraiders.Fragment.HomePageFragment;
import com.example.gaope.dealsraiders.Fragment.OwnFragment;
import com.example.gaope.dealsraiders.Fragment.StrategyFragment;
import com.example.gaope.dealsraiders.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

//    private String responses;
//    public String cookie;
//    public String enter_url;
    private static final String TAG = "Main2Activity";
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
//    private List<String> tabIndicators;
    List<Fragment> mfragment;
    private String[]  titles=new String[]{"首页","攻略","足迹","我的"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(4);
       // new NoScrollViewPager(this).setSlide(false);
        Log.d("aaaaaaa", "onCreate: ");
        initContent();
        initTab();


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                View view = tab.getCustomView();
                ImageView image = view.findViewById(R.id.tab_image);

                Log.d(TAG,"vw:"+image.getWidth());
                Log.d(TAG,"vh:"+image.getHeight());
                LinearLayout.LayoutParams imParams = (LinearLayout.LayoutParams) image.getLayoutParams();
                imParams.width = 80;
                imParams.height = 80;
                image.setLayoutParams(imParams);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                View view = tab.getCustomView();
                ImageView image = view.findViewById(R.id.tab_image);

                Log.d(TAG,"vw:"+image.getWidth());
                Log.d(TAG,"vh:"+image.getHeight());
                LinearLayout.LayoutParams imParams = (LinearLayout.LayoutParams) image.getLayoutParams();
                imParams.width = 60;
                imParams.height = 60;
                image.setLayoutParams(imParams);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
//        Intent intent=getIntent();
//        responses=intent.getStringExtra("Response");
//        cookie=intent.getStringExtra("Cookie");
//        enter_url=intent.getStringExtra("enter_url");
//        Log.d("enter_url",enter_url);
//        Log.d("res",responses);
//        Log.d("cook",cookie);
//        Fragment_Lesson fragment_lesson=new Fragment_Lesson();
//        Bundle bundle=new Bundle();
//        bundle.putString("Cokie",cookie);
//        fragment_lesson.setArguments(bundle);

    }

//   // public String getCookie(){
//        return cookie;
//    }


    private void initTab() {
        tabLayout.setTabMode(TabLayout.MODE_FIXED);//TabLayout.MODE_FIXED为tabLayout的模式
        tabLayout.setSelectedTabIndicatorHeight(0);//高度为0，就隐藏了indication
        ViewCompat.setElevation(tabLayout, 10);//设置tab之间的间距
        for (int i = 0; i < 4; i++) {
            TabLayout.Tab tab = tabLayout.newTab();

            View view = LinearLayout.inflate(this,R.layout.tablayout_image_text,null);
            tab.setCustomView(view);

            TextView text = (TextView) view.findViewById(R.id.tab_text);
            text.setText(titles[i]);
            ImageView imageView=(ImageView)view.findViewById(R.id.tab_image);
            if (i==0){
                LinearLayout.LayoutParams imParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                imParams.width = 80;
                imParams.height = 80;
                imageView.setLayoutParams(imParams);
                imageView.setImageResource(R.drawable.select_home);
            }
            if(i==1){
                imageView.setImageResource(R.drawable.select_strategy);
            }
            if(i==2){
                imageView.setImageResource(R.drawable.select_foot);
            }
            if(i==3){
                imageView.setImageResource(R.drawable.select_own);
            }

            tabLayout.addTab(tab);
        }
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

    }



    private void initContent(){
        mfragment = new ArrayList<>();
        mfragment.add(new HomePageFragment());
        mfragment.add(new StrategyFragment());
        mfragment.add(new FootmarkFragment());
        mfragment.add(new OwnFragment());
        viewPagerAdapter = new ViewPagerAdapter(mfragment, getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
    }
}
