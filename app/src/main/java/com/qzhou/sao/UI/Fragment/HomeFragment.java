package com.qzhou.sao.UI.Fragment;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qzhou.sao.Adapter.HomeAdapter;
import com.qzhou.sao.Base.BaseFragment;

import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;



public class HomeFragment extends BaseFragment {

    private RecyclerView homeRv;
    private ArrayList list;
    private ArrayList buttonList;

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

    @Override
    protected void initData() {
        buttonList.add(R.mipmap.bt1);
        buttonList.add(R.mipmap.bt2);
        buttonList.add(R.mipmap.bt3);
        buttonList.add(R.mipmap.bt4);
        buttonList.add(R.mipmap.bt5);
        buttonList.add(R.mipmap.bt6);
        buttonList.add(R.mipmap.bt7);
        buttonList.add(R.mipmap.bt8);


        homeRv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
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

                final List<HomeData.BannerBean> responseData =homedata.getBanner();
                for(int i=0;i<responseData.size();i++){
                    list.add(responseData.get(i).getPicurl());
                }

                List<HomeData.NewsBean> news = homedata.getNews();


                HomeAdapter adapter=new HomeAdapter(getContext(),list,news);
                homeRv.setAdapter(adapter);






            }
        });
    }
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }
    }

}