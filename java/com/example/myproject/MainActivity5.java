package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity5 extends AppCompatActivity {

    TextView btn;
    EditText username,pass,getUsernametext;
    EditText et;
    String st;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getSupportActionBar().setTitle("Login Page");

        username = findViewById(R.id.editTextTextPersonName3);
        pass = findViewById(R.id.pass);
        btn = findViewById(R.id.button);

        getUsernametext =findViewById(R.id.editTextTextPersonName3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText().toString())){
                    username.setError("Username is compulsory");
                }

                else if(TextUtils.isEmpty(pass.getText().toString())){
                    pass.setError("pass is compulsory");
                }
//                else if(username.equals("admin") && pass.equals("admin123")){
//                    Toast.makeText(MainActivity5.this,"User Name is correct",Toast.LENGTH_LONG).show();
//
//                }
                else{
                    Toast.makeText(MainActivity5.this,"Login Successful",Toast.LENGTH_LONG).show();
                    Intent intent = new  Intent (MainActivity5.this,MainActivity2.class);
                    st = getUsernametext.getText().toString();
                    intent.putExtra("value",st);
                    startActivity(intent);
                }
            }
        });



    }
}