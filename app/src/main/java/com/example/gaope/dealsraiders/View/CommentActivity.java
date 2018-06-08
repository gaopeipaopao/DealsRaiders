package com.example.gaope.dealsraiders.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gaope.dealsraiders.Adapter.CommentListViewAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.CommentListTool;

import java.util.ArrayList;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    private ListView listView;
    private CommentListViewAdapter commentListViewAdapter;
    private List<CommentListTool> listTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        init();

        listView = (ListView) findViewById(R.id.comment_listview);
        commentListViewAdapter = new CommentListViewAdapter(getBaseContext(),listTools);
        listView.setAdapter(commentListViewAdapter);

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

    }

    private void init() {
        listTools = new ArrayList<>();
        int[] ima = new int[]{
                R.drawable.dddd,R.drawable.ownsphoto
        };
        String[] one = new String[]{
                "西西","老陕人"
        };
        String[] two = new String[]{
                "03-14   22:23","04-16   23.32"
        };
        String[] three = new String[]{
                "挺好的","henbang呀"
        };
        for (int i = 0;i < ima.length;i++){
            CommentListTool commentListTool = new CommentListTool(ima[i],one[i],two[i],three[i]);
            listTools.add(commentListTool);
        }
    }
}
