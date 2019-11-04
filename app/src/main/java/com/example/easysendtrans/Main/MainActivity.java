package com.example.easysendtrans.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.easysendtrans.Login.LoginActivity;
import com.example.easysendtrans.OrderActivity;
import com.example.easysendtrans.R;
import com.example.easysendtrans.ScreenHome.IntroViewPagerAdapter;
import com.example.easysendtrans.ScreenHome.IntroViewPagerIklan;
import com.example.easysendtrans.ScreenHome.ScreenIklan;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager screenIklan;
    IntroViewPagerIklan introViewPagerIklan;
    TabLayout tabIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
