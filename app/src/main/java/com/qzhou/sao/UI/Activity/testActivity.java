package com.qzhou.sao.UI.Activity;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.qzhou.sao.Custom.SampleCoverVideo;
import com.qzhou.sao.R;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.GSYADVideoPlayer;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;

import java.util.Timer;

public class testActivity extends AppCompatActivity {
    private StandardGSYVideoPlayer videoPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
        initData();
    }

    private void initData() {

        videoPlayer =  (StandardGSYVideoPlayer)findViewById(R.id.scv_video_detatil_test);

        String source1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";
        videoPlayer.setUp(source1, true, "测试视频");

        //增加封面
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        videoPlayer.setThumbImageView(imageView);
        //增加title
        videoPlayer.getTitleTextView().setVisibility(View.VISIBLE);
        //设置返回键
        videoPlayer.getBackButton().setVisibility(View.VISIBLE);
        //设置旋转
        OrientationUtils orientationUtils = new OrientationUtils(this, videoPlayer);
        //设置全屏按键功能,这是使用的是选择屏幕，而不是全屏
        videoPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orientationUtils.resolveByClick();
            }
        });
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


    private void initView() {
        videoPlayer=  findViewById(R.id.scv_video_detatil_test);
    }
}



//package com.qzhou.sao.Custom;
//
//        import android.annotation.SuppressLint;
//        import android.content.Context;
//        import android.graphics.Point;
//        import android.media.Image;
//        import android.os.Handler;
//        import android.util.AttributeSet;
//        import android.util.Log;
//        import android.view.MotionEvent;
//        import android.view.Surface;
//        import android.view.View;
//
//        import android.view.ViewParent;
//        import android.widget.ImageView;
//        import android.widget.ProgressBar;
//
//
//        import com.bumptech.glide.Glide;
//        import com.bumptech.glide.request.RequestOptions;
//        import com.qzhou.sao.R;
//        import com.shuyu.gsyvideoplayer.utils.CommonUtil;
//        import com.shuyu.gsyvideoplayer.utils.Debuger;
//        import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
//        import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;
//
//
//        import java.util.Timer;
//
//
//public class SampleCoverVideo extends StandardGSYVideoPlayer   {
//    ImageView mCoverImage;
//    String mCoverOriginUrl;
//    int mDefaultRes;
//    private ImageView scv_mStartButton;
//    private ProgressBar scv_mLoadingProgressBar;
//    private Timer updateTime;
//
//    public SampleCoverVideo(Context context, Boolean fullFlag) {
//        super(context, fullFlag);
//    }
//
//    public SampleCoverVideo(Context context) {
//        super(context);
//    }
//
//    public SampleCoverVideo(Context context, AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//
//
//
//
//
//
////    @Override
////    protected void init(Context context) {
////        super.init(context);
////        mCoverImage = (ImageView) findViewById(R.id.thumbImage);
//////        scv_start = (ImageView) findViewById(R.id.scv_start);
//////        scv_loading = (ProgressBar) findViewById(R.id.scv_loading);
////        if (mThumbImageViewLayout != null &&
////                (mCurrentState == -1 || mCurrentState == CURRENT_STATE_NORMAL || mCurrentState == CURRENT_STATE_ERROR)) {
////            mThumbImageViewLayout.setVisibility(VISIBLE);
////        }
////    }
//
//    protected void init(Context context) {
//        super.init(context);
//
//        updateTime = new Timer();
//
//        scv_mStartButton = findViewById(R.id.scv_start);
//        scv_mLoadingProgressBar = findViewById(R.id.scv_loading);
//
//        if (!isInEditMode()) {
//            if (scv_mStartButton != null) {
//                scv_mStartButton.setOnClickListener(this);
//            }
//
//            if (mFullscreenButton != null) {
//                mFullscreenButton.setOnClickListener(this);
//                mFullscreenButton.setOnTouchListener(this);
//            }
//
//            if (mProgressBar != null) {
//                mProgressBar.setOnSeekBarChangeListener(this);
//            }
//
//            if (mBottomContainer != null) {
//                mBottomContainer.setOnClickListener(this);
//            }
//
//            if (mTextureViewContainer != null) {
//                mTextureViewContainer.setOnClickListener(this);
//                mTextureViewContainer.setOnTouchListener(this);
//            }
//
//            if (mProgressBar != null) {
//                mProgressBar.setOnTouchListener(this);
//            }
//
//            if (mThumbImageViewLayout != null) {
//                mThumbImageViewLayout.setVisibility(GONE);
//                mThumbImageViewLayout.setOnClickListener(this);
//            }
//
//            if (mThumbImageView != null && !mIfCurrentIsFullscreen && mThumbImageViewLayout != null) {
//                mThumbImageViewLayout.removeAllViews();
//                resolveThumbImage(mThumbImageView);
//            }
//
//            if (mBackButton != null) {
//                mBackButton.setOnClickListener(this);
//            }
//
//            if (mLockScreen != null) {
//                mLockScreen.setVisibility(GONE);
//                mLockScreen.setOnClickListener(new OnClickListener() {
//                    public void onClick(View v) {
//                        if (mCurrentState != 6 && mCurrentState != 7) {
//                            lockTouchLogic();
//                            if (mLockClickListener != null) {
//                                mLockClickListener.onClick(v, mLockCurScreen);
//                            }
//
//                        }
//                    }
//                });
//            }
//
//            mSeekEndOffset = CommonUtil.dip2px(getActivityContext(), 50.0F);
//        }
//
//
//        if (mThumbImageViewLayout != null &&
//                (mCurrentState == -1 || mCurrentState == CURRENT_STATE_NORMAL || mCurrentState == CURRENT_STATE_ERROR)) {
//            mThumbImageViewLayout.setVisibility(VISIBLE);
//        }
//    }
//
//
//    @Override
//    public int getLayoutId() {
//        return R.layout.video_layout_cover;
//    }
//
//    public void loadCoverImage(String url, int res) {
//        mCoverOriginUrl = url;
//        mDefaultRes = res;
//        Glide.with(getContext().getApplicationContext())
//                .setDefaultRequestOptions(
//                        new RequestOptions()
//                                .frame(1000000)
//                                .centerCrop()
//                                .error(res)
//                                .placeholder(res))
//                .load(url)
//                .into(mCoverImage);
//    }
//
//    @Override
//    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
//        GSYBaseVideoPlayer gsyBaseVideoPlayer = super.startWindowFullscreen(context, actionBar, statusBar);
//        com.qzhou.sao.Custom.SampleCoverVideo sampleCoverVideo = (com.qzhou.sao.Custom.SampleCoverVideo) gsyBaseVideoPlayer;
//        sampleCoverVideo.loadCoverImage(mCoverOriginUrl, mDefaultRes);
//        return gsyBaseVideoPlayer;
//    }
//
//
//    @Override
//    public GSYBaseVideoPlayer showSmallVideo(Point size, boolean actionBar, boolean statusBar) {
//        //下面这里替换成你自己的强制转化
//        com.qzhou.sao.Custom.SampleCoverVideo sampleCoverVideo = (com.qzhou.sao.Custom.SampleCoverVideo) super.showSmallVideo(size, actionBar, statusBar);
//        sampleCoverVideo.scv_mStartButton.setVisibility(GONE);
//        sampleCoverVideo.scv_mStartButton = null;
//        return sampleCoverVideo;
//    }
//
//
//
//
//
//
//    protected void onClickUiToggle() {
//        if (mIfCurrentIsFullscreen && mLockCurScreen && mNeedLockFull) {
//            setViewShowState(mLockScreen, VISIBLE);
//        } else {
//            if (mCurrentState == 1) {
//                if (mBottomContainer != null) {
//                    if (mBottomContainer.getVisibility() == VISIBLE) {
//                        changeUiToPrepareingClear();
//                    } else {
//                        changeUiToPreparingShow();
//                    }
//                }
//            } else if (mCurrentState == 2) {
//                if (mBottomContainer != null) {
//                    if (mBottomContainer.getVisibility() == VISIBLE) {
//                        changeUiToPlayingClear();
//                    } else {
//                        changeUiToPlayingShow();
//                    }
//                }
//            } else if (mCurrentState == 5) {
//                if (mBottomContainer != null) {
//                    if (mBottomContainer.getVisibility() == VISIBLE) {
//                        changeUiToPauseClear();
//                    } else {
//                        changeUiToPauseShow();
//                    }
//                }
//            } else if (mCurrentState == 6) {
//                if (mBottomContainer != null) {
//                    if (mBottomContainer.getVisibility() == VISIBLE) {
//                        changeUiToCompleteClear();
//                    } else {
//                        changeUiToCompleteShow();
//                    }
//                }
//            } else if (mCurrentState == 3 && mBottomContainer != null) {
//                if (mBottomContainer.getVisibility() == VISIBLE) {
//                    changeUiToPlayingBufferingClear();
//                } else {
//                    changeUiToPlayingBufferingShow();
//                }
//            }
//
//        }
//    }
//
//
//    protected void changeUiToPlayingBufferingClear() {
//        Debuger.printfLog("changeUiToPlayingBufferingClear");
//        setViewShowState(mTopContainer, INVISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, INVISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, VISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, VISIBLE);
//        setViewShowState(mLockScreen, GONE);
//        if (scv_mLoadingProgressBar instanceof ProgressBar) {
//            ProgressBar enDownloadView = (ProgressBar) scv_mLoadingProgressBar;
//            enDownloadView.setVisibility(VISIBLE);
//        }
//        if (scv_mStartButton instanceof ImageView) {
//            scv_mStartButton.setVisibility(GONE);
//        }
//
//        updateStartImage();
//    }
//
//
//    protected void changeUiToPauseClear() {
//        Debuger.printfLog("changeUiToPauseClear");
//        changeUiToClear();
//        setViewShowState(mBottomProgressBar, VISIBLE);
//        updatePauseCover();
//    }
//
//    protected void changeUiToPlayingClear() {
//        Debuger.printfLog("changeUiToPlayingClear");
//        changeUiToClear();
//        setViewShowState(mBottomProgressBar, VISIBLE);
//    }
//
//    protected void changeUiToClear() {
//        Debuger.printfLog("changeUiToClear");
//        setViewShowState(mTopContainer, INVISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, INVISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, GONE);
//
//
//    }
//
//
//    protected void changeUiToPrepareingClear() {
//        Debuger.printfLog("changeUiToPrepareingClear");
//        setViewShowState(mTopContainer, INVISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, INVISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, GONE);
//
//
//
//    }
//
//
//    protected void changeUiToCompleteClear() {
//        Debuger.printfLog("changeUiToCompleteClear");
//        setViewShowState(mTopContainer, INVISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, VISIBLE);
//        setViewShowState(mBottomProgressBar, VISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//    }
//
//
//    /**
//     * 下方两个重载方法，在播放开始前不屏蔽封面
//     */
//    @Override
//    public void onSurfaceUpdated(Surface surface) {
//        super.onSurfaceUpdated(surface);
//        if (mThumbImageViewLayout != null && mThumbImageViewLayout.getVisibility() == VISIBLE) {
//            mThumbImageViewLayout.setVisibility(INVISIBLE);
//        }
//    }
//
//    @Override
//    protected void setViewShowState(View view, int visibility) {
//        if (view == mThumbImageViewLayout && visibility != VISIBLE) {
//            return;
//        }
//        super.setViewShowState(view, visibility);
//    }
//
//    /**
//     * 下方两个重载方法，在播放开始不显示底部进度
//     */
////    @Override
////    protected void changeUiToPreparingShow() {
////        super.changeUiToPreparingShow();
////        setViewShowState(mBottomContainer, INVISIBLE);
////    }
//    @Override
//    public void startAfterPrepared() {
//        super.startAfterPrepared();
//        setViewShowState(mBottomContainer, INVISIBLE);
//    }
//
//
//    protected void changeUiToNormal() {
//        Debuger.printfLog("changeUiToNormal");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, VISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//    }
//
//    protected void changeUiToPreparingShow() {
//        Debuger.printfLog("changeUiToPreparingShow");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, VISIBLE);
//        setViewShowState(scv_mStartButton, INVISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, VISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, GONE);
//
//
//
//        updateStartImage();
//
//    }
//
//    protected void changeUiToPlayingShow() {
//        Debuger.printfLog("changeUiToPlayingShow");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, VISIBLE);
//
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//
//
//        setViewShowState(scv_mStartButton, INVISIBLE);
//
//
//
//        updateStartImage();
//    }
//
//    protected void changeUiToPauseShow() {
//        Debuger.printfLog("changeUiToPauseShow");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, VISIBLE);
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//        updatePauseCover();
//    }
//
//    protected void changeUiToPlayingBufferingShow() {
//        Debuger.printfLog("changeUiToPlayingBufferingShow");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, VISIBLE);
//        setViewShowState(scv_mStartButton, INVISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, VISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, GONE);
//        updateStartImage();
//
//    }
//
//    protected void changeUiToCompleteShow() {
//        Debuger.printfLog("changeUiToCompleteShow");
//        setViewShowState(mTopContainer, VISIBLE);
//        setViewShowState(mBottomContainer, VISIBLE);
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, VISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//    }
//
//    protected void changeUiToError() {
//        Debuger.printfLog("changeUiToError");
//        setViewShowState(mTopContainer, INVISIBLE);
//        setViewShowState(mBottomContainer, INVISIBLE);
//        setViewShowState(scv_mStartButton, VISIBLE);
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, INVISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//    }
//
//
//    protected void updateStartImage() {
//        if (scv_mStartButton instanceof ImageView) {
//            ImageView enPlayView = (ImageView) scv_mStartButton;
//            if (mCurrentState == 2) {
//                enPlayView.setImageResource(R.drawable.jc_click_pause_selector);
//
//            } else if (mCurrentState == 7) {
//
//
//            } else {
//
//                enPlayView.setImageResource(R.drawable.jc_click_play_selector);
//
//            }
//        }
//    }
//}