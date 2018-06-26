package com.qzhou.sao.UI.Activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.R;

public class SplashActivity extends BaseActicity {
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        TextView tv = findView(R.id.tv);
        tv.setText("nihao ");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });
        TLog("测试");
    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_main;
    }
}
