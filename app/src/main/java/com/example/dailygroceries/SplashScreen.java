package com.example.dailygroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    // Duration of wait (in milliseconds) before transitioning to the main activity
    private static final int SPLASH_DURATION = 3000;


    Animation animation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        ImageView splashImg=findViewById(R.id.splashImg);
        animation= AnimationUtils.loadAnimation(this,R.anim.translate_splash);
        splashImg.setAnimation(animation);
        TextView titleTxt = findViewById(R.id.titleTxt);
        titleTxt.setAnimation(animation);



        // Use a handler to delay the transition to the main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);
    }
}