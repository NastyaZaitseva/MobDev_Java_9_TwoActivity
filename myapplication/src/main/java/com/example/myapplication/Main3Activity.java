package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    TextView TV2;
    Button bt3;
    Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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
                Intent intent1 = new Intent(this, Main2Activity.class);
                intent1.putExtra("username", "Имя");
                startActivity(intent1);
                break;

            case R.id.btn_end_3activity:
                Intent intent = new Intent(this, Main4Activity.class);
                intent.putExtra("username", "Имя");
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        // TODO Auto-generated method stub

        switch (id){
            case R.id.page_1:
                Intent intent=new Intent(this, MainActivity.class);
                intent.putExtra("username", "Имя");
                startActivity(intent);
                break;
            case R.id.page_2:
                Intent intent2=new Intent(this, Main2Activity.class);
                intent2.putExtra("username", "Имя");
                startActivity(intent2);
                break;
            case R.id.page_3:
                Intent intent3=new Intent(this, Main3Activity.class);
                intent3.putExtra("username", "Имя");
                startActivity(intent3);
                break;
            case R.id.page_4:
                Intent intent4=new Intent(this, Main4Activity.class);
                intent4.putExtra("username", "Имя");
                startActivity(intent4);
                break;


            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }
}