package com.demo.sqlitedababase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Main4Activity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Main4Activity.this,Main6Activity.class);
                Main4Activity.this.startActivity(mainIntent);
                Main4Activity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
