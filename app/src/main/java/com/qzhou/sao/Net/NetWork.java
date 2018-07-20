package com.qzhou.sao.Net;


import com.qzhou.sao.Base.MyApp;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Bean.Tou.NewsDetail;
import com.qzhou.sao.Bean.Tou.ResultResponse;
import com.qzhou.sao.Bean.Tou.TouResponseBean;
import com.qzhou.sao.Bean.TouBean;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NetWork  extends RetifitUtils{




    protected static final Request_Interface service = getRetrofit().create(Request_Interface.class);
    protected static final Request_Interface touVideo = getRetrofitTou(MyApp.getContext()).create(Request_Interface.class);
    protected static final Request_Interface touResponse = getRetrofitTouData(MyApp.getContext()).create(Request_Interface.class);

    protected static final Request_Interface touNewsDetatil =getRetrofitTouNewsDetatil(MyApp.getContext()).create(Request_Interface.class);

    public static void getBanner(Observer<HomeData> observer) {
        setSubscribe(service.getVerfcationGet(),observer);
    }


    public static void getVideo(Observer<TouBean> observer){
        setSubscribe(touVideo.getTouVideo(),observer);
    }

    public static void getVideoLoadMore(Observer<TouBean> observer){
        setSubscribe(touVideo.getTouVideoLordMore(),observer);
    }


    public static void getTouResponse(String category,long lasttime, long currenttime,Observer<TouResponseBean> observer){
        setSubscribe(touResponse.getTouData(category,lasttime,currenttime),observer);
    }

    public static void getTouNewsDetatil(String url, Observer<ResultResponse<NewsDetail>> observer){
        setSubscribe(touNewsDetatil.getTouNewsDetatil(url),observer);
    }






    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }

}
