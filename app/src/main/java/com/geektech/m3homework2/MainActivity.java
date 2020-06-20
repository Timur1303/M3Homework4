package com.geektech.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, MainActivityApp.class);
                startActivity(startIntent);

            }
        });

        Button btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent();
                sendIntent.putExtra(Intent.EXTRA_TEXT, "text");
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");

                if (sendIntent.resolveActivity(getPackageManager()) !=null) {
                    startActivity(sendIntent);
                }

            }
        });
    }
}

