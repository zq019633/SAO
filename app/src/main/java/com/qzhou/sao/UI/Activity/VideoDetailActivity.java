package com.qzhou.sao.UI.Activity;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.nukc.stateview.StateView;
import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.NewsDetatil;
import com.qzhou.sao.Custom.SampleCoverVideo;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;

import java.io.Serializable;
import java.util.List;

import rx.Observer;

public class VideoDetailActivity extends BaseActicity {

    private SampleCoverVideo videoPlayer;
    private News videoData;
    private String newsDetatilUrl;


    @Override
    protected void initView() {
        Window window = VideoDetailActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(VideoDetailActivity.this.getResources().getColor(R.color.black));
        }
        videoPlayer=findView(R.id.scv_video_detatil);


    }

    @Override
    protected void initData(StateView mStateView) {
        videoData = (News) getIntent().getSerializableExtra("videoData");

        String item_id = videoData.item_id;
        StringBuffer urlSb = new StringBuffer("http://m.toutiao.com/i");
        newsDetatilUrl = urlSb.append(item_id).append("/info/").toString();


        NetWork.getTouNewsDetatil(newsDetatilUrl, new Observer<NewsDetatil>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(NewsDetatil newsDetatil) {
                String url = newsDetatil.getData().getUrl();
                Log.e("zq","="+url);
                //String source1 = "http://v1-tt.ixigua.com/ca9fe65fe58c46980ead8cd935c7ef99/5b4dc598/video/m/2205099242b271049c480ba45338823fff31159612e00000b47c0e11dd5/";

                videoPlayer.setUp(url, true, "测试视频");

                videoPlayer.startPlayLogic();
            }
        });


    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_video_detatil;
    }
}
