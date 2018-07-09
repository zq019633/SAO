package com.qzhou.sao.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.R;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.List;

public class HomeAdapter extends XRecyclerView.Adapter implements OnBannerListener {


    public static int BANNER=0;
    public static int BUTTON=1;
    public static int TWO=2;
    public static int THREE=3;
    public static int FOUR=4;
    public static int OTHER=5;
    private final Context context;
    private final List list_path;
    private final List<HomeData.NewsBean> news;


    public HomeAdapter(Context context, List list, List<HomeData.NewsBean> responseData) {
        this.context=context;
        this.list_path=list;
        this.news=responseData;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view=null;
        RecyclerView.ViewHolder holder=null;
        if(viewType==BANNER){
            view = mInflater.inflate(R.layout.item_banner, parent, false);
            holder=new BannerHolder(view);
            return holder;

        }else if(viewType==BUTTON){
            view = mInflater.inflate(R.layout.item_btn, parent, false);
            holder=new ButtonHolder(view);
            return holder;
        }


        else{
            return  holder;
        }




    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof BannerHolder){
            ((BannerHolder) holder).sliderBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            //设置图片加载器，图片加载器在下方
            ((BannerHolder) holder).sliderBanner.setImageLoader(new MyLoader());
            //设置图片网址或地址的集合
            ((BannerHolder) holder).sliderBanner.setImages(list_path);
            //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
            ((BannerHolder) holder).sliderBanner.setBannerAnimation(Transformer.Tablet);
            //设置轮播图的标题集合
            //设置轮播间隔时间
            ((BannerHolder) holder).sliderBanner.setDelayTime(3000);
            //设置是否为自动轮播，默认是“是”。
            ((BannerHolder) holder).sliderBanner.isAutoPlay(true);
            //设置指示器的位置，小点点，左中右。
            ((BannerHolder) holder).sliderBanner.setIndicatorGravity(BannerConfig.CENTER)
                    //以上内容都可写成链式布局，这是轮播图的监听。比较重要。方法在下面。
                    .setOnBannerListener(this)
                    //必须最后调用的方法，启动轮播图。
                    .start();
        }else if(holder instanceof ButtonHolder){
            ((ButtonHolder) holder).textView.setText(news.get(position-1).getContent());
        }

    }


    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return BANNER;
        }else if(position==1){
            return BUTTON;
        }

//        else if( position%2==0&&position<6){
//            return TWO;
//        }else if(position%3==0&&position<9){
//            return THREE;
//        }else if(position%4==0&&position<12){
//            return  FOUR;
//        }

        else{
            return OTHER;
        }
    }

    @Override
    public int getItemCount() {
        return news.size()+1;

    }

    @Override
    public void OnBannerClick(int position) {


    }

    public  class BannerHolder extends XRecyclerView.ViewHolder{

        com.youth.banner.Banner sliderBanner;

        public BannerHolder(View itemView) {
            super(itemView);
            sliderBanner =  itemView.findViewById(R.id.sliderBanner);
        }
    }

    public  class ButtonHolder extends  XRecyclerView.ViewHolder{

        TextView textView;

        public ButtonHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);

        }
    }



    public class TwoHolder extends  XRecyclerView.ViewHolder{

        public TwoHolder(View itemView) {
            super(itemView);
        }
    }
    public class ThreeHolder extends  XRecyclerView.ViewHolder{

        public ThreeHolder(View itemView) {
            super(itemView);
        }
    }


    public class FourHolder extends XRecyclerView.ViewHolder{

        public FourHolder(View itemView) {
            super(itemView);
        }
    }


    public class OtherHolder extends  XRecyclerView.ViewHolder{

        public OtherHolder(View itemView) {
            super(itemView);
//            itemView.findViewById()
//

        }
    }



    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }











}
