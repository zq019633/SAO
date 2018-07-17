package com.qzhou.sao.UI.Fragment.WtFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.github.nukc.stateview.StateView;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import com.qzhou.sao.Adapter.RecommodAdapter;
import com.qzhou.sao.Base.BaseFragment;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.TouResponseBean;
import com.qzhou.sao.InterfacePackage.NewsOnItemClickListener;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.qzhou.sao.UI.Activity.VideoDetailActivity;
import com.qzhou.sao.Utils.ToastUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import rx.Observer;

public class TopFragment extends BaseFragment {

    public XRecyclerView recommodRv;
    private List<News> newsList;
    private RecommodAdapter adapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_top;
    }

    @Override
    protected void initView() {
        recommodRv = findView(R.id.recommodRv);
        recommodRv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recommodRv.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

    }

    @Override
    protected void initData(StateView mStateView) {

        recommodRv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                long lastTime = System.currentTimeMillis() / 1000;
                NetWork.getTouResponse("", lastTime, System.currentTimeMillis() / 1000, new Observer<TouResponseBean>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(TouResponseBean touResponseBean) {
                        List<TouResponseBean.DataBean> data = touResponseBean.getData();
                        newsList.clear();
                        for (TouResponseBean.DataBean newsData : data) {
                            News news = new Gson().fromJson(newsData.getContent(), News.class);
                            newsList.add(news);
                        }
                        recommodRv.refreshComplete();


                    }
                });

            }

            @Override
            public void onLoadMore() {
                long lastTime = System.currentTimeMillis() / 1000;
                NetWork.getTouResponse("", lastTime, System.currentTimeMillis() / 1000, new Observer<TouResponseBean>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(TouResponseBean touResponseBean) {
                        List<TouResponseBean.DataBean> data = touResponseBean.getData();
                        for (int i = 0; i < data.size(); i++) {
                            if (i > 2) {
                                News news = new Gson().fromJson(data.get(i).getContent(), News.class);
                                newsList.add(news);
                            }
                        }
                        recommodRv.refreshComplete();
                    }
                });


            }
        });


        long lastTime = System.currentTimeMillis() / 1000;
        NetWork.getTouResponse("", lastTime, System.currentTimeMillis() / 1000, new Observer<TouResponseBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(TouResponseBean touResponseBean) {


                List<TouResponseBean.DataBean> data = touResponseBean.getData();
                newsList = new ArrayList<>();
                for (TouResponseBean.DataBean newsData : data) {
                    News news = new Gson().fromJson(newsData.getContent(), News.class);
                    newsList.add(news);
                }

                adapter = new RecommodAdapter(getContext(), newsList);
                recommodRv.setAdapter(adapter);

                adapter.setNewsOnItemClickListener(new NewsOnItemClickListener() {
                    @Override
                    public void onItemClick(int position, View view) {
                        if (newsList.get(position).has_video) {
                            Intent intent = new Intent(getContext(), VideoDetailActivity.class);
                            intent.putExtra("videoData",newsList.get(position));
                            startActivity(intent);
                        }


                    }
                });

            }
        });


    }
}
