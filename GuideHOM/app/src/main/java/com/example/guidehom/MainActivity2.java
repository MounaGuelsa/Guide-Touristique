package com.example.guidehom;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


        Button btn1,btn2,btn3;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            //Hooks


            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
            btn3 = findViewById(R.id.btn3);
            //Pass Data on Button Click
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Get data from input field
                    //Pass data to 2nd activity
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);

                    startActivity(intent);
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Get data from input field


                    //Pass data to 2nd activity
                    Intent intent = new Intent(MainActivity2.this, MainActivity2.class);

                    startActivity(intent);
                }
            });
        }
    }