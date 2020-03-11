package com.example.firstapplication;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class First2Fragment extends AppCompatActivity {
    Button b51,b52,b53,b54,b55;
    Intent I5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first2);{
            b51=(Button)findViewById(R.id.button15);
            b51.setOnClickListener(new ButtonListener());
            b52=(Button)findViewById(R.id.button16);
            b52.setOnClickListener(new ButtonListener());
            b53=(Button)findViewById(R.id.button17);
            b53.setOnClickListener(new ButtonListener());
            b54=(Button)findViewById(R.id.button18);
            b54.setOnClickListener(new ButtonListener());
            b55=(Button)findViewById(R.id.button20);
            b55.setOnClickListener(new ButtonListener());
        }
    }
    class ButtonListener implements View.OnClickListener {
        @SuppressLint("ShowToast")
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button15:
                    Toast.makeText(First2Fragment.this, "你点击了第一个按钮", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button16:
                    Toast.makeText(First2Fragment.this, "你点击了第二个按钮", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button17:
                    Toast.makeText(First2Fragment.this, "你点击了第三个按钮", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button18:
                    Toast.makeText(First2Fragment.this, "你点击了第四个按钮", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button20:
                    I5 = new Intent(First2Fragment.this, MainActivity.class);
                    startActivity(I5);
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
        return inflater.inflate(R.layout.fragment_first2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(First2Fragment.this)
                        .navigate(R.id.action_First2Fragment_to_Second2Fragment);
            }
        });
    }*/
}
