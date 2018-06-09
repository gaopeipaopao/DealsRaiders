package com.example.gaope.dealsraiders.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.BoolRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.View.HistoryActivity;
import com.example.gaope.dealsraiders.View.MyCollectionActivity;

/**
 * Created by gaope on 2018/5/22.
 */

public class OwnFragment extends Fragment {

    Button buttonMyCello;
    Button buttonHistory;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.own_fragment,container,false);

        buttonMyCello = (Button) view.findViewById(R.id.own_shouchang);
        buttonHistory = (Button) view.findViewById(R.id.own_lishi);

        buttonMyCello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MyCollectionActivity.class);
                startActivity(intent);
            }
        });
        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
