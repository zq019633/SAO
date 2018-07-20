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
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.TouResponseBean;
import com.qzhou.sao.Custom.SampleCoverVideo;
import com.qzhou.sao.InterfacePackage.NewsOnItemClickListener;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.TimeUtils;
import com.qzhou.sao.Utils.ToastUtil;

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


    private NewsOnItemClickListener OnItemClickListener;
    public void setNewsOnItemClickListener(NewsOnItemClickListener onItemClickListener){
        this.OnItemClickListener=onItemClickListener;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {
        View view=null;
        LayoutInflater mInflater=LayoutInflater.from(context);;
        if(viewType==TEXT_NEWS){
            view= mInflater.inflate(R.layout.item_layouttext, parent,false);
            TextNewsItem holder=new TextNewsItem(view);
            return holder;
        }else if(viewType==CENTER_SINGLE_PIC_NEWS){
            view=mInflater.inflate(R.layout.item_layoutcenterpic,parent,false);
            CenterPicItem holder=new CenterPicItem(view);
            return  holder;

        }else if(viewType==RIGHT_PIC_VIDEO_NEWS){
            view =mInflater.inflate(R.layout.item_layoutrightpic,parent,false);
            RightPicItem holder =new RightPicItem(view);
            return holder;
        }else if(viewType==THREE_PICS_NEWS){
            view=mInflater.inflate(R.layout.item_layoutthreepic,parent,false);
            ThreePicItem holder=new ThreePicItem(view);
            return holder;
        }



        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {

        if(holder instanceof TextNewsItem){

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClickListener.onItemClick(position,holder.itemView,TEXT_NEWS);
                }
            });

            ((TextNewsItem) holder).newsTitle.setText(data.get(position).title);
            ((TextNewsItem) holder).newsFrom.setText(data.get(position).source);

            if(position==0){
                ((TextNewsItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((TextNewsItem) holder).newsIsTop.setText("置顶");
            }

            if(data.get(position).hot==1){
                ((TextNewsItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((TextNewsItem) holder).newsIsTop.setText("热点");
            }


            ((TextNewsItem) holder).newsPinglun.setText(data.get(position).comment_count+"评论");
            ((TextNewsItem) holder).newsTime.setText(TimeUtils.getShortTime(data.get(position).behot_time * 1000));

        }else if(holder instanceof CenterPicItem){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClickListener.onItemClick(position,holder.itemView,CENTER_SINGLE_PIC_NEWS);
                }
            });

            ((CenterPicItem) holder).newsTitle.setText(data.get(position).title);
            ((CenterPicItem) holder).newsFrom.setText(data.get(position).source);

            if(position==0){
                ((CenterPicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((CenterPicItem) holder).newsIsTop.setText("置顶");
            }

            if(data.get(position).hot==1){
                ((CenterPicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((CenterPicItem) holder).newsIsTop.setText("热点");
            }


            ((CenterPicItem) holder).newsPinglun.setText(data.get(position).comment_count+"评论");
            ((CenterPicItem) holder).newsTime.setText(TimeUtils.getShortTime(data.get(position).behot_time * 1000));


            if(data.get(position).has_video ){
                ((CenterPicItem) holder).iv_play.setVisibility(View.VISIBLE);
                ((CenterPicItem) holder).cenNewsPic.setVisibility(View.VISIBLE);
                Glide.with(context).load(data.get(position).video_detail_info.detail_video_large_image.url).into(((CenterPicItem) holder).cenNewsPic);
                ((CenterPicItem) holder).cenNewsDate.setVisibility(View.VISIBLE);

                ((CenterPicItem) holder).cenNewsDate.setText(TimeUtils.secToTime(data.get(position).video_duration ));

                if(data.get(position).video_style==2) {
                    ((CenterPicItem) holder).iv_play.setVisibility(View.VISIBLE);
                    ((CenterPicItem) holder).cenNewsPic.setVisibility(View.VISIBLE);
                    Glide.with(context).load(data.get(position).video_detail_info.detail_video_large_image.url).into(((CenterPicItem) holder).cenNewsPic);
                    ((CenterPicItem) holder).cenNewsDate.setVisibility(View.VISIBLE);
                    ((CenterPicItem) holder).cenNewsDate.setText(TimeUtils.secToTime(data.get(position).video_duration ));
                }
            }else {
                ((CenterPicItem) holder).iv_play.setVisibility(View.GONE);
                ((CenterPicItem) holder).cenNewsPic.setVisibility(View.VISIBLE);
                ((CenterPicItem) holder).cenNewsDate.setVisibility(View.VISIBLE);
                ((CenterPicItem) holder).cenNewsDate.setText(data.get(position).gallary_image_count+"图");
                Glide.with(context).load(data.get(position).image_list.get(0).url).into(((CenterPicItem) holder).cenNewsPic);
            }




        }else if(holder instanceof  RightPicItem){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClickListener.onItemClick(position,holder.itemView,RIGHT_PIC_VIDEO_NEWS);
                }
            });
            ((RightPicItem) holder).newsTitle.setText(data.get(position).title);
            ((RightPicItem) holder).newsFrom.setText(data.get(position).source);
            if(position==0){
                ((RightPicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((RightPicItem) holder).newsIsTop.setText("置顶");
            }


            if(data.get(position).hot==1){
                ((RightPicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((RightPicItem) holder).newsIsTop.setText("热点");
            }


            ((RightPicItem) holder).newsPinglun.setText(data.get(position).comment_count+"评论");
            ((RightPicItem) holder).newsTime.setText(TimeUtils.getShortTime(data.get(position).behot_time * 1000));

            if(data.get(position).has_video){
                ((RightPicItem) holder).right_pic.setVisibility(View.VISIBLE);
                ((RightPicItem) holder).right_time.setVisibility(View.VISIBLE);
                Glide.with(context).load(data.get(position).middle_image.url).into(((RightPicItem) holder).right_pic);
                ((RightPicItem) holder).right_time.setText(TimeUtils.secToTime(data.get(position).video_duration));

            }else{
                ((RightPicItem) holder).right_time.setVisibility(View.INVISIBLE);
                Glide.with(context).load(data.get(position).middle_image.url).into(((RightPicItem) holder).right_pic);
            }


        }else if(holder instanceof ThreePicItem){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClickListener.onItemClick(position,holder.itemView,THREE_PICS_NEWS);
                }
            });
            if(position==0){
                ((ThreePicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((ThreePicItem) holder).newsIsTop.setText("置顶");
            }

            if(data.get(position).hot==1){
                ((ThreePicItem) holder).newsIsTop.setVisibility(View.VISIBLE);
                ((ThreePicItem) holder).newsIsTop.setText("热点");
            }


            ((ThreePicItem) holder).newsTitle.setText(data.get(position).title);
            ((ThreePicItem) holder).newsFrom.setText(data.get(position).source);

            ((ThreePicItem) holder).newsPinglun.setText(data.get(position).comment_count+"评论");
            ((ThreePicItem) holder).newsTime.setText(TimeUtils.getShortTime(data.get(position).behot_time * 1000));

            Glide.with(context).load(data.get(position).image_list.get(0).url).into(((ThreePicItem) holder).threeNewsPic1);
            Glide.with(context).load(data.get(position).image_list.get(1).url).into(((ThreePicItem) holder).threeNewsPic2);
            Glide.with(context).load(data.get(position).image_list.get(2).url).into(((ThreePicItem) holder).threeNewsPic3);


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

    public class TextNewsItem extends XRecyclerView.ViewHolder{

        private final TextView newsTitle;
        private final TextView newsFrom;
        private final TextView newsIsTop;

        private final TextView newsPinglun;
        private final TextView newsTime;

        public TextNewsItem(View itemView) {
            super(itemView);
            newsTitle = itemView.findViewById(R.id.newsTitle);
            newsFrom = itemView.findViewById(R.id.NewsFrom);
            newsIsTop = itemView.findViewById(R.id.NewsIsTop);
            newsPinglun = itemView.findViewById(R.id.NewsPinglun);
            newsTime = itemView.findViewById(R.id.NewsTime);




        }
    }

    class CenterPicItem extends XRecyclerView.ViewHolder{
        private final TextView newsTitle;
        private final TextView newsFrom;
        private final TextView newsIsTop;

        private final TextView newsPinglun;
        private final TextView newsTime;


        private final SampleCoverVideo video;
        private final ImageView cenNewsPic;
        private final TextView cenNewsDate;
        private final ImageView iv_play;

        public CenterPicItem(View itemView) {
            super(itemView);
            newsFrom = itemView.findViewById(R.id.NewsFrom);
            newsIsTop = itemView.findViewById(R.id.NewsIsTop);
            newsPinglun = itemView.findViewById(R.id.NewsPinglun);
            newsTime = itemView.findViewById(R.id.NewsTime);
            newsTitle=itemView.findViewById(R.id.centerNewsTitle);


            iv_play = itemView.findViewById(R.id.iv_play);
            video = itemView.findViewById(R.id.scv);
            cenNewsPic = itemView.findViewById(R.id.centerNewsPic);
            cenNewsDate =itemView.findViewById(R.id.centerNewsDate);

        }
    }

    class RightPicItem extends XRecyclerView.ViewHolder{
        private final TextView newsTitle;
        private final TextView newsFrom;
        private final TextView newsIsTop;
        private final TextView newsPinglun;
        private final TextView newsTime;


        private final ImageView right_pic;
        private final TextView right_time;

        public RightPicItem(View itemView) {
            super(itemView);
            newsFrom = itemView.findViewById(R.id.NewsFrom);
            newsIsTop = itemView.findViewById(R.id.NewsIsTop);
            newsPinglun = itemView.findViewById(R.id.NewsPinglun);
            newsTime = itemView.findViewById(R.id.NewsTime);
            newsTitle=itemView.findViewById(R.id.rigntNewsTitle);

            right_pic = itemView.findViewById(R.id.right_pic);
            right_time = itemView.findViewById(R.id.right_time);

        }
    }

    class ThreePicItem extends XRecyclerView.ViewHolder{
        private final TextView newsTitle;
        private final TextView newsFrom;
        private final TextView newsIsTop;
        private final TextView newsPinglun;
        private final TextView newsTime;

        private final ImageView threeNewsPic1;
        private final ImageView threeNewsPic2;
        private final ImageView threeNewsPic3;


        public ThreePicItem(View itemView) {
            super(itemView);
            newsFrom = itemView.findViewById(R.id.NewsFrom);
            newsIsTop = itemView.findViewById(R.id.NewsIsTop);
            newsPinglun = itemView.findViewById(R.id.NewsPinglun);
            newsTime = itemView.findViewById(R.id.NewsTime);
            newsTitle=itemView.findViewById(R.id.ThreeNewsTitle);

            threeNewsPic1=itemView.findViewById(R.id.threeNewsPic1);
            threeNewsPic2=itemView.findViewById(R.id.threeNewsPic2);
            threeNewsPic3=itemView.findViewById(R.id.threeNewsPic3);

        }
    }




}

