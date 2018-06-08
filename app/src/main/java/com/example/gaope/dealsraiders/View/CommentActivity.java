package com.example.gaope.dealsraiders.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.example.gaope.dealsraiders.Adapter.CommentListViewAdapter;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.CommentListTool;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CommentActivity extends AppCompatActivity {

    private static final String TAG = "CommentActivity";

    private ListView listView;
    private CommentListViewAdapter commentListViewAdapter;
    private List<CommentListTool> listTools;
    private EditText editText;
    private String edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        init();

        listView = (ListView) findViewById(R.id.comment_listview);
        commentListViewAdapter = new CommentListViewAdapter(getBaseContext(),listTools);
        listView.setAdapter(commentListViewAdapter);

        editText = (EditText) findViewById(R.id.comment_edit);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                dataList();
                return false;
            }
        });

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

    }

    private void dataList() {
        Calendar calendar = Calendar.getInstance();
        //获取系统的日期
        //年
        int year = calendar.get(Calendar.YEAR);
        //月
        int month = calendar.get(Calendar.MONTH)+1;
        //日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //获取系统时间
        //小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //分钟
        int minute = calendar.get(Calendar.MINUTE);
        //秒
        int second = calendar.get(Calendar.SECOND);
        Log.d(TAG,"L"+year+"    :"+month + "   :" + day);
        edit = editText.getText().toString();
        listTools.add(new CommentListTool(R.drawable.ownsphoto,"大V",
                "0"+month+"-"+day+"   "+hour+":"+minute,edit));
        commentListViewAdapter.notifyDataSetChanged();

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
