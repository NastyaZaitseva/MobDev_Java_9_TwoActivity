package com.example.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
