package com.example.example4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    ImageView img;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("예제 4-9");

        bt1 = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.imageView);
        bt1.setOnClickListener(view -> img.setRotation(a += 10));
    }
}