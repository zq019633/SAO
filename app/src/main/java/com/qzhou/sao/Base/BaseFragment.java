package com.qzhou.sao.Base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.nukc.stateview.StateView;
import com.qzhou.sao.R;

public abstract class BaseFragment  extends Fragment{

    private boolean isDebug;
    protected final String TAG = this.getClass().getSimpleName();
    private View view;
    private StateView mStateView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), getLayoutId(), null);
        return view;
    }
    protected abstract int getLayoutId();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        isDebug = MyApp.isDebug;
        this.view=view;


        mStateView = StateView.inject(getActivity());
        if (mStateView != null){
            mStateView.setRetryResource(R.layout.page_net_error);
        }



        initView();
        initData(mStateView);
    }
    //log 开关
    public void TLog(String msg) {
        if (isDebug) {
            Log.e(TAG, msg);
        }
    }
    protected abstract void initView();




    protected abstract void initData(StateView mStateView);

    protected <T extends View> T findView(int id) {
        return (T) view.findViewById(id);
    }
}
