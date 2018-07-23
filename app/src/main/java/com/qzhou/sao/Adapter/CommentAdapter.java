package com.qzhou.sao.Adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Bean.Tou.CommentData;
import com.qzhou.sao.R;
import com.qzhou.sao.UI.Activity.NewsDetatilActivity;
import com.qzhou.sao.Utils.TimeUtils;

import java.util.List;

public class CommentAdapter extends XRecyclerView.Adapter<CommentAdapter.CommentHolder> {
    private final List<CommentData> mCommentList;
    private final NewsDetatilActivity context;


    public CommentAdapter(NewsDetatilActivity newsDetatilActivity, List<CommentData> commentResponse) {
        this.context = newsDetatilActivity;
        this.mCommentList = commentResponse;
    }

    @NonNull
    @Override
    public CommentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false);
        CommentHolder holder = new CommentHolder(view);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull CommentHolder holder, int position) {


        Glide.with(context).load(mCommentList.get(position).comment.user_profile_image_url).into((holder.touxiang));
        holder.comment.setText(mCommentList.get(position).comment.text);
        holder.pinglunDate.setText(TimeUtils.getShortTime(mCommentList.get(position).comment.create_time * 1000));
        holder.username.setText(mCommentList.get(position).comment.user_name);
        holder.zan_count.setText(""+mCommentList.get(position).comment.digg_count);
    }


    @Override
    public int getItemCount() {
        return mCommentList.size();

    }


    class CommentHolder extends XRecyclerView.ViewHolder {

        ImageView touxiang;
        TextView comment;
        TextView pinglunDate;
        TextView zan_count;
        TextView username;

        public CommentHolder(View itemView) {
            super(itemView);
            touxiang = itemView.findViewById(R.id.touxiang);
            comment = itemView.findViewById(R.id.comment);
            pinglunDate = itemView.findViewById(R.id.pinglunDate);
            zan_count = itemView.findViewById(R.id.zan_count);
            username = itemView.findViewById(R.id.username);


        }
    }


}
