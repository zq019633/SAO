package com.qzhou.sao.Custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;

import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.qzhou.sao.R;
import com.shuyu.gsyvideoplayer.utils.CommonUtil;
import com.shuyu.gsyvideoplayer.utils.Debuger;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer;


import java.util.Timer;


public class SampleCoverVideo extends StandardGSYVideoPlayer {
    ImageView mCoverImage;
    String mCoverOriginUrl;
    int mDefaultRes;
    private ImageView scv_mStartButton;
    private ProgressBar scv_mLoadingProgressBar;


    public SampleCoverVideo(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public SampleCoverVideo(Context context) {
        super(context);
    }

    public SampleCoverVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


//    @Override
//    protected void init(Context context) {
//        super.init(context);
//        mCoverImage = (ImageView) findViewById(R.id.thumbImage);
////        scv_start = (ImageView) findViewById(R.id.scv_start);
////        scv_loading = (ProgressBar) findViewById(R.id.scv_loading);
//        if (mThumbImageViewLayout != null &&
//                (mCurrentState == -1 || mCurrentState == CURRENT_STATE_NORMAL || mCurrentState == CURRENT_STATE_ERROR)) {
//            mThumbImageViewLayout.setVisibility(VISIBLE);
//        }
//    }




    protected void init(Context context) {
        super.init(context);
        mCoverImage = (ImageView) findViewById(R.id.thumbImage);
//        scv_mStartButton = findViewById(R.id.scv_start);
        scv_mLoadingProgressBar = findViewById(R.id.scv_loading);



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
    }

//    protected void clickStartIcon() {
//        if (TextUtils.isEmpty(this.mUrl)) {
//            Debuger.printfError("********" + this.getResources().getString(com.shuyu.gsyvideoplayer.R.string.no_url));
//        } else {
//            if (this.mCurrentState != 0 && this.mCurrentState != 7) {
//                if (this.mCurrentState == 2) {
//                    try {
//                        this.onVideoPause();
//                    } catch (Exception var3) {
//                        var3.printStackTrace();
//                    }
//                    this.setStateAndUi(5);
//
//                    if (this.mVideoAllCallBack != null && this.isCurrentMediaListener()) {
//                        if (this.mIfCurrentIsFullscreen) {
//                            Debuger.printfLog("onClickStopFullscreen");
//                            this.mVideoAllCallBack.onClickStopFullscreen(this.mOriginUrl, new Object[]{this.mTitle, this});
//                        } else {
//                            Debuger.printfLog("onClickStop");
//                            this.mVideoAllCallBack.onClickStop(this.mOriginUrl, new Object[]{this.mTitle, this});
//                        }
//                    }
//                } else if (this.mCurrentState == 5) {
//                    if (this.mVideoAllCallBack != null && this.isCurrentMediaListener()) {
//                        if (this.mIfCurrentIsFullscreen) {
//                            Debuger.printfLog("onClickResumeFullscreen");
//                            this.mVideoAllCallBack.onClickResumeFullscreen(this.mOriginUrl, new Object[]{this.mTitle, this});
//                        } else {
//                            Debuger.printfLog("onClickResume");
//                            this.mVideoAllCallBack.onClickResume(this.mOriginUrl, new Object[]{this.mTitle, this});
//                        }
//                    }
//
//                    try {
//                        this.getGSYVideoManager().start();
//                    } catch (Exception var2) {
//                        var2.printStackTrace();
//                    }
//
//                    this.setStateAndUi(2);
//                } else if (this.mCurrentState == 6) {
//                    this.startButtonLogic();
//                }
//            } else {
//                if (this.isShowNetConfirm()) {
//                    this.showWifiDialog();
//                    return;
//                }
//
//                this.startButtonLogic();
//            }
//
//        }
   // }

//    public void onClick(View v) {
//        int i = v.getId();
//        if (this.mHideKey && this.mIfCurrentIsFullscreen) {
//            CommonUtil.hideNavKey(this.mContext);
//        }
//
//        if (i == R.id.scv_start) {
//            this.clickStartIcon();
//        } else if (i == R.id.surface_container && this.mCurrentState == 7) {
//            if (this.mVideoAllCallBack != null) {
//                Debuger.printfLog("onClickStartError");
//                this.mVideoAllCallBack.onClickStartError(this.mOriginUrl, new Object[]{this.mTitle, this});
//            }
//
//            this.prepareVideo();
//        } else if (i == R.id.thumb) {
//            if (!this.mThumbPlay) {
//                return;
//            }
//
//            if (TextUtils.isEmpty(this.mUrl)) {
//                Debuger.printfError("********" + this.getResources().getString(com.shuyu.gsyvideoplayer.R.string.no_url));
//                return;
//            }
//
//            if (this.mCurrentState == 0) {
//                if (this.isShowNetConfirm()) {
//                    this.showWifiDialog();
//                    return;
//                }
//
//                scv_mStartButton.setImageResource(R.drawable.jc_click_pause_selector);
//                this.startPlayLogic();
//
//
//            } else if (this.mCurrentState == 6) {
//                this.onClickUiToggle();
//            }
//        } else if (i == R.id.surface_container) {
//            if (this.mVideoAllCallBack != null && this.isCurrentMediaListener()) {
//                if (this.mIfCurrentIsFullscreen) {
//                    Debuger.printfLog("onClickBlankFullscreen");
//                    this.mVideoAllCallBack.onClickBlankFullscreen(this.mOriginUrl, new Object[]{this.mTitle, this});
//                } else {
//                    Debuger.printfLog("onClickBlank");
//                    this.mVideoAllCallBack.onClickBlank(this.mOriginUrl, new Object[]{this.mTitle, this});
//                }
//            }
//
//            this.startDismissControlViewTimer();
//
//
//        }
//
//    }

    @Override
    public void onInfo(int what, int extra) {
        if (what == MediaPlayer.MEDIA_INFO_BUFFERING_START) {
            mBackUpPlayingBufferState = mCurrentState;
            //避免在onPrepared之前就进入了buffering，导致一只loading
            if (mHadPlay && mCurrentState != CURRENT_STATE_PREPAREING && mCurrentState > 0)
                setStateAndUi(CURRENT_STATE_PLAYING_BUFFERING_START);

        } else if (what == MediaPlayer.MEDIA_INFO_BUFFERING_END) {
            if (mBackUpPlayingBufferState != -1) {
                if (mBackUpPlayingBufferState == CURRENT_STATE_PLAYING_BUFFERING_START) {
                    mBackUpPlayingBufferState = CURRENT_STATE_PLAYING;
                }
                if (mHadPlay && mCurrentState != CURRENT_STATE_PREPAREING && mCurrentState > 0)
                    setStateAndUi(mBackUpPlayingBufferState);

                mBackUpPlayingBufferState = -1;
            }
        } else if (what == getGSYVideoManager().getRotateInfoFlag()) {
            mRotate = 0;//<---------------------这里
            Debuger.printfLog("Video Rotate Info " + extra);
            if (mTextureView != null)
                mTextureView.setRotation(mRotate);
        }
    }


    @Override
    public int getLayoutId() {
        return R.layout.video_layout_cover;
    }

    public void loadCoverImage(String url, int res) {
        mCoverOriginUrl = url;
        mDefaultRes = res;
        Glide.with(getContext().getApplicationContext())
                .setDefaultRequestOptions(
                        new RequestOptions()
                                .frame(1000000)
                                .centerCrop()
                                .error(res)
                                .placeholder(res))
                .load(url)
                .into(mCoverImage);
    }

//    @Override
//    public GSYBaseVideoPlayer startWindowFullscreen(Context context, boolean actionBar, boolean statusBar) {
//        GSYBaseVideoPlayer gsyBaseVideoPlayer = super.startWindowFullscreen(context, actionBar, statusBar);
//        SampleCoverVideo sampleCoverVideo = (SampleCoverVideo) gsyBaseVideoPlayer;
//        sampleCoverVideo.loadCoverImage(mCoverOriginUrl, mDefaultRes);
//        return gsyBaseVideoPlayer;
//    }
//
//
//    @Override
//    public GSYBaseVideoPlayer showSmallVideo(Point size, boolean actionBar, boolean statusBar) {
//        //下面这里替换成你自己的强制转化
//        SampleCoverVideo sampleCoverVideo = (SampleCoverVideo) super.showSmallVideo(size, actionBar, statusBar);
//        sampleCoverVideo.scv_mStartButton.setVisibility(GONE);
//        sampleCoverVideo.scv_mStartButton = null;
//        return sampleCoverVideo;
//    }
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
//    protected void hideAllWidget() {
//        this.setViewShowState(this.mBottomContainer, INVISIBLE);
//        this.setViewShowState(this.mTopContainer, INVISIBLE);
//        this.setViewShowState(this.mBottomProgressBar, VISIBLE);
//        this.setViewShowState(this.mStartButton, INVISIBLE);
//    }
//
//
//
    protected void changeUiToPlayingBufferingClear() {
        Debuger.printfLog("changeUiToPlayingBufferingClear");
        setViewShowState(mTopContainer, INVISIBLE);
        setViewShowState(mBottomContainer, INVISIBLE);
        setViewShowState(mStartButton, INVISIBLE);
        setViewShowState(scv_mLoadingProgressBar, VISIBLE);
        setViewShowState(mThumbImageViewLayout, INVISIBLE);
        setViewShowState(mBottomProgressBar, VISIBLE);
        setViewShowState(mLockScreen, GONE);
        updateStartImage();
    }
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
//        updateStartImage();
//
//    }
//
    protected void changeUiToPlayingShow() {
        Debuger.printfLog("changeUiToPlayingShow");
        setViewShowState(mTopContainer, VISIBLE);
        setViewShowState(mBottomContainer, VISIBLE);
        setViewShowState(mStartButton, VISIBLE);
        setViewShowState(mBottomProgressBar, VISIBLE);
        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
        setViewShowState(mThumbImageViewLayout, INVISIBLE);
        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
        updateStartImage();
    }
//
//    protected void changeUiToPauseShow() {
//        Debuger.printfLog("changeUiToPauseShow");
//        setViewShowState(mTopContainer, VISIBLE);
//
//        setViewShowState(mBottomContainer, VISIBLE);
//
//        setViewShowState(scv_mStartButton, VISIBLE);
//
//        setViewShowState(scv_mLoadingProgressBar, INVISIBLE);
//        setViewShowState(mThumbImageViewLayout, INVISIBLE);
//        setViewShowState(mBottomProgressBar, VISIBLE);
//        setViewShowState(mLockScreen, mIfCurrentIsFullscreen && mNeedLockFull ? 0 : 8);
//        updateStartImage();
//        updatePauseCover();
//    }
//
    protected void changeUiToPlayingBufferingShow() {
        Debuger.printfLog("changeUiToPlayingBufferingShow");
        setViewShowState(mTopContainer, VISIBLE);
        setViewShowState(mBottomContainer, VISIBLE);
        setViewShowState(mStartButton, INVISIBLE);
        setViewShowState(scv_mLoadingProgressBar, VISIBLE);
        setViewShowState(mThumbImageViewLayout, INVISIBLE);
        setViewShowState(mBottomProgressBar, INVISIBLE);
        setViewShowState(mLockScreen, GONE);
        updateStartImage();

    }
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


    protected void updateStartImage() {
        if (mStartButton instanceof ImageView) {
            ImageView enPlayView = (ImageView) mStartButton;
            if (mCurrentState == 2) {
                enPlayView.setImageResource(R.drawable.jc_click_pause_selector);

            } else if (mCurrentState == 7) {


            } else {

                enPlayView.setImageResource(R.drawable.jc_click_play_selector);

            }
        }
    }
}