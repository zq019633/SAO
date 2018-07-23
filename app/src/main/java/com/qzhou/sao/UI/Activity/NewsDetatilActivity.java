package com.qzhou.sao.UI.Activity;

import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.github.nukc.stateview.StateView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.qzhou.sao.Adapter.CommentAdapter;
import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Bean.Tou.Comment;
import com.qzhou.sao.Bean.Tou.CommentData;
import com.qzhou.sao.Bean.Tou.CommentResponse;
import com.qzhou.sao.Bean.Tou.News;
import com.qzhou.sao.Net.NetWork;
import com.qzhou.sao.R;

import java.io.Serializable;
import java.util.List;

import rx.Observer;

public class NewsDetatilActivity  extends BaseActicity{

    private XRecyclerView pinglunRv;
    private News detatil;
    private int pageNow=1;
    private TextView emptyView;
    private List<CommentData> commentData;
    private CommentAdapter adapter;

    @Override
    protected void initData(StateView mStateView) {

        int offset = (pageNow - 1) * 20;
        NetWork.getComment(detatil.group_id, detatil.item_id,offset,20, new Observer<CommentResponse>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(CommentResponse commentResponse) {
                Log.e("评论","="+commentResponse.data.size());
                commentData = commentResponse.data;
                adapter = new CommentAdapter(NewsDetatilActivity.this,commentResponse.data);

                pinglunRv.setAdapter(adapter);

                if(commentResponse.data.size()==0){
                    emptyView.setVisibility(View.VISIBLE);
                    pinglunRv.setEmptyView(emptyView);
                }

            }
        });


        pinglunRv.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {

            }

            @Override
            public void onLoadMore() {
                NetWork.getComment(detatil.group_id, detatil.item_id, commentData.size() / 20 + 1,20, new Observer<CommentResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(CommentResponse commentResponse) {

                        commentData.addAll(commentResponse.data);
                        adapter.notifyDataSetChanged();

                        pinglunRv.refreshComplete();
                    }
                });
            }
        });


    }

    @Override
    protected void initView() {
        detatil = (News) getIntent().getSerializableExtra("detatil");
        pinglunRv = findView(R.id.pinglunRv);
        pinglunRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        emptyView = findView(R.id.empty_tv);

    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_newsdata;
    }
}
