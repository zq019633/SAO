package com.qzhou.sao.UI.Activity;



import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.ToastUtil;

import okhttp3.OkHttpClient;;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;


public class MainActivity extends BaseActicity {

    @Override
    protected void initData() {
        ToastUtil.showShort(getApplicationContext(),"nihao ");
//        OkHttpClient okClient = new OkHttpClient.Builder().build();
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://localhost:4567/")
//
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//
//                .build();



    }

    @Override
    protected void initView() {

        TLog("你好");
    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_main;
    }



}
