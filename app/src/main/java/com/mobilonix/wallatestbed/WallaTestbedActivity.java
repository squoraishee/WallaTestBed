package com.mobilonix.wallatestbed;


import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class WallaTestbedActivity extends AppCompatActivity {

    FrameLayout mainContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walla_testbed);

        mainContainer = findViewById(R.id.main_container);

        addSplashScreen();

        //set timer
        mainContainer.postDelayed(new Runnable() {
            @Override
            public void run() {
                removeSplashScreen();
            }
        }, 5000);
    }

    public void addSplashScreen() {
        SplashScreenView splashScreenView = (SplashScreenView)
                LayoutInflater.from(this)
                        .inflate(R.layout.view_splash_screen,
                                null, false);
        mainContainer.addView(splashScreenView);
    }

    public void removeSplashScreen() {
        mainContainer.removeView(findViewById(R.id.splash_screen_view));
    }

}
