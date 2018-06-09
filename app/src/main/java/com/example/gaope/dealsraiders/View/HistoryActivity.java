package com.example.gaope.dealsraiders.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gaope.dealsraiders.R;

public class HistoryActivity extends AppCompatActivity {

    private LinearLayout linearLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        linearLayout3 = (LinearLayout) findViewById(R.id.text_image3);
        ImageView im3 = linearLayout3.findViewById(R.id.imageView_home);
        TextView tv3 = linearLayout3.findViewById(R.id.textView_home);
        tv3.setText("你好 我的名字叫大兴安岭");
        im3.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Glide.with(this).load(R.drawable.daxingan).into(im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryActivity.this, HomeBannerActivity.class);
                intent.putExtra("Text","你好 我的名字叫大兴安岭");
                startActivity(intent);
            }
        });

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

    }
}
