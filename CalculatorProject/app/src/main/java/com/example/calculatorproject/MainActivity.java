package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1, text2;
    Button btadd, btsub, btpro, btdiv;
    TextView result;
    String num1, num2;
    Integer answer;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블레이아웃 계산기");

        text1 = (EditText) findViewById(R.id.num1);
        text2 = (EditText) findViewById(R.id.num2);
        btadd = (Button) findViewById(R.id.btadd);
        btdiv = (Button) findViewById(R.id.btdiv);
        btpro = (Button) findViewById(R.id.btpro);
        btsub = (Button) findViewById(R.id.btsub);
        result = (TextView) findViewById(R.id.result);

        btadd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = text1.getText().toString();
                num2 = text2.getText().toString();
                answer = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText("계산결과 : " + answer.toString());
                return false;
            }
        });

        btsub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = text1.getText().toString();
                num2 = text2.getText().toString();
                answer = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText("계산결과 : " + answer.toString());
                return false;
            }
        });

        btpro.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = text1.getText().toString();
                num2 = text2.getText().toString();
                answer = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText("계산결과 : " + answer.toString());
                return false;
            }
        });

        btdiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = text1.getText().toString();
                num2 = text2.getText().toString();
                answer = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText("계산결과 : " + answer.toString());
                return false;
            }
        });

        for (i = 0; i < numBtnIDs.length; i++) {
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        for (i = 0; i < numBtnIDs.length; i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (text1.isFocused() == true) {
                        num1 = text1.getText().toString() + numButtons[index].getText().toString();
                        text1.setText(num1);
                    } else if (text2.isFocused() == true) {
                        num2 = text2.getText().toString() + numButtons[index].getText().toString();
                        text2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}