package com.example.pranav.carpenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=(Button) findViewById(R.id.b16);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p4();
            }
        });
    }

    private void p4() {
        Intent intent=new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
}

