package com.example.gaope.dealsraiders.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.StrategyListTool;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaope on 2018/6/8.
 */

public class StrategyListAdapter extends BaseAdapter {

    private static final String TAG = "StrategyListAdapter";

    private List<String> listTextOne;
    private List<String> listTextTwo;
    private List<Integer> listImage;
    private Context context;
    private List<StrategyListTool> strategyListToolList;

    public StrategyListAdapter(Context context,List<String> listTextOne,List<String> listTextTwo,List<Integer> listImage){
        this.listTextOne = listTextOne;
        this.listTextTwo = listTextTwo;
        this.listImage = listImage;
        this.context = context;
        init();
    }

    private void init() {
        strategyListToolList = new ArrayList<>();
        for(int i = 0;i <listImage.size();i++){
            strategyListToolList.add(new StrategyListTool(listTextOne.get(i),
                    listTextTwo.get(i),listImage.get(i)));
        }
        Log.d(TAG,"sLists:"+strategyListToolList.size());
    }

    @Override
    public int getCount() {
        return listImage.size();
    }

    @Override
    public Object getItem(int position) {
        return strategyListToolList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view ;
        ViewHolder viewHolder ;
        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.strategy_list_layout,parent,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView1.setText(strategyListToolList.get(position).getTextOne());
        viewHolder.textView2.setText(strategyListToolList.get(position).getTextTwo());
        Glide.with(context).load(strategyListToolList.get(position).getImage()).into(viewHolder.imageView);
        return view;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView textView1;
        TextView textView2;

        ViewHolder(View view){
            imageView = (ImageView) view.findViewById(R.id.list_image);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            textView1 = (TextView) view.findViewById(R.id.list_text_one);
            textView2 = (TextView) view.findViewById(R.id.list_text_two);
        }
    }
}
