package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        screen = findViewById(R.id.screen);

        Bundle bundle = getIntent().getExtras();
        float a = bundle.getFloat("tv");
        float b = bundle.getFloat("number");
        String c = bundle.getString("person");

        screen.setText(""+a +"Addition of"+b +"by"+c);
    }
}