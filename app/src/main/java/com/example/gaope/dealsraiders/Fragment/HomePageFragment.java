package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.GlideImageLoader;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;
import com.example.gaope.dealsraiders.View.SearchActivity;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaope on 2018/5/22.
 */

public class HomePageFragment extends Fragment {

    private static final String TAG = "HomePageFragment";

    /**
     * 搜索框
     */
    private TextView searchText;

    /**
     * 顶部banner照片集合
     */
    private int[] bannerPhoto;

    /**
     * 顶部banner ImageView对象集合
     */
    private List bannerPhotoLists;

    /**
     * 顶部文字集合
     */
    private String[] bannerTitle;
    /**
     * banner轮播时的文字
     */
    private List<String> bannerTitleLists;

    /**
     * 顶部的banner轮播图
     */
    private Banner homeBanner;

    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        searchText = (TextView)view.findViewById(R.id.search_text);

        init();

        homeBanner = view.findViewById(R.id.home_banner_photo);

        return view;
    }

    private void init() {
        bannerPhoto = new int[]{R.drawable.home_banner_photo1,R.drawable.home_banner_photo2,
                R.drawable.home_banner_photo3,R.drawable.home_banner_photo4};
        bannerTitle = new String[]{"旅行中 那些过目不忘的景色","用脚步 去寻找","我们心中的净土","享受生活的乐趣"};
        bannerPhotoLists = new ArrayList<>();
        bannerTitleLists = new ArrayList<>();
        for (int i = 0;i < bannerPhoto.length;i++){
            bannerPhotoLists.add(bannerPhoto[i]);
            bannerTitleLists.add(bannerTitle[i]);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        searchText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        homeBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        homeBanner.setBannerTitles(bannerTitleLists);
        homeBanner.setImages(bannerPhotoLists).setImageLoader(new GlideImageLoader());
        homeBanner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                startActivity(intent);
            }
        });
        homeBanner.start();
    }
}
