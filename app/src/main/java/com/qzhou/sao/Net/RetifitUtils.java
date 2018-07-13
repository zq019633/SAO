package com.qzhou.sao.Net;

import android.content.Context;

import com.qzhou.sao.Base.MyApp;

import javax.net.ssl.SSLSocketFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public  class RetifitUtils  {

    private static String SERVER_BASE_URL="http://140.143.196.244:88/";
    private static String TOU_BASE_URL="https://www.toutiao.com/";





    private static Retrofit retrofit;
    private static Retrofit retrofitTou;

    protected static Retrofit getRetrofit(){
        if(retrofit==null){
            OkHttpClient client = Okhttp3Utils.getOkHttpClient();
            retrofit=new Retrofit.Builder()
                    .baseUrl(SERVER_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }




//    protected static Retrofit getRetrofitTou(Context context){
//        if(retrofitTou==null){
//            SSLSocketFactory sslSocketFactory = new SslContextFactory().getSslSocket(context).getSocketFactory();
//            OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder().sslSocketFactory(sslSocketFactory);
//
//            retrofitTou=new Retrofit.Builder()
//                    .baseUrl(TOU_BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                    .client(okHttpClient.build())
//                    .build();
//        }
//        return retrofitTou;
//    }








}
