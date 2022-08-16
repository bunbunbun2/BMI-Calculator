package com.example.prac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreferenceActivity extends AppCompatActivity {

    Button metric, imperial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        metric = (Button) findViewById(R.id.metric);
        imperial = (Button) findViewById(R.id.imperial);

        metric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MetricActivity.getIntent(PreferenceActivity.this));
            }
        });

    }

    public static Intent getIntent(Context c) {
        Intent intent = new Intent(c, PreferenceActivity.class);
        return intent;

    }
}