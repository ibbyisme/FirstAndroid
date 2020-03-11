package com.example.firstapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class Second2Fragment extends  AppCompatActivity {

    Intent I6;
    Button b6;
    GridLayout myGrid;
    String chars[]=new String[]{
            "1","2","3","4","5",
            "6","7","8","9","0",
            "+","-","*","/","="
    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second2);
        myGrid=(GridLayout)findViewById(R.id.root);
        for(int i=0;i<chars.length;i++)
        {

            Button bt=new Button(this);
            bt.setText(chars[i]);
            bt.setTextSize(60);
            bt.setPadding(30,50,30,50);
            GridLayout.Spec rowSpec=GridLayout.spec(i/3);
            GridLayout.Spec columnSpec=GridLayout.spec(i%3);
            GridLayout.LayoutParams params=new GridLayout.LayoutParams(rowSpec,columnSpec);
            params.setGravity(Gravity.FILL);
            myGrid.addView(bt,params);
        }

        b6=(Button)findViewById(R.id.button19);
        b6.setOnClickListener(new ButtonListener());

    }
    public class ButtonListener implements View.OnClickListener{
        public void onClick(View v){
            I6=new Intent(Second2Fragment.this,MainActivity.class);
            startActivity(I6);
        }
    }

    /*@Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Second2Fragment.this)
                        .navigate(R.id.action_Second2Fragment_to_First2Fragment);
            }
        });
    }*/
}
