package com.qzhou.sao.Net;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class Okhttp3Utils {
    private static OkHttpClient mOkHttpClient;


//    设置缓存目录
//    private static File cacheDirectory = new File(MyApplication.getInstance().getApplicationContext().getCacheDir().getAbsolutePath(), "MyCache");
//    private static Cache cache = new Cache(cacheDirectory, 10 * 1024 * 1024);

    /**
     * 获取OkHttpClient对象
     *
     * @return
     */
    public static OkHttpClient getOkHttpClient() {


        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e("OkHttpClient", "OkHttpMessage:" + message);
            }
        });
        loggingInterceptor.setLevel(level);


        OkHttpClient.Builder httpClientBuilder = new OkHttpClient
                .Builder();
        //OkHttp进行添加拦截器loggingInterceptor
        httpClientBuilder.addInterceptor(loggingInterceptor);


        if (null == mOkHttpClient) {
            mOkHttpClient = new OkHttpClient.Builder()
                    // .cookieJar(new CookiesManager())
                    .addInterceptor(getmHeaderInterceptor())
                    .addInterceptor(loggingInterceptor)//添加log拦截器
                    //.addNetworkInterceptor(new CookiesInterceptor(MyApplication.getInstance().getApplicationContext()))
                    //设置请求读写的超时时间
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    //.cache(cache)
                    .build();
        }
        return mOkHttpClient;
    }

    //添加请求头
    public static Interceptor getmHeaderInterceptor() {
        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request()
                        .newBuilder()

                        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2526.108 Safari/537.36 2345Explorer/8.0.0.13547")
//                        .addHeader("Cache-Control", "max-age=0")
//                        <meta http-equiv="X-UA-Compatible" content="IE=8">


                        .addHeader("Cache-Control","no-cache")
                        .addHeader("Upgrade-Insecure-Requests", "1")
                        .addHeader("X-Requested-With", "XMLHttpRequest")
                        .addHeader("Cookie", "uuid=\"w:f2e0e469165542f8a3960f67cb354026\"; __tasessionId=4p6q77g6q1479458262778; csrftoken=7de2dd812d513441f85cf8272f015ce5; tt_webid=36385357187")
                        .build();
                return chain.proceed(request);
            }
        };
        return interceptor;

    }


}
