package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView TV;
    TextView TV0;
    Button bt;
    Button bt0;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV=findViewById(R.id.TV1);
        TV0=findViewById(R.id.edd_name);

        ed=findViewById(R.id.enter_name);

        bt=findViewById(R.id.btn_end_1activity);
        bt0=findViewById(R.id.save);

        bt0.setOnClickListener(this);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_end_1activity:
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("username", "Имя");
                startActivity(intent);
                break;

            case R.id.save:
                Intent intent0=new Intent(MainActivity.this, Main2Activity.class);
                intent0.putExtra("username", ed.getText().toString());
                startActivity(intent0);
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