package com.qzhou.sao.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.InterfacePackage.OnItemClickListener;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.ToastUtil;
import com.youth.banner.Banner;
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
    private static final int ADITEM = 6;
    private static final int OTHER = 7;

    private static final int RECOMMEND = 8;


    private final Context context;

    private final List<HomeData.GoodsBean> goods;
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


    public HomeAdapter(Context context, List list, List<HomeData.GoodsBean> responseData) {
        this.context = context;
        this.goods = responseData;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view = null;
        RecyclerView.ViewHolder holder = null;
        StaggeredGridLayoutManager.LayoutParams clp = null;
        if (viewType == BANNER) {
            view = mInflater.inflate(R.layout.item_banner, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);

            holder = new BannerHolder(view);
            return holder;

        } else if (viewType == BUTTON) {

            view = mInflater.inflate(R.layout.item_button, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);
            holder = new ButtonHolder(view);

            return holder;


        } else if (viewType == AD) {

            view = mInflater.inflate(R.layout.item_ad, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);
            holder = new AdHolder(view);


            return holder;
        } else if (viewType == HOMETOP) {
            view = mInflater.inflate(R.layout.item_top, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);
            holder = new TopHolder(view);
            return holder;


        } else if (viewType == HONZROALVIEW) {
            view = mInflater.inflate(R.layout.item_horzontalrv, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);
            holder = new HonzronalRvHolder(view);
            return holder;
        } else if (viewType == ADIMAGE) {
            view = mInflater.inflate(R.layout.item_adiv, parent, false);
            clp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            clp.setFullSpan(true);
            holder = new AdImageHolder(view);
            return holder;

        } else if (viewType == ADITEM) {
            view = mInflater.inflate(R.layout.item_aditem, parent, false);


            holder = new AdItemHolder(view);
            return holder;

        } else {
            //正常布局

            if (viewType == RECOMMEND) {
                View recommond = mInflater.inflate(R.layout.item_aditem, parent, false);
                holder = new RecommodHolder(recommond);
                return holder;
            } else {
                View other = mInflater.inflate(R.layout.item_other, parent, false);
                holder = new OtherHolder(other);
                return holder;
            }
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof BannerHolder) {


            ((BannerHolder) holder).sliderBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            //设置图片加载器，图片加载器在下方
            ((BannerHolder) holder).sliderBanner.setImageLoader(new MyLoader());
            //设置图片网址或地址的集合
            ((BannerHolder) holder).sliderBanner.setImages(bannerData);
            //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
            ((BannerHolder) holder).sliderBanner.setBannerAnimation(Transformer.Default);
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


            RecyclerView recyclerView = ((ButtonHolder) holder).brv.findViewById(R.id.btnRv);
            GridLayoutManager layoutManage = new GridLayoutManager(context, 5);
            recyclerView.setLayoutManager(layoutManage);
            recyclerView.setAdapter(new ButtonAdapter(context, mButtonData, tvList));


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

        } else if (holder instanceof AdImageHolder) {
//            Glide.with(context).load("https://image3.suning.cn/uimg/cms/img/153120403523467123.jpg").into(((AdImageHolder) holder).adimage);
            bannerData.clear();
            bannerData.add("https://image3.suning.cn/uimg/cms/img/153120403523467123.jpg");
            bannerData.add("https://image3.suning.cn/uimg/cms/img/153120403523467123.jpg");
            bannerData.add("https://image3.suning.cn/uimg/cms/img/153120403523467123.jpg");
            ((AdImageHolder) holder).adbanner.setBannerStyle(BannerConfig.NOT_INDICATOR);
            //设置图片加载器，图片加载器在下方
            ((AdImageHolder) holder).adbanner.setImageLoader(new MyLoader());
            //设置图片网址或地址的集合
            ((AdImageHolder) holder).adbanner.setImages(bannerData);
            //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
            ((AdImageHolder) holder).adbanner.setBannerAnimation(Transformer.Accordion);
            //设置轮播图的标题集合
            //设置轮播间隔时间
            ((AdImageHolder) holder).adbanner.setDelayTime(3000);
            //设置是否为自动轮播，默认是“是”。
            ((AdImageHolder) holder).adbanner.isAutoPlay(true);
            //设置指示器的位置，小点点，左中右。
            ((AdImageHolder) holder).adbanner.setIndicatorGravity(BannerConfig.CENTER)
                    //以上内容都可写成链式布局，这是轮播图的监听。比较重要。方法在下面。
                    .setOnBannerListener(this)
                    //必须最后调用的方法，启动轮播图。
                    .start();

        } else if (holder instanceof AdItemHolder) {

            Glide.with(context).load("https://gd4.alicdn.com/imgextra/i4/380101244/TB2Ye4taZeK.eBjSszgXXczFpXa_!!380101244.jpg").into(((AdItemHolder) holder).ad_item_iv);
            ((AdItemHolder) holder).ad_item_tv.setText("置顶");
           ((AdItemHolder) holder).ad_item_tv.setTextColor(context.getColor(R.color.tb));


        } else if (holder instanceof RecommodHolder) {
            Glide.with(context).load("https://img12.360buyimg.com/babel/s350x226_jfs/t23638/75/348915468/113508/87f9deb3/5b2ccaabN33f6ef28.jpg!q90!cr_558x360_385_0").into(((RecommodHolder) holder).recommod_iv);

        } else if (holder instanceof OtherHolder) {
            Glide.with(context).load(goods.get(position - 7).getPicurl()).into(((OtherHolder) holder).goodPic);
            ((OtherHolder) holder).goodName.setText(goods.get(position - 7).getTitle());
            ((OtherHolder) holder).goodDetatil.setText("¥:" + goods.get(position - 7).getPrice());


        }


    }


    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return BANNER;
        } else if (position == 1) {
            return BUTTON;
        } else if (position == 2) {
            return AD;
        } else if (position == 3) {
            return HOMETOP;
        } else if (position == 4) {
            return HONZROALVIEW;
        } else if (position == 5) {
            return ADIMAGE;
        } else if (position == 6) {
            return ADITEM;
        } else {
            //正常布局
            if (position > 6 && position % 2 == 0 && position < 30) {
                return RECOMMEND;
            } else {
                return OTHER;
            }
        }
    }

    public void addHeaderButton(View v, ArrayList<Integer> buttonList, ArrayList<String> list) {
        this.buttonView = v;


    }


    @Override
    public int getItemCount() {
        return goods.size() + 7;

    }

    @Override
    public void OnBannerClick(int position) {


    }

    public void setBannerData(ArrayList list) {
        Log.e("zq", "添加头成功");
        this.bannerData = list;
    }

    public void addAd(View adView, ArrayList<String> adList) {
        this.adList = adList;
        this.adView = adView;
    }

    public void addTop(View topView, List<HomeData.HomeDataBean> homedata, ArrayList<Integer> topList) {
        this.topView = topView;

    }

    public void addHorzontanView(View horzontalView, ArrayList<String> honzronalRvList, ArrayList<Integer> honzronalRvIvList) {
    }

    public void setHorzontalData(ArrayList<String> honzronalRvList, ArrayList<Integer> honzronalRvIvList) {
        this.hIv = honzronalRvIvList;
        this.honzontalRvList = honzronalRvList;
    }


    public void addHorzontanView(View adImage, String o) {
        this.adImage = adImage;
        this.adUrl = o;
    }

    public void setAdData(ArrayList<String> adList) {
        this.adList = adList;
    }

    public void setTopData(List<HomeData.HomeDataBean> homeData, ArrayList<Integer> adList) {
        this.homeData = homeData;
        this.topTitle = adList;
    }

    public void setHeaderButtonData(ArrayList<Integer> buttonList, ArrayList<String> tvList) {
        this.mButtonData = buttonList;
        this.tvList = tvList;
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
        Banner adbanner;

        public AdImageHolder(View itemView) {
            super(itemView);
//            adimage = itemView.findViewById(R.id.adimage);
            adbanner = itemView.findViewById(R.id.adBanner);


        }
    }


    public class AdItemHolder extends XRecyclerView.ViewHolder {

        ImageView ad_item_iv;
        private final TextView ad_item_tv;

        public AdItemHolder(View itemView) {
            super(itemView);
            ad_item_iv = itemView.findViewById(R.id.ad_item_iv);
            ad_item_tv = itemView.findViewById(R.id.adname);


        }
    }


    public class RecommodHolder extends XRecyclerView.ViewHolder {

        ImageView recommod_iv;

        public RecommodHolder(View itemView) {
            super(itemView);
            recommod_iv = itemView.findViewById(R.id.ad_item_iv);


        }
    }


    public class OtherHolder extends XRecyclerView.ViewHolder {

        ImageView goodPic;
        TextView goodName;
        TextView goodDetatil;

        public OtherHolder(View itemView) {
            super(itemView);
            goodPic = itemView.findViewById(R.id.goodPic);
            goodName = itemView.findViewById(R.id.goodName);
            goodDetatil = itemView.findViewById(R.id.goodDetatil);


        }
    }


    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }


}
