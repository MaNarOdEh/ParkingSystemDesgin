package com.example.pccorner.parkingsystemdesgin;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter_Search extends FragmentPagerAdapter {
    int count;
    FragmentManager fm;
    public MyPagerAdapter_Search(FragmentManager fm,int count) {
        super(fm);
        this.count=count;
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new search_by_car_number();
            case 1:
                return new search_by_capture_image();
            case 2:
                return new search_by_video();

        }
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }
}
