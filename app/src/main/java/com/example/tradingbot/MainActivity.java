package com.example.tradingbot;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent(this, WhatsAppReaderService.class);
    }

    public void startService(View view){
        startService(serviceIntent);
    }

    public void stopService(View view){
        stopService(serviceIntent);
    }
}