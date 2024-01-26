package com.example.passingdata;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GetNameActivity extends AppCompatActivity {
    TextView textView2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_name);

        textView2 = findViewById(R.id.textView2);
        Intent intent=getIntent();
        String name = intent.getStringExtra("Name");
        textView2.setText("Hello "+ name +"!");

    }
}