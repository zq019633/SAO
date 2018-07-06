package com.qzhou.sao.UI.Activity;



import android.support.v4.app.Fragment;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.github.nukc.stateview.StateView;
import com.qzhou.sao.Adapter.MainAdapter;
import com.qzhou.sao.Base.BaseActicity;
import com.qzhou.sao.Entity.TabEntity;
import com.qzhou.sao.R;
import com.qzhou.sao.UI.Fragment.HomeFragment;
import com.qzhou.sao.UI.Fragment.MeFragment;
import com.qzhou.sao.UI.Fragment.MsgFragment;
import com.qzhou.sao.UI.Fragment.ShoppingCarFragment;
import com.qzhou.sao.UI.Fragment.WtFragment;
import com.qzhou.sao.Utils.ToastUtil;
import com.qzhou.sao.View.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

;

public class MainActivity extends BaseActicity {
    private NoScrollViewPager vp;
    private CommonTabLayout ctl;
    private String[] mTitles = {"首页", "微淘", "消息", "购物车","我的"};
    /*未选择时的icon*/
    private int[] mIconUnselectIds = {
            R.mipmap.unselecthome, R.mipmap.unselectwt,
            R.mipmap.unselectmsg, R.mipmap.unselectcar,R.mipmap.unselectme};
    /*选择时的icon*/
    private int[] mIconSelectIds = {
            R.mipmap.home, R.mipmap.wt,
            R.mipmap.message, R.mipmap.shopcar,R.mipmap.me};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();


    @Override
    protected void initData(StateView mStateView) {

        mStateView.showRetry();

        ToastUtil.showShort(getApplicationContext(),"nihao ");

        List<Fragment> fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new WtFragment());
        fragments.add(new MsgFragment());
        fragments.add(new ShoppingCarFragment());
        fragments.add(new MeFragment());


        vp.setAdapter(new MainAdapter(getSupportFragmentManager(),this,fragments));



        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        ctl.setTabData(mTabEntities);





        ctl.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                vp.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });





    }

    @Override
    protected void initView() {
        vp = findView(R.id.vp);
        ctl = findView(R.id.tb);

    }

    @Override
    protected int intiLayout() {
        return R.layout.activity_main;
    }



}
