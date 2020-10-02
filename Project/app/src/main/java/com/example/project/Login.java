package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void next(View view){
        Intent it = new Intent(getApplicationContext(),Register.class);
        startActivity(it);

    }

    public void nextM(View view){
        Intent it = new Intent(getApplicationContext(),Menu.class);
        startActivity(it);

    }



}