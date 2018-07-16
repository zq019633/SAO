package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.TouResponseBean;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.TimeUtils;

import java.util.List;

public class RecommodAdapter extends XRecyclerView.Adapter{

    /**
     * 纯文字布局(文章、广告)
     */
    public static final int TEXT_NEWS = 100;
    /**
     * 居中大图布局(1.单图文章；2.单图广告；3.视频，中间显示播放图标，右侧显示时长)
     */
    public static final int CENTER_SINGLE_PIC_NEWS = 200;
    /**
     * 右侧小图布局(1.小图新闻；2.视频类型，右下角显示视频时长)
     */
    public static final int RIGHT_PIC_VIDEO_NEWS = 300;
    /**
     * 三张图片布局(文章、广告)
     */
    public static final int THREE_PICS_NEWS = 400;

    private final Context context;
    private final List<News> data;
    public RecommodAdapter(Context context, List<News> data) {
        this.context=context;
        this.data=data;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=null;
        LayoutInflater mInflater=LayoutInflater.from(context);;
        if(viewType==TEXT_NEWS){
            view= mInflater.inflate(R.layout.item_layouttext, parent,false);
            TextNewsItem holder=new TextNewsItem(view);
            return holder;
        }



        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof TextNewsItem){
            ((TextNewsItem) holder).newsTitle.setText(data.get(position).title);
            ((TextNewsItem) holder).newsFrom.setText(data.get(position).source);
            ((TextNewsItem) holder).newsIsTop.setText(data.get(position).title);
            ((TextNewsItem) holder).newsPinglun.setText(data.get(position).comment_count+"评论");
            ((TextNewsItem) holder).newsTime.setText(TimeUtils.getShortTime(data.get(position).behot_time * 1000));

        }
    }


    @Override
    public int getItemViewType(int position) {
        //如果是有视频的  判断视频在左边 还是右边
        News news = data.get(position);
        if(news.has_video){
            if(news.video_style==0) {
                if (news.middle_image == null) {
                    return  TEXT_NEWS;
                }
                return RIGHT_PIC_VIDEO_NEWS;
            }else if(news.video_style==2){
                return CENTER_SINGLE_PIC_NEWS;
            }
        }


        //非视频的新闻
        else{
            if(!news.has_image){
                return TEXT_NEWS;
            }else{
                if(news.image_list==null){
                    return RIGHT_PIC_VIDEO_NEWS;
                }
                if (news.gallary_image_count == 3) {
                    //图片数为3，则为三图
                    return THREE_PICS_NEWS;
                }

                //中间大图，右下角显示图数
                return CENTER_SINGLE_PIC_NEWS;


            }
        }

       return TEXT_NEWS;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class TextNewsItem extends XRecyclerView.ViewHolder{

        private final TextView newsTitle;
        private final TextView newsFrom;
        private final TextView newsIsTop;

        private final TextView newsPinglun;
        private final TextView newsTime;

        public TextNewsItem(View itemView) {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.newsTitle);
            newsFrom = itemView.findViewById(R.id.newsFrom);
            newsIsTop = itemView.findViewById(R.id.newsIsTop);
            newsPinglun = itemView.findViewById(R.id.newsPinglun);
            newsTime = itemView.findViewById(R.id.newsTime);


        }
    }

    class CenterPicItem extends XRecyclerView.ViewHolder{

        public CenterPicItem(View itemView) {
            super(itemView);

        }
    }

    class RightPicItem extends XRecyclerView.ViewHolder{

        public RightPicItem(View itemView) {
            super(itemView);

        }
    }

    class ThreePicItem extends XRecyclerView.ViewHolder{

        public ThreePicItem(View itemView) {
            super(itemView);

        }
    }




}

