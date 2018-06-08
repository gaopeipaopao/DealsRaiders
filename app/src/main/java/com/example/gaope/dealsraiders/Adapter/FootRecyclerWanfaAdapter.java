package com.example.gaope.dealsraiders.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.example.gaope.dealsraiders.R;
import com.example.gaope.dealsraiders.View.HomeBannerActivity;

import java.util.List;

/**
 * Created by gaope on 2018/6/8.
 */

public class FootRecyclerWanfaAdapter extends RecyclerView.Adapter<FootRecyclerWanfaAdapter.ViewHolder> {

    private Context context;
    private List<String> listTextOne;
    private List<String> listTextTwo;
    private List<Integer> listImage;


    public FootRecyclerWanfaAdapter(Context context, List<String> listTextOne, List<String> listTextTwo, List<Integer> listImage){
        this.context = context;
        this.listTextOne = listTextOne;
        this.listTextTwo = listTextTwo;
        this.listImage = listImage;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recycler_image);
            textView1 = (TextView) itemView.findViewById(R.id.recycler_text1);
            textView2 = (TextView) itemView.findViewById(R.id.recycler_text2);
        }
    }

    @Override
    public FootRecyclerWanfaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.foot_recycle_wanfa,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        Log.d("aaa","aaa");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final FootRecyclerWanfaAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(listImage.get(position)).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, HomeBannerActivity.class);
                intent.putExtra("Text","再走老路");
                context.startActivity(intent);
            }
        });
        holder.textView1.setText(listTextOne.get(position));
        holder.textView2.setText(listTextTwo.get(position));
    }

    @Override
    public int getItemCount() {
        return listImage.size();
    }


}
