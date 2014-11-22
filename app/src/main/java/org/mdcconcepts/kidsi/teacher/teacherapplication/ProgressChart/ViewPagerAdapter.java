package org.mdcconcepts.kidsi.teacher.teacherapplication.ProgressChart;


import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.mdcconcepts.kidsi.teacher.teacherapplication.HealthChart.Health_Chart_Fragment;
import org.mdcconcepts.kidsi.teacher.teacherapplication.R;
import org.mdcconcepts.kidsi.teacher.teacherapplication.StickerMarket.StickerMarketFragment;
import org.mdcconcepts.kidsi.teacher.teacherapplication.Util.Util;

/**
 * Created by Admin on 11/13/2014.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    /**
     * NUM_ITEMS represents number of pages in viewPager
     */
    private static int NUM_ITEMS = 3;

    public ViewPagerAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment i.e Personal
                // Information Fragment
                return Progress_Chart_Fragment.newInstance(0,
                        "Progress Chart");
            case 1: // Fragment # 1 - This will show SecondFragment i.e
                return Health_Chart_Fragment
                        .newInstance(1, "Health Chart");
            case 2: // Fragment # 2 - This will show ThirdFragment i.e Business Information
                return StickerMarketFragment.newInstance(2,
                        "Sticker Market");
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Progress Chart";
            case 1:
                return "Health Chart";
            case 2:
                return "Sticker Market";
            default:
                return "Page " + position;
        }

    }

}


