package com.qzhou.sao.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.qzhou.sao.UI.Activity.MainActivity;

import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments;
    private final MainActivity context;

    public MainAdapter(FragmentManager supportFragmentManager, MainActivity mainActivity, List<Fragment> fragments) {
        super(supportFragmentManager);
        this.context=mainActivity;
        this.fragments=fragments;
        Log.e("sd","sd");
        Log.e("sd","sd");
        Log.e("sd","sd");
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);


    }

    @Override
    public int getCount() {
        return fragments.size()==0?0:fragments.size();
    }
}
