package com.qzhou.sao.UI.Fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.flyco.tablayout.SlidingTabLayout;
import com.qzhou.sao.Adapter.WtAdapter;
import com.qzhou.sao.Base.BaseFragment;
import com.qzhou.sao.R;
import com.qzhou.sao.UI.Fragment.WtFragments.FoodFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.HotFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.NewsFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.PicFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.StoryFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.TopFragment;
import com.qzhou.sao.UI.Fragment.WtFragments.VideoFragment;

import java.util.ArrayList;

public class WtFragment extends BaseFragment{

    private SlidingTabLayout stl;
    private ArrayList<Fragment> mFragments;
    private ViewPager viewPager;
    private ArrayList<String> mTitles;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wt;
    }

    @Override
    protected void initView() {
        stl = findView(R.id.stl);
        viewPager = findView(R.id.wtViewPager);



    }

    @Override
    protected void initData() {
        mFragments= new ArrayList<>();
        mFragments.add(new TopFragment());
        mFragments.add(new NewsFragment());
        mFragments.add(new HotFragment());
        mFragments.add(new FoodFragment());
        mFragments.add(new VideoFragment());
        mFragments.add(new PicFragment());
        mFragments.add(new StoryFragment());

        mTitles = new ArrayList<>();



        WtAdapter wtAdapter=new WtAdapter(getChildFragmentManager(),mFragments, mTitles);



        viewPager.setAdapter(wtAdapter);

       viewPager.setOffscreenPageLimit(2);

        int count = viewPager.getAdapter().getCount();
        Log.e("我是数量","count"+count);


        stl.setViewPager(viewPager);
    }
}
