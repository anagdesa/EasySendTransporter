package com.example.easysendtrans.Pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.easysendtrans.Login.LoginActivity;
import com.example.easysendtrans.Main.MainActivity;
import com.example.easysendtrans.R;

public class RegistrasiActivity extends AppCompatActivity {

    private Button tombole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);


        //aktivasi tombol daftar ke home
        tombole = (Button) findViewById(R.id.pendaftaran_form);
        tombole.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrasiActivity.this, MainActivity.class);
                startActivity(i); }
        });


    }
}
