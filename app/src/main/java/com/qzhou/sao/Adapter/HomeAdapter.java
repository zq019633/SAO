package com.qzhou.sao.Adapter;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.InterfacePackage.OnItemClickListener;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.ToastUtil;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends XRecyclerView.Adapter implements OnBannerListener {


    public static int BANNER = 0;
    public static int BUTTON = 1;
    public static int AD = 2;
    public static int HOMETOP = 3;
    public static final int HONZROALVIEW = 4;

    private static final int ADIMAGE = 5;

    private final Context context;

    private final List<HomeData.NewsBean> news;
    private ArrayList bannerData;


    private ArrayList<Integer> mButtonData;
    private View buttonView;
    private ArrayList<String> tvList;
    private ArrayList<String> adList;
    private View adView;
    private View topView;
    private List<HomeData.HomeDataBean> homeData;
    private ArrayList<Integer> topTitle;
    private View horzontalRView;
    private ArrayList<String> honzontalRvList;
    private ArrayList<Integer> hIv;
    private View adImage;
    private String adUrl;


    public HomeAdapter(Context context, List list, List<HomeData.NewsBean> responseData) {
        this.context = context;
        this.news = responseData;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view = null;
        RecyclerView.ViewHolder holder = null;
        if (viewType == BANNER) {
            view = mInflater.inflate(R.layout.item_banner, parent, false);
            holder = new BannerHolder(view);
            return holder;

        } else if (viewType == BUTTON) {
            holder = new ButtonHolder(buttonView);
            return holder;
        } else if (viewType == AD) {
            holder = new AdHolder(adView);

            return holder;
        } else if (viewType == HOMETOP) {
            holder = new TopHolder(topView);
            return holder;
        } else if (viewType == HONZROALVIEW) {
            holder = new HonzronalRvHolder(horzontalRView);
            return holder;
        } else if(viewType==ADIMAGE){
            holder=new AdImageHolder(adImage);
            return holder;
        }


        else {
            return holder;
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof BannerHolder) {
            ((BannerHolder) holder).sliderBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            //设置图片加载器，图片加载器在下方
            ((BannerHolder) holder).sliderBanner.setImageLoader(new MyLoader());
            //设置图片网址或地址的集合
            ((BannerHolder) holder).sliderBanner.setImages(bannerData);
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
        } else if (holder instanceof ButtonHolder) {
            GridLayoutManager layoutManage = new GridLayoutManager(context, 5);
            ((ButtonHolder) holder).brv.setLayoutManager(layoutManage);
            ((ButtonHolder) holder).brv.setAdapter(new ButtonAdapter(context, mButtonData, tvList));

        } else if (holder instanceof AdHolder) {
            for (int i = 0; i < adList.size(); i++) {
                View currentView = LayoutInflater.from(context).inflate(R.layout.item_ad_data, null);
                TextView tv = currentView.findViewById(R.id.name);
                tv.setText(adList.get(i));
                currentView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ToastUtil.showShort(context, "我被点击了");
                    }
                });

                ((AdHolder) holder).adVf.addView(currentView);
            }
        } else if (holder instanceof TopHolder) {
            ((TopHolder) holder).topRv.setLayoutManager(new GridLayoutManager(context, 2));
            TopAdapter topAdapter = new TopAdapter(context, homeData, topTitle);
            ((TopHolder) holder).topRv.setAdapter(topAdapter);

            topAdapter.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Log.e("11", "11" + position);
                }
            });
        } else if (holder instanceof HonzronalRvHolder) {
            ((HonzronalRvHolder) holder).honzronalRv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            HonzronalAdapter honAdapter = new HonzronalAdapter(context, honzontalRvList, hIv);
            ((HonzronalRvHolder) holder).honzronalRv.setAdapter(honAdapter);

        }else if(holder instanceof AdImageHolder){
            Glide.with(context).load(adUrl).into(((AdImageHolder) holder).adimage);
        }

    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return BANNER;
        } else if (position == 1 && buttonView != null) {
            return BUTTON;
        } else if (position == 2 && adView != null) {
            return AD;
        } else if (position == 3 && topView != null) {
            return HOMETOP;
        } else if (position == 4 && horzontalRView != null) {
            return HONZROALVIEW;
        } else if (position == 5 && adImage != null) {
            return ADIMAGE;
        }

//        else if (position == 6 && topView != null) {
//            return HOMETOP;
//        }


        else {
            return BANNER;
        }
    }

    public void addHeaderButton(View v, ArrayList<Integer> buttonList, ArrayList<String> list) {
        this.buttonView = v;
        this.mButtonData = buttonList;
        this.tvList = list;

    }


    @Override
    public int getItemCount() {
        return news.size() + 6;

    }

    @Override
    public void OnBannerClick(int position) {


    }

    public void setBannerData(ArrayList list) {
        this.bannerData = list;
    }

    public void addAd(View adView, ArrayList<String> adList) {
        this.adList = adList;
        this.adView = adView;
    }

    public void addTop(View topView, List<HomeData.HomeDataBean> homedata, ArrayList<Integer> topList) {
        this.topView = topView;
        this.homeData = homedata;
        this.topTitle = topList;
    }

    public void addHorzontanView(View horzontalView, ArrayList<String> honzronalRvList, ArrayList<Integer> honzronalRvIvList) {
        this.horzontalRView = horzontalView;
        this.honzontalRvList = honzronalRvList;
        this.hIv = honzronalRvIvList;
    }

    public void addHorzontanView(View adImage, String o) {
        this.adImage = adImage;
        this.adUrl = o;
    }

//第一个条目 轮播图

    public class BannerHolder extends XRecyclerView.ViewHolder {

        com.youth.banner.Banner sliderBanner;

        public BannerHolder(View itemView) {
            super(itemView);
            sliderBanner = itemView.findViewById(R.id.sliderBanner);
        }
    }


    //第二个条目 10个按钮
    public class ButtonHolder extends XRecyclerView.ViewHolder {

        RecyclerView brv;

        public ButtonHolder(View itemView) {
            super(itemView);
            brv = itemView.findViewById(R.id.btnRv);


        }
    }

    //第三个条目
    public class AdHolder extends XRecyclerView.ViewHolder {


        ViewFlipper adVf;

        public AdHolder(View itemView) {
            super(itemView);
            adVf = itemView.findViewById(R.id.adVf);


        }
    }


    //第四个条目
    public class TopHolder extends XRecyclerView.ViewHolder {

        RecyclerView topRv;

        public TopHolder(View itemView) {
            super(itemView);
            topRv = itemView.findViewById(R.id.topRv);


        }
    }

    public class HonzronalRvHolder extends XRecyclerView.ViewHolder {

        RecyclerView honzronalRv;

        public HonzronalRvHolder(View itemView) {
            super(itemView);
            honzronalRv = itemView.findViewById(R.id.honzronalRv);


        }
    }


    public class AdImageHolder extends XRecyclerView.ViewHolder {

        ImageView adimage;

        public AdImageHolder(View itemView) {
            super(itemView);
            adimage = itemView.findViewById(R.id.adimage);


        }
    }


    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }


}
