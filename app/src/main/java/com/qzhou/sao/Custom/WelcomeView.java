package com.qzhou.sao.Custom;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.VideoView;

public class WelcomeView extends VideoView {
    public WelcomeView(Context context) {
        super(context);
    }

    public WelcomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WelcomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //因为 出现不同的手机屏幕 可能导致 视频不能适配  需要 重新测量宽高度

        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
//        Log.e("我执行了","=");
//        Log.e("高度","="+height);
//        Log.e("宽度","="+width);
        setMeasuredDimension(width,height);



    }
}
