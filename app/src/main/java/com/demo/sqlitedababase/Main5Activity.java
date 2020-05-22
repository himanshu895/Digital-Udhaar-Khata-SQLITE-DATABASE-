package com.demo.sqlitedababase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
CardView c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        c1= (CardView) findViewById(R.id.cardview);
        c2= (CardView) findViewById(R.id.cardview2);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,MainActivity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"Personal Account",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,MainActivity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"Business Account",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
