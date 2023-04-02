package com.example.example4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEna, cbCha, cbRot;
    Button button2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("예제4-7");


        cbEna = (CheckBox) findViewById(R.id.ChEna);
        cbCha = (CheckBox) findViewById(R.id.CbCha);
        cbRot = (CheckBox) findViewById(R.id.CbRot);
        button2 = (Button) findViewById(R.id.button2);

        cbEna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    button2.setEnabled(true);
                } else {
                    button2.setEnabled(false);
                }
            }
        });

        cbCha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    button2.setClickable(true);
                } else {
                    button2.setClickable(false);
                }
            }
        });

        cbRot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    button2.setRotation(45);
                } else {
                    button2.setRotation(0);
                }
            }
        });
    }
}