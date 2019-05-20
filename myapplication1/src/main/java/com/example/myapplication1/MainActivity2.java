package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView TV2;
    Button bt3;
    Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TV2 = findViewById(R.id.TV2);
        bt3 = findViewById(R.id.btn_start_3activity);
        bt4 = findViewById(R.id.btn_end_3activity);

        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_3activity:
                Intent intent1 = new Intent(this, MainActivity1.class);
                startActivity(intent1);
                break;

            case R.id.btn_end_3activity:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                break;
        }
    }
}