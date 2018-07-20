package com.qzhou.sao.Net;

import android.content.Context;

import com.qzhou.sao.Base.MyApp;

import javax.net.ssl.SSLSocketFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetifitUtils {

    private static String SERVER_BASE_URL = "http://140.143.196.244:88/";
    private static String TOU_BASE_URL = "https://www.toutiao.com/";


    //实时数据
    private static String TOU_BASEURL = "http://is.snssdk.com/";
    private static String TOU_DETATIL_URL = "http://m.toutiao.com/";


    private static Retrofit retrofit;
    private static Retrofit retrofitTou;
    private static Retrofit retrofitTouData;
    private static Retrofit retrofitTouNewsDetatil;

    //
    protected static Retrofit getRetrofit() {
        if (retrofit == null) {
            OkHttpClient client = Okhttp3Utils.getOkHttpClient();
            retrofit = new Retrofit.Builder()
                    .baseUrl(SERVER_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }


    protected static Retrofit getRetrofitTou(Context context) {
        if (retrofitTou == null) {

            OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder().sslSocketFactory(SSLSocketClient.getSSLSocketFactory());

            retrofitTou = new Retrofit.Builder()
                    .baseUrl(TOU_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient.build())

                    .build();
        }
        return retrofitTou;
    }


    protected static Retrofit getRetrofitTouData(Context context) {
        if (retrofitTouData == null) {

            OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder().sslSocketFactory(SSLSocketClient.getSSLSocketFactory());

            retrofitTouData = new Retrofit.Builder()
                    .baseUrl(TOU_BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient.build())
                    .build();
        }
        return retrofitTouData;
    }


    protected static Retrofit getRetrofitTouNewsDetatil(Context context) {
        if (retrofitTouNewsDetatil == null) {
            OkHttpClient client = Okhttp3Utils.getOkHttpClient();
            retrofitTouNewsDetatil = new Retrofit.Builder()
                    .baseUrl(TOU_DETATIL_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofitTouNewsDetatil;
    }


}
