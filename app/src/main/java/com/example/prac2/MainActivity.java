package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button yesB, noB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesB = (Button) findViewById(R.id.yesB);
        noB = (Button) findViewById(R.id.noB);

        yesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //opens new activity
                startActivity(PreferenceActivity.getIntent(MainActivity.this));
            }
        });
    }
}