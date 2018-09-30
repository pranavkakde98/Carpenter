package com.example.pranav.carpenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main5Activity extends AppCompatActivity {

    public class Main5Activity extends AppCompatActivity {
        private RadioButton radioButton;
        private RadioButton radioButton1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main5);
            radioButton=(RadioButton) findViewById(R.id.a2);
            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c3();
                }

            });
            radioButton1=(RadioButton) findViewById(R.id.a5);
            radioButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    c4();
                }

            });
        }

        private void c4() {
            Intent intent=new Intent(this,Main4Activity.class);
            startActivity(intent);
        }

        private void c3() {
            Intent intent=new Intent(this,Main3Activity.class);
            startActivity(intent);


        }
    }
