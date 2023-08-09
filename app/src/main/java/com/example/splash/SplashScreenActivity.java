package com.example.splash;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    Handler mHandler;
    Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        mHandler = new Handler();
        mRunnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // its trigger runnable after 4000 millisecond.
        mHandler.postDelayed(mRunnable,4000);

    }

}



          <activity
            android:name=".MainActivity"
                    android:exported="false" />

           <activity
            android:name=".SplashScreenActivity"
                    android:exported="true"
                    android:theme="@style/Theme.MaterialComponents.DayNight.NoActionBar">
 < intent-filter>
<action android:name="android.intent.action.MAIN" />

<category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
</activity>