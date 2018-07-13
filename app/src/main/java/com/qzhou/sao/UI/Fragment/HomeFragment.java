package com.qzhou.sao.UI.Fragment;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.github.nukc.stateview.StateView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Adapter.HomeAdapter;
import com.qzhou.sao.Base.BaseFragment;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;


public class HomeFragment extends BaseFragment {

    private XRecyclerView homeRv;
    private ArrayList list;
    private ArrayList<Integer> buttonList;
    private ArrayList<String> tvList;
    private ArrayList<String> adList;
    private ArrayList<Integer> topList;
    private ArrayList<String> honzronalRvList;
    private ArrayList<Integer> honzronalRvIvList;
    private List<HomeData.GoodsBean> mhomeData;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {
        homeRv = findView(R.id.homeRv);
        list = new ArrayList();
        buttonList = new ArrayList();


    }

    private void initListener() {
        final HomeData.GoodsBean bean=new HomeData.GoodsBean();
        bean.setPicurl("https://gd4.alicdn.com/imgextra/i4/380101244/TB2Ye4taZeK.eBjSszgXXczFpXa_!!380101244.jpg");
        bean.setTitle("新添加出来的");
        bean.setPrice("100.00");

        homeRv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                ToastUtil.showShort(getContext(),"刷新成功");
                homeRv.refreshComplete();
            }

            @Override
            public void onLoadMore() {

                ToastUtil.showShort(getContext(),"加载出来了");

                mhomeData.add(bean);
                mhomeData.add(bean);
                mhomeData.add(bean);
                mhomeData.add(bean);
                homeRv.refreshComplete();
            }
        });
    }

    @Override
    protected void initData(StateView mStateView) {
        buttonList.add(R.mipmap.meifa);
        buttonList.add(R.mipmap.meishi);
        buttonList.add(R.mipmap.ktv);
        buttonList.add(R.mipmap.zhanlanguan);
        buttonList.add(R.mipmap.zhoubianyou);
        buttonList.add(R.mipmap.jiuba);
        buttonList.add(R.mipmap.maoyanicon4);
        buttonList.add(R.mipmap.qinglvjiudian);
        buttonList.add(R.mipmap.play);
        buttonList.add(R.mipmap.more);

        tvList = new ArrayList();
        tvList.add("买买买");
        tvList.add("好吃哒");
        tvList.add("去唱K");
        tvList.add("游周边");
        tvList.add("出去浪");
        tvList.add("逛酒吧");
        tvList.add("看大片");
        tvList.add("住酒店");
        tvList.add("涨姿势");
        tvList.add("More");

        adList = new ArrayList<>();
        adList.add("胜比利时，法国杀入决赛");
        adList.add("iphone11价格曝光");
        adList.add("新版iphoneX将去除双下巴");


        topList = new ArrayList<>();
        topList.add(R.mipmap.hotbuy_title);
        topList.add(R.mipmap.backup_title_1);
        topList.add(R.mipmap.backup_title_2);
        topList.add(R.mipmap.promo_title_1);


        honzronalRvList = new ArrayList<>();

        honzronalRvList.add("霸王餐");
        honzronalRvList.add("必吃榜");
        honzronalRvList.add("人气榜");
        honzronalRvList.add("每日福利");
        honzronalRvList.add("霸王餐");
        honzronalRvList.add("必吃榜");
        honzronalRvList.add("人气榜");

        honzronalRvIvList = new ArrayList<>();
        honzronalRvIvList.add(R.mipmap.bangdan);
        honzronalRvIvList.add(R.mipmap.bangdan2);
        honzronalRvIvList.add(R.mipmap.bangdan4);
        honzronalRvIvList.add(R.mipmap.bangdan3);
        honzronalRvIvList.add(R.mipmap.bangdan5);
        honzronalRvIvList.add(R.mipmap.bangdan7);
        honzronalRvIvList.add(R.mipmap.bangdan6);

        initListener();


        final StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        //请求网络
        NetWork.getBanner(new Observer<HomeData>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("错误", "=" + e.toString());
            }

            @Override
            public void onNext(HomeData homedata) {


                final List<HomeData.BannerBean> responseData = homedata.getBanner();
                for (int i = 0; i < responseData.size(); i++) {
                    list.add(responseData.get(i).getPicurl());
                }

                //其他数据
                mhomeData = homedata.getGoods();
                final HomeAdapter adapter = new HomeAdapter(getContext(), list, mhomeData);

                // 顶部轮播图
                adapter.setBannerData(list);


                //中间的10个Button
                // View buttonView= View.inflate(getContext(),R.layout.item_button,null);
                //adapter.addHeaderButton(buttonView,buttonList,tvList);
                adapter.setHeaderButtonData(buttonList, tvList);


                //广告 滚动条
                // View adView= View.inflate(getContext(),R.layout.item_ad,null);
                adapter.setAdData(adList);
                //  adapter.addAd(adView,adList);


                //推荐的
//                View topView= View.inflate(getContext(),R.layout.item_top,null);
//                adapter.addTop(topView,homedata.getHomeData(),topList);
                adapter.setTopData(homedata.getHomeData(), topList);


                //水平滚动的recycleView
//                View horzontalView =View.inflate(getContext(),R.layout.item_horzontalrv,null);
                adapter.setHorzontalData(honzronalRvList, honzronalRvIvList);

//                View adImage =View.inflate(getContext(),R.layout.item_adiv,null);
//                adapter.addHorzontanView(adImage, (String) list.get(0));


                homeRv.setLayoutManager(sglm);
                homeRv.setAdapter(adapter);


            }
        });
    }

}