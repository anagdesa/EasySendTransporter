package com.example.easysendtrans.Login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.easysendtrans.Main.MainActivity;
import com.example.easysendtrans.OrderActivity;
import com.example.easysendtrans.Pendaftaran.RegistrasiActivity;
import com.example.easysendtrans.R;

public class LoginActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;

    private Button tombole;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //aktivasi tombol daftar ke form pendaftaran

        tombole = (Button)findViewById(R.id.daftar);
    tombole.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
            startActivity(i); }
            });

        //aktivasi tombol daftar ke home
        tombole = (Button) findViewById(R.id.masuk);
    tombole.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i); }
                         });


    }
}
