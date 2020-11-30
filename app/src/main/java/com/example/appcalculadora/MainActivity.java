package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Iniciando", Toast.LENGTH_SHORT).show();
                Intent O = new Intent(MainActivity.this,MainActivity.class);
                startActivity(O);
                finish();
            }
        }, 1000);
    }
}



