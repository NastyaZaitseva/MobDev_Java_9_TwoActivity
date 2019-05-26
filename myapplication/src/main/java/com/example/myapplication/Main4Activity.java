package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    TextView TV3;
    Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TV3 = findViewById(R.id.TV3);
        bt5 = findViewById(R.id.btn_start_4activity);

        bt5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, Main3Activity.class);
        startActivity(intent);

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
