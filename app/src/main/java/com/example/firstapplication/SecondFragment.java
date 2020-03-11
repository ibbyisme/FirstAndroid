package com.example.firstapplication;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.navigation.fragment.NavHostFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends AppCompatActivity {

    Button b31,b32,b33,b34,b35;
    Intent I31;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);

        b31=(Button)findViewById(R.id.button10);
        b31.setOnClickListener(new ButtonListener());
        b32=(Button)findViewById(R.id.button11);
        b32.setOnClickListener(new ButtonListener());
        b33=(Button)findViewById(R.id.button12);
        b33.setOnClickListener(new ButtonListener());
        b34=(Button)findViewById(R.id.button13);
        b34.setOnClickListener(new ButtonListener());
        b35=(Button)findViewById(R.id.button14);
        b35.setOnClickListener(new ButtonListener());
    }
    class ButtonListener implements View.OnClickListener{
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.button10:
                    Toast.makeText(SecondFragment.this,"你点击了第一个按钮",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button11:
                    Toast.makeText(SecondFragment.this,"你点击了第二个按钮",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button12:
                    Toast.makeText(SecondFragment.this,"你点击了第三个按钮",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button13:
                    Toast.makeText(SecondFragment.this,"你点击了第四个按钮",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button14:
                    I31=new Intent(SecondFragment.this,MainActivity.class);
                    startActivity(I31);
                    break;
                default:
                    break;
            }
        }
    }
   /* @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }*/
}
