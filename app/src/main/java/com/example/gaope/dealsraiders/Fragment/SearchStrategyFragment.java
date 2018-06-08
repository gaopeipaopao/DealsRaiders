package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gaope.dealsraiders.Adapter.StrategyListAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索结果攻略的fragment
 * Created by gaope on 2018/5/23.
 */

public class SearchStrategyFragment extends Fragment {

    private ListView listView;
    private List<String> listTextOne;
    private List<String> listTextTwo;
    private List<Integer> listImage;

    private StrategyListAdapter listAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_strategy_fragment,container,false);

        init();

        listView = (ListView) view.findViewById(R.id.strategy_list);
        listAdapter = new StrategyListAdapter(getContext(),listTextOne,listTextTwo,listImage);
        listView.setAdapter(listAdapter);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), HomeBannerActivity.class);
                intent.putExtra("Text","鲜为人知的丛林深处，静谧的那一方净土");
                startActivity(intent);
            }
        });
    }

    private void init() {
        listTextOne = new ArrayList<>();
        listTextTwo = new ArrayList<>();
        listImage = new ArrayList<>();

        String[] one = new String[]{
                "留在同里的第二个理由",
                "最浪漫的奢华旅行",
                "遇见打草原 共享最美春色",
                "揭秘西安古城",
                "看花海，带你玩遍阿坝自治州",
                "额尔古纳"
        };
        String[] two = new String[]{
                "上海冷空气   1.7万",
                "所谓的华丽  0.7万",
                "谁的天空  3.0万",
                "老陕人  4.0万",
                "漫步者  5.0万",
                "鸿鹄啊  12。5万"
        };

        int[] ima = new int[]{
                R.drawable.listimage3,
                R.drawable.photo5_one,
                R.drawable.listimage5,
                R.drawable.listimage6,
                R.drawable.listimage7,
                R.drawable.listimage,
        };
        for (int i = 0;i < ima.length;i++){
            listTextOne.add(one[i]);
            listTextTwo.add(two[i]);
            listImage.add(ima[i]);
        }
    }
}
