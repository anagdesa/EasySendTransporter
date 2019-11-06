package com.example.easysendtrans;





import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by Kamere on 5/8/2018.
 */

public class PesanViewPagerAdapter extends FragmentStatePagerAdapter {

    int countTabs;

    public PesanViewPagerAdapter(FragmentManager fm, int countTabs) {
        super(fm);
        this.countTabs = countTabs;
    }

    public PesanViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Menu_dipesan menu_dipesan = new Menu_dipesan();
                return menu_dipesan;
            case 1:
                Menu_progress menu_progress = new Menu_progress();
                return menu_progress;
            case 2:
                Menu_selesai menu_selesai = new Menu_selesai();
                return menu_selesai;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countTabs;
    }
}
