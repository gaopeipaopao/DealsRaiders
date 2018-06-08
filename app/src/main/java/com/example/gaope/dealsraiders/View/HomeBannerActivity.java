package com.example.gaope.dealsraiders.View;

import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

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
    private Data dd;
    private String data;
    private TabLayout tabLayout;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private TextView textView1;
    private TextView textView2;
    private ImageView imageView1;
    private ImageView imageView2;
    private int len = 13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_banner);



        parseData();

        linearLayout1 = (LinearLayout) findViewById(R.id.pinglun_comment);
        linearLayout2 = (LinearLayout) findViewById(R.id.dianzan_comment);
        scrollViewHome = (ScrollView) findViewById(R.id.scrollView);
        imageTextView = new ImageAndTextView(getBaseContext(),datas);
        scrollViewHome.addView(imageTextView);

        textView1 = (TextView) linearLayout1.findViewById(R.id.tab_text);
        imageView1 = (ImageView) linearLayout1.findViewById(R.id.tab_image);
        textView2 = (TextView) linearLayout2.findViewById(R.id.tab_text);
        imageView2 = (ImageView) linearLayout2.findViewById(R.id.tab_image);

        textView1.setText("评论");
        imageView1.setImageResource(R.drawable.comment_black);
        textView2.setText("赞" + len);
        imageView2.setImageResource(R.drawable.parse_black);

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setTextColor(Color.parseColor("#000000"));
                textView2.setText("赞" + len);
                imageView2.setImageResource(R.drawable.parse_black);
                Intent intent = new Intent(HomeBannerActivity.this,CommentActivity.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setTextColor(Color.parseColor("#f4ea2a"));
                len = len + 1;
                textView2.setText("赞" + len);
                imageView2.setImageResource(R.drawable.praise);
            }
        });


        button = (Button) findViewById(R.id.back_banner);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
    }

    private void parseData() {
        data = getIntent().getStringExtra("Text");
        dd = new Data(data);
        datas = dd.getData().split(Data.TAG_SPACE);
        Log.d(TAG,":"+datas.length);
    }
}
