package com.qzhou.sao.UI.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.qzhou.sao.Custom.WelcomeView;
import com.qzhou.sao.R;

public class AdActivity extends AppCompatActivity {
    private ImageView ad;
    private ImageView skip;
    private WelcomeView logo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);// 设置全屏



        setContentView(R.layout.activity_ad);
        initView();
        initData();
    }

    private void initData() {

        Glide.with(AdActivity.this).load("http://file32.mafengwo.net/M00/4F/21/wKgBs1cN_3qAOKQpAAhByaOonCY71.jpg").into(ad);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/" + R.raw.splash_animation);
        logo.setVideoURI(uri);
        logo.start();

        //视频播放完成
        logo.setOnCompletionListener(new MediaPlayer.OnCompletionListener()

        {
            @Override
            public void onCompletion(MediaPlayer mp) {


                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                Intent intent = new Intent(AdActivity.this, MainActivity.class);

                try {
                    Thread.sleep(2000);
                    startActivity(intent);
                    AdActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




            }
        });

        skip.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                Intent intent = new Intent(AdActivity.this, MainActivity.class);
                startActivity(intent);
                AdActivity.this.finish();


            }
        });



    }

    private void initView() {
        ad=(ImageView) findViewById(R.id.im_ad);
        skip=(ImageView) findViewById(R.id.skip);
        logo=(WelcomeView) findViewById(R.id.logo);

    }
}
