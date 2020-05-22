package com.demo.sqlitedababase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        c1= (CardView) findViewById(R.id.cardview);
        c2= (CardView) findViewById(R.id.cardview2);
        c3= (CardView) findViewById(R.id.cardview3);
        c4= (CardView) findViewById(R.id.cardview4);
        c5= (CardView) findViewById(R.id.cardview5);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this,Main3Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"You Choose English Language",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this,Main7Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"You Choose Hinglish Language",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this,Main8Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"You Choose Telgu Language",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this,Main9Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"You Choose Tamil Language",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main6Activity.this,Main10Activity.class);
                startActivity(i);
                Toast toast = Toast.makeText(getApplicationContext(),"You Choose France Language",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


    }
}
