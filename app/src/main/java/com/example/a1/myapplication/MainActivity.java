package com.example.a1.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
private Button button_11,button_12,button_13,button_21,button_22,button_23,button_31,button_32,button_33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_11 = (Button) findViewById(R.id.button_11);
        button_12 = (Button) findViewById(R.id.button_12);
        button_13 = (Button) findViewById(R.id.button_13);
        button_21 = (Button) findViewById(R.id.button_21);
        button_22 = (Button) findViewById(R.id.button_22);
        button_23 = (Button) findViewById(R.id.button_23);
        button_31 = (Button) findViewById(R.id.button_31);
        button_32 = (Button) findViewById(R.id.button_32);
        button_33 = (Button) findViewById(R.id.button_33);

        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_11.setText("X");
                button_11.setEnabled(false);
            }
        });

        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_12.setText("X");
                button_12.setEnabled(false);
            }
        });
        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_13.setText("X");
                button_13.setEnabled(false);
            }
        });
        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_21.setText("X");
                button_21.setEnabled(false);
            }
        });
        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_22.setText("X");
                button_22.setEnabled(false);
            }
        });
        button_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_23.setText("X");
                button_23.setEnabled(false);
            }
        });
        button_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_31.setText("X");
                button_31.setEnabled(false);
            }
        });
        button_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_32.setText("X");
                button_32.setEnabled(false);
            }
        });

        button_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button_33.setText("X");
                button_33.setEnabled(false);
            }
        });
    }

}

