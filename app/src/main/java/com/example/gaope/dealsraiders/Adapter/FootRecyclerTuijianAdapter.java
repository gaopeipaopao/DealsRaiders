package com.example.gaope.dealsraiders.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;

import java.util.List;

/**
 * Created by gaope on 2018/6/8.
 */

public class FootRecyclerTuijianAdapter extends RecyclerView.Adapter<FootRecyclerTuijianAdapter.ViewHolder> {

    private List<Integer> recyImageList;
    private List<String> recyTextList;
    private Context context;

    public FootRecyclerTuijianAdapter(Context context,List<Integer> recyImageList,List<String> recyTextList){
        this.context = context;
        this.recyImageList = recyImageList;
        this.recyTextList = recyTextList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recycler_image);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            textView = itemView.findViewById(R.id.recycler_text);
        }
    }

    @Override
    public FootRecyclerTuijianAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.foot_recycle_tuijian,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HomeBannerActivity.class);
                intent.putExtra("Text","再走老路");
                context.startActivity(intent);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FootRecyclerTuijianAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(recyImageList.get(position)).into(holder.imageView);
        holder.textView.setText(recyTextList.get(position));
    }

    @Override
    public int getItemCount() {
        return recyImageList.size();
    }


}
