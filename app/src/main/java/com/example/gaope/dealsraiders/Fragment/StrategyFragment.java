package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.gaope.dealsraiders.Adapter.StrategyListAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;
import com.example.gaope.dealsraiders.View.StrategyPaintActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaope on 2018/5/22.
 */

public class StrategyFragment extends Fragment {

    private static final String TAG = "StrategyFragment";

    private ListView listView;
    private List<String> listTextOne;
    private List<String> listTextTwo;
    private List<Integer> listImage;

    private StrategyListAdapter listAdapter;

    private Button buttonPaint;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.strategy_fragment,container,false);

        init();

        listView = (ListView) view.findViewById(R.id.strategy_list);
        listAdapter = new StrategyListAdapter(getContext(),listTextOne,listTextTwo,listImage);
        listView.setAdapter(listAdapter);

        buttonPaint = (Button) view.findViewById(R.id.strategy_paint);
        buttonPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intrnt = new Intent(getContext(), StrategyPaintActivity.class);
                startActivity(intrnt);
            }
        });


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
                "大山深处的室外桃园，莫干山村，隐莫干",
                "回归老家，亲近自然，相约大余丫山",
                "留在同里的第二个理由",
                "最浪漫的奢华旅行",
                "遇见打草原 共享最美春色",
                "揭秘西安古城",
                "看花海，带你玩遍阿坝自治州",
                "额尔古纳"
        };
        String[] two = new String[]{
                "临风  3.4万",
                "迷茫的兔子  1.2万",
                "上海冷空气   1.7万",
                "所谓的华丽  0.7万",
                "谁的天空  3.0万",
                "老陕人  4.0万",
                "漫步者  5.0万",
                "鸿鹄啊  12。5万"
        };

        int[] ima = new int[]{
                R.drawable.minzu1,
                R.drawable.listimage2,
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
