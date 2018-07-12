package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.qzhou.sao.R;

import java.util.ArrayList;

public class ButtonAdapter extends RecyclerView.Adapter<ButtonAdapter.MyHolder> {
    private final Context context;
    private final ArrayList mButtonData;
    private final ArrayList<String> tvList;

    public ButtonAdapter(Context context, ArrayList<Integer> mButtonData, ArrayList<String> tvList) {
        this.context=context;
        this.mButtonData=mButtonData;
        this.tvList=tvList;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_btn_data, null);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
       holder.imageView.setImageResource((Integer) mButtonData.get(position));
        holder.textView.setText(tvList.get(position));

    }

    @Override
    public int getItemCount() {
        Log.e("文字","="+tvList);
        Log.e("文字","="+mButtonData);


        return mButtonData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
         TextView textView;

        public MyHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.btn_iv);
            textView = itemView.findViewById(R.id.btn_tv);
        }
    }


}
