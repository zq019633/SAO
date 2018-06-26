package com.qzhou.sao.Base;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    //是否是调试模式 打印log
    public static boolean isDebug = true;
    public static String APP_NAME;
    public static MyApp app;

    //单例模式  获取全局的application
    public static MyApp getApp() {
        if (app == null) {
            synchronized (MyApp.class) {
                if (app == null) {
                    app = new MyApp();
                }
            }
        }
        return app;
    }


    //上下文
    public static Context context;

    //获取上下文
    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}

