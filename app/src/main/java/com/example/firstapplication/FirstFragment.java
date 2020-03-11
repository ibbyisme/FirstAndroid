package com.example.firstapplication;
import android.content.Intent;
import android.os.Bundle;
//import android.view.LayoutInflater;
import android.view.Gravity;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends AppCompatActivity {

    LinearLayout myLayout;

    Button b21,b22,b23,b24;
    Intent I;
    //Intent i21,i22,i23,i24;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        myLayout=(LinearLayout)findViewById(R.id.root1);
        //setContentView(R.layout.fragment_first);

        b21=(Button)findViewById(R.id.button6);
        b21.setOnClickListener(new ButtonListener());
        b22=(Button)findViewById(R.id.button7);
        b22.setOnClickListener(new ButtonListener());
        b23=(Button)findViewById(R.id.button8);
        b23.setOnClickListener(new ButtonListener());
        b24=(Button)findViewById(R.id.button9);
        b24.setOnClickListener(new ButtonListener());
    }
    public class ButtonListener  implements View.OnClickListener{

        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.button6:
                    myLayout.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.button7:
                    myLayout.setOrientation(LinearLayout.VERTICAL);
                    myLayout.setGravity(Gravity.CENTER);
                    break;
                case R.id.button8:
                    myLayout.setGravity(Gravity.LEFT|Gravity.CENTER);
                    break;
                case R.id.button9:
                    I=new Intent(FirstFragment.this,MainActivity.class);
                    startActivity(I);
                    break;
                default:
                    break;

            }
        }

    /*@Override
   public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }*/}
}
