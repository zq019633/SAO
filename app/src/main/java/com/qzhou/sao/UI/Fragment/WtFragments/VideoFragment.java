package com.qzhou.sao.UI.Fragment.WtFragments;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.github.nukc.stateview.StateView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Adapter.VideoAdapter;
import com.qzhou.sao.Base.BaseFragment;
import com.qzhou.sao.Bean.HomeData;
import com.qzhou.sao.Bean.TouBean;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;
import com.shuyu.gsyvideoplayer.GSYVideoManager;

import java.util.ArrayList;

import rx.Observer;

public class VideoFragment extends BaseFragment {

    private XRecyclerView videoRv;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void initView() {
        videoRv = findView(R.id.videoRv);
        videoRv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

    }

    @Override
    protected void initData(final StateView mStateView) {
        final ArrayList<String> videoList = new ArrayList<>();
        videoList.add("http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4");
        videoList.add("http://jzvd.nathen.cn/c494b340ff704015bb6682ffde3cd302/64929c369124497593205a4190d7d128-5287d2089db37e62345123a1be272f8b.mp4");
        videoList.add("http://jzvd.nathen.cn/63f3f73712544394be981d9e4f56b612/69c5767bb9e54156b5b60a1b6edeb3b5-5287d2089db37e62345123a1be272f8b.mp4");
        videoList.add("http://jzvd.nathen.cn/b201be3093814908bf987320361c5a73/2f6d913ea25941ffa78cc53a59025383-5287d2089db37e62345123a1be272f8b.mp4");

        videoList.add("http://jzvd.nathen.cn/25a8d119cfa94b49a7a4117257d8ebd7/f733e65a22394abeab963908f3c336db-5287d2089db37e62345123a1be272f8b.mp4");
        videoList.add("http://jzvd.nathen.cn/7512edd1ad834d40bb5b978402274b1a/9691c7f2d7b74b5e811965350a0e5772-5287d2089db37e62345123a1be272f8b.mp4");
        videoList.add("http://jzvd.nathen.cn/c6e3dc12a1154626b3476d9bf3bd7266/6b56c5f0dc31428083757a45764763b0-5287d2089db37e62345123a1be272f8b.mp4");


//        NetWork.getVideo(new Observer<TouBean>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//
//            }
//
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            @Override
//            public void onNext(TouBean touBean) {
//                Log.e("1111","111"+touBean.getAction_label());
//
//
////
////
////                final VideoAdapter adapter = new VideoAdapter(getContext(), touBean.getData().get(0).getDisplay().getHits());
////
////
////                videoRv.setAdapter(adapter);
////
////                videoRv.setOnScrollChangeListener(new View.OnScrollChangeListener() {
////                    @Override
////                    public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
////                        if (GSYVideoManager.instance().getPlayPosition() >= 0) {
////                            //当前播放的位置
////                            int position = GSYVideoManager.instance().getPlayPosition();
////
////
////                            //对应的播放列表TAG
////                            if (GSYVideoManager.instance().getPlayTag().equals(adapter.TAG)) {
////                                if (GSYVideoManager.isFullState(getActivity())) {
////                                    return;
////                                }
////                                //如果滑出去了上面和下面就是否，和今日头条一样
////                                GSYVideoManager.releaseAllVideos();
////                                adapter.notifyDataSetChanged();
////                            }
////                        }
////                    }
////                });
//            }
//        });




    }


    @Override
    public void onPause() {
        super.onPause();
        GSYVideoManager.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        GSYVideoManager.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        GSYVideoManager.releaseAllVideos();
    }



}
