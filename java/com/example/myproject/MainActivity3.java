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

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("ResourceType")
    Button btn ;
    EditText et;
    String st;

    TextView loginpage;

    EditText name,email,number,add;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setTitle("Activity 2");

        btn = findViewById(R.id.button);
        et = findViewById(R.id.editTextTextPersonName2);

        name =findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextEmailAddress);
        number = findViewById(R.id.editTextPhone);
        add = findViewById(R.id.editTextTextPostalAddress);

        loginpage = findViewById(R.id.textView23);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Name is compulsory");
                }
                else if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("Email is compulsory");
                }
                else if(TextUtils.isEmpty(number.getText().toString())){
                    number.setError("Phone Number is compulsory");
                }
                else if(TextUtils.isEmpty(add.getText().toString())){
                    add.setError("Address is compulsory");
                }else
                {
                    Toast.makeText(MainActivity3.this,"Sign-Up Successful",Toast.LENGTH_LONG).show();
                    Intent intent = new  Intent (MainActivity3.this,MainActivity2.class);
                    st = et.getText().toString();
                    intent.putExtra("value",st);
                    startActivity(intent);
                }




            }
        });

        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity5.class));

            }
        });




    }

}