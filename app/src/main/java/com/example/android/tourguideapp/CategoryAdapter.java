package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    public static final int NO_OF_TABS = 4;

    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TouristFragment();
        } else if (position == 1) {
            return new WorshipFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new MallsFragment();
        }
    }

    @Override
    public int getCount() {
        return NO_OF_TABS;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.tourist);
        } else if (position == 1) {
            return context.getString(R.string.worship);
        } else if (position == 2) {
            return context.getString(R.string.shopping);
        } else {
            return context.getString(R.string.malls);
        }
    }
}
