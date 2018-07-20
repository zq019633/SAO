package com.qzhou.sao.UI.Activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.github.nukc.stateview.StateView;
import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Bean.Tou.NewsDetail;

import com.qzhou.sao.Bean.Tou.ResultResponse;
import com.qzhou.sao.Custom.SampleCoverVideo;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.qzhou.sao.Utils.VideoPathDecoder;
import com.shuyu.gsyvideoplayer.GSYBaseActivityDetail;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import moe.codeest.enviews.ENDownloadView;
import rx.Observer;

public class VideoDetailActivity extends GSYBaseActivityDetail<StandardGSYVideoPlayer> {

    private SampleCoverVideo videoPlayer;
    private News videoData;
    private String newsDetatilUrl;
    private WebView webView;
    private ENDownloadView loading;
    private ProgressBar scv_loading;
    private ImageView scv_start;
    private ImageView scv_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detatil);
        initView();
        initData();

    }


    protected void initView() {
        Window window = VideoDetailActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(VideoDetailActivity.this.getResources().getColor(R.color.black));
        }
        videoPlayer = findViewById(R.id.scv_video_detatil);
        scv_loading = findViewById(R.id.scv_loading);
        scv_start = findViewById(R.id.start);
        scv_back = (ImageView) findViewById(R.id.back);



    }


    protected void initData() {

      //  GSYVideoType.setShowType(GSYVideoType.SCREEN_MATCH_FULL);

        videoData = (News) getIntent().getSerializableExtra("videoData");

        String item_id = videoData.item_id;
        StringBuffer urlSb = new StringBuffer("http://m.toutiao.com/i");
        newsDetatilUrl = urlSb.append(item_id).append("/info/").toString();
        Log.e("zq", "请求的url:" + newsDetatilUrl);


        NetWork.getTouNewsDetatil(newsDetatilUrl, new Observer<ResultResponse<NewsDetail>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ResultResponse<NewsDetail> newsDetatil) {

                String url = newsDetatil.data.url;
                VideoPathDecoder decoder = new VideoPathDecoder() {
                    @Override
                    public void success(String videourl) {
                        if (videourl == null) {
                        } else {

                            Log.e("zq", "传递过来的：" + videourl);
                            runOnUiThread(new Runnable() {
                                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                @Override
                                public void run() {

                                    scv_loading.setVisibility(View.GONE);


                                    videoPlayer.setUp(videourl, true, newsDetatil.data.title);
                                    videoPlayer.getTitleTextView().setVisibility(View.VISIBLE);
                                    //设置返回键
                                    videoPlayer.getBackButton().setVisibility(View.VISIBLE);
                                    //设置旋转
                                    videoPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            videoPlayer.startWindowFullscreen(VideoDetailActivity.this, false, true);
                                        }
                                    });


                                    videoPlayer.setAutoFullWithSize(true);


                                    //是否可以滑动调整
                                    videoPlayer.setIsTouchWiget(true);
                                    //设置返回按键功能
                                    videoPlayer.getBackButton().setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            onBackPressed();
                                        }
                                    });
                                    videoPlayer.startPlayLogic();


                                }
                            });
                        }


                    }
                };

                decoder.decodePath(VideoDetailActivity.this, url);


            }
        });
    }




    @Override
    public StandardGSYVideoPlayer getGSYVideoPlayer() {
        return videoPlayer;
    }

    @Override
    public GSYVideoOptionBuilder getGSYVideoOptionBuilder() {
        return null;
    }

    @Override
    public void clickForFullScreen() {

    }

    @Override
    public boolean getDetailOrientationRotateAuto() {
        return true;
    }
}
