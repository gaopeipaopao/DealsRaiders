package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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
     * 轮播图下面的分为两个的布局
     */
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private LinearLayout linearLayout5;
    private LinearLayout linearLayout6;
    private LinearLayout linearLayout7;


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
        linearLayout1 = (LinearLayout) view.findViewById(R.id.text_image1);
        linearLayout2 = (LinearLayout) view.findViewById(R.id.text_image2);
        linearLayout3 = (LinearLayout) view.findViewById(R.id.text_image3);
        linearLayout4 = (LinearLayout) view.findViewById(R.id.text_image4);
        linearLayout5 = (LinearLayout) view.findViewById(R.id.text_image5);
        linearLayout6 = (LinearLayout) view.findViewById(R.id.text_image6);
        linearLayout7 = (LinearLayout) view.findViewById(R.id.text_image7);

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

        textAndImage();
    }

    private void textAndImage() {

        ImageView im1 = linearLayout1.findViewById(R.id.imageView_home);
        TextView tv1 = linearLayout1.findViewById(R.id.textView_home);
        tv1.setText("来自大山深处的故事——彝族");
        im1.setScaleType(ImageView.ScaleType.CENTER);
        Glide.with(getContext()).load(R.drawable.image_text_1).into(im1);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","来自大山深处的故事——彝族");
                startActivity(intent);
            }
        });

        ImageView im2 = linearLayout2.findViewById(R.id.imageView_home);
        TextView tv2 = linearLayout2.findViewById(R.id.textView_home);
        tv2.setText("藏族儿女们的信仰");
        im2.setScaleType(ImageView.ScaleType.CENTER);
        Glide.with(getContext()).load(R.drawable.image_text_home2).into(im2);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","藏族儿女们的信仰");
                startActivity(intent);
            }
        });

        ImageView im3 = linearLayout3.findViewById(R.id.imageView_home);
        TextView tv3 = linearLayout3.findViewById(R.id.textView_home);
        tv3.setText("你好 我的名字叫大兴安岭");
        im3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(getContext()).load(R.drawable.daxingan).into(im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","你好 我的名字叫大兴安岭");
                startActivity(intent);
            }
        });

        ImageView im4 = linearLayout4.findViewById(R.id.imageView_home);
        TextView tv4 = linearLayout4.findViewById(R.id.textView_home);
        tv4.setText("海边阳光 热浪沙滩 尽享夏日乐趣");
        im4.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(getContext()).load(R.drawable.hanbian).into(im4);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","海边阳光 热浪沙滩 尽享夏日乐趣");
                startActivity(intent);
            }
        });

        ImageView im5 = linearLayout5.findViewById(R.id.imageView_home);
        TextView tv5 = linearLayout5.findViewById(R.id.textView_home);
        tv5.setText("脚下这大山中的古桥");
        im5.setScaleType(ImageView.ScaleType.CENTER);
        Glide.with(getContext()).load(R.drawable.daqiao).into(im5);
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","脚下这大山中的古桥");
                startActivity(intent);
            }
        });

        ImageView im6 = linearLayout6.findViewById(R.id.imageView_home);
        TextView tv6 = linearLayout6.findViewById(R.id.textView_home);
        tv6.setText("少数民族的习惯");
        im6.setScaleType(ImageView.ScaleType.CENTER);
        Glide.with(getContext()).load(R.drawable.minzu).into(im6);
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","少数民族的习惯");
                startActivity(intent);
            }
        });

        ImageView im7 = linearLayout7.findViewById(R.id.imageView_home);
        TextView tv7 = linearLayout7.findViewById(R.id.textView_home);
        tv7.setText("鲜为人知的丛林深处，静谧的那一方净土");
        im7.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(getContext()).load(R.drawable.jingtu).into(im7);
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","鲜为人知的丛林深处，静谧的那一方净土");
                startActivity(intent);
            }
        });

    }
}
