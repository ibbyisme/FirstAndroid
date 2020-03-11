package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity {

    FrameLayout frame1;
    ViewFlipper filpper1;
    Button bu;
    Intent it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        frame1=(FrameLayout)findViewById(R.id.frameLayout);
        filpper1=(ViewFlipper)findViewById(R.id.filpper);
        bu=(Button)findViewById(R.id.button41);
        filpper1.setAutoStart(true);
        filpper1.setFlipInterval(1000);
        bu.setOnClickListener(new ButtonListener());
    }
    public class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            it=new Intent(Main2Activity.this,MainActivity.class);
            startActivity(it);
        }
    }
   /* public void auto(View sources)
    {
        filpper1.setInAnimation(this,android.R.anim.slide_in_left);
        filpper1.setOutAnimation(this,android.R.anim.slide_out_right);

    }*/
}
