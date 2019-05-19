package com.oshimamasara.tabsample001.ui.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.oshimamasara.tabsample001.Frag01;
import com.oshimamasara.tabsample001.Frag02;
import com.oshimamasara.tabsample001.Frag03;
import com.oshimamasara.tabsample001.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3,
            R.string.tab_text_4,
            R.string.tab_text_5,
            R.string.tab_text_6,
            R.string.tab_text_7,
            R.string.tab_text_8};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        // 指定されたページのフラグメントをインスタンス化するためにgetItemが呼び出し
        //return PlaceholderFragment.newInstance(position + 1);

        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Frag01();
                break;
            case 1:
                fragment = new Frag02();
                break;
            case 2:
                fragment = new Frag03();

        }
        return fragment;

    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}