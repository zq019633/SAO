package com.qzhou.sao.Net;


import com.qzhou.sao.Bean.HomeData;

import retrofit2.http.GET;
import rx.Observable;

public interface Request_Interface {

    //请求 轮播图
    @GET("index.php/Home/Api/getData")
    Observable<HomeData> getVerfcationGet();







}
