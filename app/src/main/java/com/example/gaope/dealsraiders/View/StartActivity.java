package com.example.gaope.dealsraiders.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.gaope.dealsraiders.MainActivity;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

public class StartActivity extends AppCompatActivity {

    private static final String TAG = "StartActivity";

    /**
     * 顶部banner照片集合
     */
    private int[] bannerPhoto;

    /**
     * 顶部banner ImageView对象集合
     */
    private List bannerPhotoLists;

    /**
     * 顶部的banner轮播图
     */
    private Banner homeBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        SharedPreferences sharedPreferences = getBaseContext().getSharedPreferences("isOk",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("ok",false);
        editor.commit();


        init();

        Log.d(TAG,"aaa");
        homeBanner = (Banner) findViewById(R.id.home_banner_photo);
        homeBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        homeBanner.setImages(bannerPhotoLists).setImageLoader(new GlideImageLoader());
        homeBanner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                if (position == 3){
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
        homeBanner.isAutoPlay(false);
        homeBanner.start();


    }

    private void init() {
        bannerPhoto = new int[]{R.drawable.begin1,R.drawable.begin2,
                R.drawable.begin3,R.drawable.begin4};
        bannerPhotoLists = new ArrayList<>();
        for (int i = 0;i < bannerPhoto.length;i++){
            bannerPhotoLists.add(bannerPhoto[i]);
        }
    }
}
