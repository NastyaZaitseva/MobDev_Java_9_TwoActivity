package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {
    TextView TV1;
    Button bt1;
    Button bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TV1=findViewById(R.id.TV1);
        bt1=findViewById(R.id.btn_start_2activity);
        bt2=findViewById(R.id.btn_end_2activity);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
switch (v.getId()){
    case R.id.btn_start_2activity:
        Intent intent1=new Intent(this, MainActivity.class);
        startActivity(intent1);
        break;

    case R.id.btn_end_2activity:
        Intent  intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
        break;
}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        // TODO Auto-generated method stub

        switch (id){
            case R.id.page_1:
                Intent intent=new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.page_2:
                Intent intent2=new Intent(this, MainActivity1.class);
                startActivity(intent2);
                break;
            case R.id.page_3:
                Intent intent3=new Intent(this, MainActivity2.class);
                startActivity(intent3);
                break;
            case R.id.page_4:
                Intent intent4=new Intent(this, MainActivity3.class);
                startActivity(intent4);
                break;


            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }
}
