package com.example.cw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie m1 = new Movie("HarryPotter","Daniel Radcliife",8.1,13,"fantasy , adventure");
        Movie m2 = new Movie(" moana","a",7.6,6,"adventure");
    }
}