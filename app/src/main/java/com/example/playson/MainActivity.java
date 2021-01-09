package com.example.playson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //button objects
    private Button buttonPlayer;
    private Button buttonStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlayer = (Button) findViewById(R.id.buttonPlayer);
        buttonStop = (Button) findViewById(R.id.buttonStop);

        buttonPlayer.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View views) {
        if (views == buttonPlayer) {
            startService(new Intent(this, MyService.class));
        } else if (views == buttonStop) {
            stopService(new Intent(this, MyService.class));
        }
    }
}