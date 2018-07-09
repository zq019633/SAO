package com.qzhou.sao.Net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetifitUtils  {

    private static String SERVER_BASE_URL="http://140.143.196.244:88/";
    private static Retrofit retrofit;

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




}
