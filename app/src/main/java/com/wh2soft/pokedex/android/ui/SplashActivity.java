package com.wh2soft.pokedex.android.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wh2soft.pokedex.android.R;
import com.wh2soft.pokedex.android.flowcontroller.FlowController;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        FlowController.launchMainActivity(this);
    }
}
