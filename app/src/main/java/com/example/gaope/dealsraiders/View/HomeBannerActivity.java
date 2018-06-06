package com.example.gaope.dealsraiders.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.gaope.dealsraiders.OnesView.ImageAndTextView;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.Data;

/**
 * 首页的轮播图点击后打开的Activity
 */

public class HomeBannerActivity extends AppCompatActivity {

    private static final String TAG = "HomeBannerActivity";

    private ScrollView scrollViewHome;
    private ImageAndTextView imageTextView;
    private String[] datas;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_banner);

        parseData();

        scrollViewHome = (ScrollView) findViewById(R.id.scrollView);
        imageTextView = new ImageAndTextView(this,datas);
        scrollViewHome.addView(imageTextView);
        button = (Button) findViewById(R.id.back_banner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void parseData() {
        datas = Data.getData().split(Data.TAG_SPACE);
        Log.d(TAG,":"+datas.length);
    }
}
