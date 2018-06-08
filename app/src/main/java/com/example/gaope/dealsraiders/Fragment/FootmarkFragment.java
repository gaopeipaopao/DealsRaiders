package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gaope.dealsraiders.Adapter.FootRecyclerTuijianAdapter;
import com.example.gaope.dealsraiders.Adapter.FootRecyclerWanfaAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.GlideImageLoader;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.SpacesItemDecoration;
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

public class FootmarkFragment extends Fragment {

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

    private RecyclerView rv1;
    private RecyclerView rv2;
    private FootRecyclerTuijianAdapter fa;
    private List<Integer> recyImageList;
    private List<String> recyTextList;
    private int[] recyIma;
    private String[] textText;

    private FootRecyclerWanfaAdapter wanfaAdapter;
    private List<Integer> wanfaImageList;
    private List<String> wanfaTextList1;
    private int[] wanfaIma;
    private String[] wanfaText1;
    private String[] wanfaText2;
    private List<String> wanfaTextList2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.foot_fragment,container,false);

        init();

        searchText = (TextView)view.findViewById(R.id.search_text);
        homeBanner = view.findViewById(R.id.home_banner_photo);

        rv1 = (RecyclerView) view.findViewById(R.id.foot_recy_tuijian);
        rv1.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.HORIZONTAL));
        fa = new FootRecyclerTuijianAdapter(getContext(),recyImageList,recyTextList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv1.setLayoutManager(linearLayoutManager);
        rv1.setAdapter(fa);

        rv2 = (RecyclerView) view.findViewById(R.id.foot_recy_wanfa);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        rv2.setLayoutManager(staggeredGridLayoutManager);
        wanfaAdapter = new FootRecyclerWanfaAdapter(getContext(),wanfaTextList1,wanfaTextList2,wanfaImageList);
        rv2.setAdapter(wanfaAdapter);
        //设置item之间的间隔
        SpacesItemDecoration decoration=new SpacesItemDecoration(25);
        rv2.addItemDecoration(decoration);

        return view;
    }

    private void init() {

        wanfaTextList1 = new ArrayList<>();
        wanfaTextList2 = new ArrayList<>();
        wanfaImageList = new ArrayList<>();
        wanfaText1 = new String[]{
                "最美的声音是叮咚","最美的瞬间",
                "山间的无名水库","背上行囊，踏雪一起走",
                "寻找最美的风景","壮族大美梯田",
                "绿色好心情","景美留人"
        };
        wanfaText2 = new String[]{
                "lv  2018.5.13","雪中  2018.4.23",
                "哈哈哈  2018.6.1","hao呀么  2018.5.6",
                "田野  2018.3.12","大V  2018.6.5",
                "西西  2018.5.29","远行  2018.3.10"
        };
        wanfaIma = new int[]{
                R.drawable.daxingan1,R.drawable.jingtu4,
                R.drawable.jingtu3,R.drawable.daxingan,
                R.drawable.jingtu2,R.drawable.jingtu1,
                R.drawable.hanbian3,R.drawable.hanbian1
        };

        for (int i = 0;i < wanfaIma.length;i++){
            wanfaImageList.add(wanfaIma[i]);
            wanfaTextList1.add(wanfaText1[i]);
            wanfaTextList2.add(wanfaText2[i]);
        }


        recyImageList = new ArrayList<>();
        recyTextList = new ArrayList<>();

        textText = new String[]{
                "再走老路","记录美好","大山的呼喊","丛林的召唤","一起走"
        };
        recyIma = new int[]{
          R.drawable.listimage3,R.drawable.hanbian3,
                R.drawable.minzu1,R.drawable.minzu2,R.drawable.daxingan2
        };
        for (int i = 0;i < textText.length;i++){
            recyImageList.add(recyIma[i]);
            recyTextList.add(textText[i]);
        }

        bannerPhoto = new int[]{R.drawable.jingtu1,R.drawable.daqiao2,
                R.drawable.minzu2,R.drawable.listimage7};
        bannerTitle = new String[]{"民俗达人带你游中国","用脚步 去寻找","享受生活的乐趣","寻找净土"};
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
                intent.putExtra("Text","再走老路");
                startActivity(intent);
            }
        });
        homeBanner.start();
    }


}
