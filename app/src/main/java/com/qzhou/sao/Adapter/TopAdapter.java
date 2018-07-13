package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.InterfacePackage.OnItemClickListener;
import com.qzhou.sao.R;

import java.util.ArrayList;
import java.util.List;

class TopAdapter extends RecyclerView.Adapter<TopAdapter.MyHolder> {
    private final List<HomeData.HomeDataBean> homeData;
    private final Context context;
    private final ArrayList<Integer> topTitle;


    private OnItemClickListener click;



    public TopAdapter(Context context, List<HomeData.HomeDataBean> homeData, ArrayList<Integer> topTitle) {
        this.context = context;
        this.homeData = homeData;
        this.topTitle = topTitle;

    }

    public void setOnItemClickListener(OnItemClickListener clickListener){
        this.click=clickListener;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_top_data, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.topTitle.setImageResource(topTitle.get(position));
        Glide.with(context).load(homeData.get(position).getPicurl()).into(holder.topIv);
        holder.topTv.setText(homeData.get(position).getTitle());
        Glide.with(context).load(homeData.get(position).getPicurl()).into(holder.topIvRight);


    }

    @Override
    public int getItemCount() {
        return homeData.size();
    }




    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView topIv;
        TextView topTv;
        ImageView topIvRight;
        ImageView topTitle;

        public MyHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            topTitle = itemView.findViewById(R.id.top_title);
            topIv = itemView.findViewById(R.id.top_iv);
            topTv = itemView.findViewById(R.id.top_tv);
            topIvRight = itemView.findViewById(R.id.top_iv_right);

        }

        @Override
        public void onClick(View v) {
            click.onItemClick(v, getPosition());
        }
    }






}
