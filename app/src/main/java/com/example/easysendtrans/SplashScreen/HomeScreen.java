package com.example.easysendtrans.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.easysendtrans.R;
import com.example.easysendtrans.ScreenHome.IntroActivity;

public class HomeScreen extends AppCompatActivity {

private ImageView splashscreen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); */

        setContentView(R.layout.activity_home_screen);
        splashscreen = (ImageView) findViewById(R.id.splashscreen);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        splashscreen.startAnimation(myanim);



        //menghilangkan action bar
        //getSupportActionBar().hide();

        //menampilkan homescreen


        //terbuka dan pindah 5 detik
             Thread thread = new Thread(){
        public void run(){
            try {
                sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                startActivity(new Intent(HomeScreen.this, IntroActivity.class));
                finish();
            }
        }
        };
        thread.start();

        }

}
