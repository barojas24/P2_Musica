package com.example.p2_musica;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SubMenuAdapter extends FragmentStatePagerAdapter {
    private  int numOfTabs;
    public SubMenuAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ItemFragment();
            case 1:
                return new FragmentListasRepro();
            case 2:
                return new FragmentArtistas();
            default:
                return new FragmentAlbumes();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
