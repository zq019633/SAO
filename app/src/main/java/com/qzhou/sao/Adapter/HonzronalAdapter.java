package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qzhou.sao.R;

import java.util.ArrayList;

class HonzronalAdapter  extends RecyclerView.Adapter<HonzronalAdapter.MyHolder>{
    private final ArrayList<String> mData;
    private final Context context;
    private final ArrayList<Integer> mImageData;

    public HonzronalAdapter(Context context, ArrayList<String> honzontalRvList, ArrayList<Integer> hIv) {
        this.context=context;
        this.mData=honzontalRvList;
        this.mImageData=hIv;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_horzontalrv_data,parent, false);

        MyHolder holder=new MyHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.honzronalTv.setText(mData.get(position));
        holder.honzronalIv.setImageResource(mImageData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MyHolder extends  RecyclerView.ViewHolder{

        private final TextView honzronalTv;
        private final ImageView honzronalIv;

        public MyHolder(View itemView) {
            super(itemView);
            honzronalTv = itemView.findViewById(R.id.honzronalTv);
            honzronalIv = itemView.findViewById(R.id.bangdan);

        }
    }
}
