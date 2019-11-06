package com.example.easysendtrans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.easysendtrans.ScreenHome.IntroViewPagerIklan;
import com.example.easysendtrans.ScreenHome.ScreenIklan;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    private ViewPager screenIklan;
    IntroViewPagerIklan introViewPagerIklan;
    TabLayout tabIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        //untuk view tab
        tabIndicator = findViewById(R.id.tab_indicator);

        //untuk list iklan
        List<ScreenIklan> mLis = new ArrayList<>();
        mLis.add(new ScreenIklan(R.drawable.x2ft));
        mLis.add(new ScreenIklan(R.drawable.x2ftc));
        mLis.add(new ScreenIklan(R.drawable.x4ft));
        mLis.add(new ScreenIklan(R.drawable.x4ftc));
        mLis.add(new ScreenIklan(R.drawable.lain));

        //untuk menmapilkan iklan
        screenIklan = findViewById(R.id.screen_viewpageriklan);
        introViewPagerIklan = new IntroViewPagerIklan(this, mLis);
        screenIklan.setAdapter(introViewPagerIklan);

        //untuk menampilkan layout pada tab
        tabIndicator.setupWithViewPager(screenIklan);
    }
}
