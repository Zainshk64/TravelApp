package com.example.myproject;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    String st;

    BottomNavigationView bottomNavigationView;
    FrameLayout Framelayout;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("Activity 3");

        bottomNavigationView = findViewById(R.id.bottomNav);
        Framelayout = findViewById(R.id.Framelayout);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.home) {
                    loadfrag(new HomeFragment(),false);


                } else if (itemId == R.id.about) {
                    loadfrag(new AboutFragment(),false);
                }
                else if (itemId == R.id.fav){
                    loadfrag(new favFragment(),false);

                }
                else{
                    loadfrag(new setiingFragment(),true);


                }
                loadfrag(new HomeFragment(),true);



            }
        });

        tv = findViewById(R.id.textView5);
        st = getIntent().getStringExtra("value");
        tv.setText(st);


    }
    public void loadfrag(Fragment fragment, boolean isAppInitialized){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        if(isAppInitialized){
            fragmentTransaction.add(R.id.Framelayout,fragment);
        }
        else
        {
            fragmentTransaction.replace(R.id.Framelayout, fragment);

        }
        fragmentTransaction.commit();

    }






    public void openfourth(View view) {
        startActivity(new Intent(this, MainActivity4.class));
    }

    public void opensix(View view) {
        startActivity(new Intent(this, MainActivity6.class));
    }



}