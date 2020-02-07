package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView = (TextView) findViewById(R.id.fill_text);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        myTextView.setText("Hello " + str);
    }
}
