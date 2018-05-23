package com.example.gaope.dealsraiders.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gaope.dealsraiders.R;

/**
 * 搜索结果游记的fragment
 * Created by gaope on 2018/5/23.
 */

public class SearchPlayFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.search_play_fragment,container,false);
        return view;
    }
}
