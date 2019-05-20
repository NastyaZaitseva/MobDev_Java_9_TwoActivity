package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView TV;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        TV=findViewById(R.id.TV1);
        bt=findViewById(R.id.btn_end_1activity);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent  intent=new Intent(this, MainActivity1.class);
        startActivity(intent);

    }
}
