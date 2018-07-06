package com.qzhou.sao.UI.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Custom.WelcomeView;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.SpUtils;
import com.qzhou.sao.Utils.ToastUtil;

public class SplashActivity extends AppCompatActivity {
    private WelcomeView welcome;
    private ImageView skip;
    private ImageView music;
    private boolean isFirst;

    //默认声音是打开的
    private boolean isVolumon = true;
    private AudioManager mAudioManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);


        boolean value = SpUtils.getInstance().getBoolean("isFirst", true);
        if(value){
            //如果是第一次
            initView();
            initData();

        }else{
            //如果不是第一次
            Intent intent = new Intent(SplashActivity.this, AdActivity.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }




    }

    @SuppressLint("WrongConstant")
    private void initData() {

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/" + R.raw.welcome);
        welcome.setVideoURI(uri);
        welcome.start();


        //视频播放完成
        welcome.setOnCompletionListener(new MediaPlayer.OnCompletionListener()

        {
            @Override
            public void onCompletion(MediaPlayer mp) {


                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
                isFirst=false;
                SpUtils.getInstance().putBoolean("isFirst",isFirst);

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                SplashActivity.this.finish();




            }
        });

        skip.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

                SpUtils.getInstance().putBoolean("isFirst",isFirst);
                isFirst=false;
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                SplashActivity.this.finish();


            }
        });

        mAudioManager = ((AudioManager)getSystemService("audio"));
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVolumon){
                    //关闭
                    music.setImageResource(R.mipmap.ic_music_off);
                    turnOff();
                }else{
                    //打开
                    music.setImageResource(R.mipmap.ic_music_on);
                    turnOn();
                }

            }
        });


    }

    /**
     * 打开音量
     */
    private void turnOn() {
        isVolumon=true;
        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,3,0);

    }

    /**
     * 关闭音量
     */
    private void turnOff() {
        isVolumon=false;
        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);

    }

    private void initView() {
        welcome = (WelcomeView) findViewById(R.id.welcome);
        skip = (ImageView) findViewById(R.id.skip);
        music=(ImageView) findViewById(R.id.music);

    }


}
