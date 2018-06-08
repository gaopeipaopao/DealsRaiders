package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gaope.dealsraiders.Adapter.FootRecyclerWanfaAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.GlideImageLoader;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.SpacesItemDecoration;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;
import com.example.gaope.dealsraiders.View.SearchActivity;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索结果游记的fragment
 * Created by gaope on 2018/5/23.
 */

public class SearchPlayFragment extends Fragment {

    private FootRecyclerWanfaAdapter wanfaAdapter;
    private List<Integer> wanfaImageList;
    private List<String> wanfaTextList1;
    private int[] wanfaIma;
    private String[] wanfaText1;
    private String[] wanfaText2;
    private List<String> wanfaTextList2;
    private RecyclerView rv2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_play_fragment,container,false);

        init();

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
        for (int i = 0;i < wanfaIma.length;i++){
            wanfaImageList.add(wanfaIma[i]);
            wanfaTextList1.add(wanfaText1[i]);
            wanfaTextList2.add(wanfaText2[i]);
        }

    }

}
