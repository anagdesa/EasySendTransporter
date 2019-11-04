package com.example.easysendtrans.ScreenHome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.easysendtrans.Login.LoginActivity;
import com.example.easysendtrans.Pendaftaran.RegistrasiActivity;
import com.example.easysendtrans.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {


    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    private ViewPager screenIklan;
    IntroViewPagerIklan introViewPagerIklan;
    TabLayout tabIndicator;
    private Button tombole;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menjadikan activity full screen
        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
*/

        setContentView(R.layout.activity_intro);



        //menghilangkan action bar
       // getSupportActionBar().hide();


        //untuk view tab
        tabIndicator = findViewById(R.id.tab_indicator);

        //untuk list screen
        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem(R.drawable.x2ft, R.drawable.x4ft));
        mList.add(new ScreenItem(R.drawable.x2ftc, R.drawable.x4ftc));
        mList.add(new ScreenItem(R.drawable.lain, R.drawable.lain));

        //untuk list iklan
        List<ScreenIklan> mLis = new ArrayList<>();
        mLis.add(new ScreenIklan(R.drawable.iklan1));
        mLis.add(new ScreenIklan(R.drawable.iklan2));

        //untuk menmapilkan iklan
        screenIklan = findViewById(R.id.screen_viewpageriklan);
        introViewPagerIklan = new IntroViewPagerIklan(this, mLis);
        screenIklan.setAdapter(introViewPagerIklan);

        //untuk setup viewpage
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //untuk menampilkan layout pada tab
        tabIndicator.setupWithViewPager(screenPager);

        //mengaktifkan tombol masuk
        //activasi tombol daftar ke form pendaftaran

        tombole = (Button)findViewById(R.id.intro_masuk);
        tombole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(i); }
        });



    }

}


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        List<ScreenIklan> mList = new ArrayList<>();
        mList.add(new ScreenIklan(R.drawable.iklan1));
        mList.add(new ScreenIklan(R.drawable.iklan2));

        screenIklan = findViewById(R.id.screen_viewpageriklan);
        introViewPagerIklan = new IntroViewPagerIklan(this, mList);
        screenIklan.setAdapter(introViewPagerIklan);


    }*/
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bottom_nav,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if (id == R.id.Beranda){


            Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;

        }else
        if (id == R.id.Pesanan) {
            Intent Pesanan = new Intent(IntroActivity.this, RegistrasiActivity.class);
            startActivity(Pesanan);
            return true;

        }else
        if (id == R.id.Pesan) {
            Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;


        }else
        if (id == R.id.Surat) {
            Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;


        }else
        if (id == R.id.Tagihan){
            Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;

            }
        return super.onOptionsItemSelected(item);


    }*/

