package com.example.firstapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button B1,B2,B3,B4,B5;
    Intent i1,i2,i3,i4,i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/
        B1=(Button)findViewById(R.id.button1);
        B2=(Button)findViewById(R.id.button2);
        B3=(Button)findViewById(R.id.button3);
        B4=(Button)findViewById(R.id.button4);
        B5=(Button)findViewById(R.id.button5);
        B1.setOnClickListener(new ButtonListener());
        B2.setOnClickListener(new ButtonListener());
        B3.setOnClickListener(new ButtonListener());
        B4.setOnClickListener(new ButtonListener());
        B5.setOnClickListener(new ButtonListener());
    }
    public class ButtonListener implements View.OnClickListener{
        public void onClick(View v)
        {
            switch(v.getId()){
                case R.id.button1:
                    i1=new Intent(MainActivity.this,FirstFragment.class);
                    startActivity(i1);
                    break;
                case R.id.button2:
                    i2=new Intent(MainActivity.this,SecondFragment.class);
                    startActivity(i2);
                    break;
                case R.id.button3:
                    i3=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i3);
                    break;
                case R.id.button4:
                    i4=new Intent(MainActivity.this,First2Fragment.class);
                    startActivity(i4);
                    break;
                case R.id.button5:
                    i5=new Intent(MainActivity.this,Second2Fragment.class);
                    startActivity(i5);
                default:
                    break;

            }
        }
    }

}
