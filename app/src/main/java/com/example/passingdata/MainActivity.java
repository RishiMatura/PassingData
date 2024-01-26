package com.example.passingdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText editText1;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enableIntent();
            }
        });
    }
    public void enableIntent(){
        String name = editText1.getText().toString();
        Intent intent = new Intent(this, GetNameActivity.class);
        intent.putExtra("Name", name);
        startActivity(intent);
    }
}