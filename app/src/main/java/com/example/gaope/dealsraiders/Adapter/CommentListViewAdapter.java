package com.example.gaope.dealsraiders.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.ToolHomeFragmentClass.CommentListTool;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by gaope on 2018/6/9.
 */

public class CommentListViewAdapter extends BaseAdapter {

    private Context context;
    private List<CommentListTool> commentListTools;

    public CommentListViewAdapter(Context context, List<CommentListTool> commentListTools){
        this.context = context;
        this.commentListTools = commentListTools;
    }
    static class ViewHolder{
        CircleImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;

        ViewHolder(View view){
            imageView = (CircleImageView) view.findViewById(R.id.list_com_photo);
            textView1 = (TextView) view.findViewById(R.id.list_com_text1);
            textView2 = (TextView) view.findViewById(R.id.list_com_text2);
            textView3 = (TextView) view.findViewById(R.id.list_com_text3);
        }
    }

    @Override
    public int getCount() {
        return commentListTools.size();
    }

    @Override
    public Object getItem(int position) {
        return commentListTools.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view ;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.commit_list,parent,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        Glide.with(context).load(commentListTools.get(position).getIma()).into(viewHolder.imageView);
        viewHolder.textView1.setText(commentListTools.get(position).getOne());
        viewHolder.textView2.setText(commentListTools.get(position).getTwo());
        viewHolder.textView3.setText(commentListTools.get(position).getThree());
        return view;
    }
}
