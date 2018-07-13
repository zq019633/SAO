package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Bean.TouBean;
import com.qzhou.sao.Custom.SampleCoverVideo;
import com.qzhou.sao.R;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends XRecyclerView.Adapter<VideoAdapter.MyHolder> {
    public static final String TAG = "VideoAdapter";
    private final List<TouBean.DataBean.DisplayBean.HitsBean> videoList;
    private final Context context;


    public VideoAdapter(Context context, List<TouBean.DataBean.DisplayBean.HitsBean> videoList) {
        this.videoList = videoList;
        this.context = context;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }



    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, int position) {
        holder.gsyVideoPlayer.setUpLazy(videoList.get(position).getVideo_url(), true, null, null, "这是title");
//增加title
        holder.gsyVideoPlayer.getTitleTextView().setVisibility(View.GONE);
//设置返回键
        holder.gsyVideoPlayer.getBackButton().setVisibility(View.GONE);
//设置全屏按键功能
        holder.gsyVideoPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.gsyVideoPlayer.startWindowFullscreen(context, false, true);
            }
        });
//防止错位设置

        holder.gsyVideoPlayer.setPlayPosition(position);
//是否根据视频尺寸，自动选择竖屏全屏或者横屏全屏
        holder.gsyVideoPlayer.setAutoFullWithSize(true);
//音频焦点冲突时是否释放
        holder.gsyVideoPlayer.setReleaseWhenLossAudio(false);
//全屏动画
        holder.gsyVideoPlayer.setShowFullAnimation(true);
//小屏时不触摸滑动
        holder.gsyVideoPlayer.setIsTouchWiget(false);
        holder.gsyVideoPlayer.setPlayTag(TAG);




       holder.gsyVideoPlayer.loadCoverImage(videoList.get(position).getVideo_url(),0);



    }

    @Override
    public int getItemCount() {
        return videoList.size();
    }


    class MyHolder extends XRecyclerView.ViewHolder {

        SampleCoverVideo gsyVideoPlayer;

        public MyHolder(View itemView) {
            super(itemView);
            gsyVideoPlayer = itemView.findViewById(R.id.detail_player);


        }
    }
}
