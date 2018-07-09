package com.qzhou.sao.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;

public class WtAdapter  extends FragmentPagerAdapter {
    private final ArrayList<Fragment> mFragments;
    private final ArrayList<String> mTitles;


    public WtAdapter(FragmentManager fm, ArrayList<Fragment> mFragments, ArrayList<String> mTitles) {
        super(fm);
        this.mFragments=mFragments;
        this.mTitles=mTitles;


        this.mTitles.add("推荐");
        this.mTitles.add("新闻");
        this.mTitles.add("热点");
        this.mTitles.add("美食");
        this.mTitles.add("短视频");
        this.mTitles.add("图片");
        this.mTitles.add("故事");

    }

    @Override
    public Fragment getItem(int position)
    {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        Log.e("位置","position"+position);

            return  mTitles.get(position);



    }


}
