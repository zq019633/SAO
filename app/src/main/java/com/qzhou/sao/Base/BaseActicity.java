package com.qzhou.sao.Base;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.qzhou.sao.R;
import com.qzhou.sao.UI.Activity.MainActivity;

public abstract class BaseActicity extends AppCompatActivity {
   //app 的name
    private String APP_NAME;
    //调试模式
    private boolean isDebug;

    protected final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Window window = BaseActicity.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);


        //设置顶部状态栏颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //window.setStatusBarColor(BaseActicity.this.getResources().getColor(R.color.accent_color));
        }


        setContentView(intiLayout());
        isDebug = MyApp.isDebug;
        APP_NAME = MyApp.APP_NAME;
        //修改
        
        initView();
        initData();
    }

    //初始化数据
    protected abstract void initData();

    //初始化视图
    protected abstract void initView();

    //初始化布局
    protected abstract int intiLayout();

    //找控件
    protected <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }

    //log 开关
    public void TLog(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
