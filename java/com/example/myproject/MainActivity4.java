package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getSupportActionBar().setTitle("Activity 4");

    }
    public void openthird(View view)
    {
        startActivity(new Intent(this,MainActivity2.class));

    }

}