package com.qzhou.sao.Net;


import android.content.Context;

import com.qzhou.sao.Base.MyApp;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Bean.TouBean;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NetWork  extends RetifitUtils{




    protected static final Request_Interface service = getRetrofit().create(Request_Interface.class);


    //protected static final Request_Interface touVideo = getRetrofitTou(MyApp.getContext()).create(Request_Interface.class);


    public static void getBanner(Observer<HomeData> observer) {
        setSubscribe(service.getVerfcationGet(),observer);
    }


//    public static void getVideo(Observer<TouBean> observer){
//        setSubscribe(touVideo.getTouVideo(),observer);
//    }




    public static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }

}
