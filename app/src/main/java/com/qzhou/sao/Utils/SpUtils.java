package com.qzhou.sao.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SpUtils {
    private static SharedPreferences sp;
    private static SharedPreferences.Editor edit;


    private SpUtils() {
    };


    //单例获取sputils 对象 ，并在初始化中创建sp对象以及 edit 对象
    private static SpUtils instance;
    public static synchronized SpUtils getInstance() {
        if (instance == null) {
            instance = new SpUtils();
            return instance;
        } else {
            return instance;
        }
    }


    //初始化操作
    public static void init(Context context, String prefsname, int mode) {

        sp = context.getSharedPreferences(prefsname, mode);
        edit = sp.edit();
    }

    public static void putString(String key, String value) {
        if (sp != null) {
            edit.putString(key, value).commit();
        }
    }

    public static String getString(String key, String defValue) {
        if (sp != null) {
            return sp.getString(key, defValue);
        }else{
            return null;
        }
    }

    public static void putBoolean(String key, boolean value) {
        if (sp != null) {
            edit.putBoolean(key, value).commit();
        }
    }

    public static boolean getBoolean(String key, boolean defValue) {
        return sp.getBoolean(key, defValue);

    }






}
