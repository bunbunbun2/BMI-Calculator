package com.example.prac2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import java.lang.annotation.Inherited;

public class MetricActivity extends AppCompatActivity {

    Slider wtSliderMetric;
    EditText wtInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metric);

        wtSliderMetric = (Slider) findViewById(R.id.wtSliderMetric);
        wtInput = (EditText) findViewById(R.id.wtInput);

        wtSliderMetric.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch(@NonNull Slider slider) {
                //Responds to when slider's touch event is being started
                double weight = slider.getValue();
                wtInput.setText(String.format("%.2f", weight));
            }

            @Override
            public void onStopTrackingTouch(@NonNull Slider slider) {
                //Responds to when slider's touch event is being stopped
                double weight = slider.getValue();
                wtInput.setText(String.format("%.2f", weight));
            }
        });
    }

    public static Intent getIntent(Context c) {
        Intent intent = new Intent(c, MetricActivity.class);
        return intent;
    }
}