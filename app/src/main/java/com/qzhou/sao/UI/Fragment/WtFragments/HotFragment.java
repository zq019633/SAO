package com.qzhou.sao.UI.Fragment.WtFragments;

import com.qzhou.sao.Base.BaseFragment;
import com.qzhou.sao.R;

public class HotFragment extends BaseFragment {
    private String mTitle;
    @Override
    protected int getLayoutId() {

        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {





    }

    @Override
    protected void initData() {

    }


    public static HotFragment getInstance(String title) {
        HotFragment sf = new HotFragment();
        sf.mTitle = title;
        return sf;
    }


}

