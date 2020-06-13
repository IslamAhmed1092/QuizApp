package com.example.quizapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Q1Fragment();
        } else if (position == 1){
            return new Q2Fragment();
        } else if (position == 2) {
            return new Q3Fragment();
        } else if (position == 3) {
            return new Q4Fragment();
        } else if (position == 4) {
            return new Q5Fragment();
        } else{
            return new SubmitFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
}
