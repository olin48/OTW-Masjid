package com.panelic.otwmasjid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.panelic.otwmasjid.tabsfragment.FragmentDua;
import com.panelic.otwmasjid.tabsfragment.FragmentSatu;

/**
 * Created by Sholihin on 22/11/2016.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FragmentSatu tab1 = new FragmentSatu();
                return tab1;
            case 1:
                FragmentDua tab2 = new FragmentDua();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
