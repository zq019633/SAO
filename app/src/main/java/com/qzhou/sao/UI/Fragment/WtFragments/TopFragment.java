package com.qzhou.sao.UI.Fragment.WtFragments;

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
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;

public class TopFragment extends BaseFragment {

    public XRecyclerView recommodRv;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_top;
    }

    @Override
    protected void initView() {
        recommodRv = findView(R.id.recommodRv);
        recommodRv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));


    }

    @Override
    protected void initData(StateView mStateView) {
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
                List<News> newsList = new ArrayList<>();
                for(TouResponseBean.DataBean newsData:data){
                    News news=new Gson().fromJson(newsData.getContent(),News.class);
                    newsList.add(news);
                }

                RecommodAdapter adapter=new RecommodAdapter(getContext(),newsList);
                recommodRv.setAdapter(adapter);
            }
        });



    }
}
