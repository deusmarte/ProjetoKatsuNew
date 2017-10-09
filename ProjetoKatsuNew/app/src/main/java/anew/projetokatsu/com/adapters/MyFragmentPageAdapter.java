package anew.projetokatsu.com.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import anew.projetokatsu.com.fragments.Anime_Lista;
import anew.projetokatsu.com.fragments.Anime_Lista2;

/**
 * Created by joaop on 22/09/2017.
 */

public class MyFragmentPageAdapter extends FragmentStatePagerAdapter {
    private String[]mTabTitles;

    public MyFragmentPageAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles=mTabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Anime_Lista();
            case 1:
                return new Anime_Lista2();


            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}

