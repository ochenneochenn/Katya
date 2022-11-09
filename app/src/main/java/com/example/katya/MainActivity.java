package com.example.katya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    com.example.katya.Cat firstCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCat = new com.example.katya.Cat(1, "Boris", "Maine Coon", "gray");
        firstCat.talk();

        com.example.katya.Cat secondCat = new com.example.katya.Cat(3, "Maurizio", "British", "orange");
        secondCat.talk();

        com.example.katya.Cat therdCat = new com.example.katya.Cat();
        therdCat.age = 15;
        therdCat.name = "Bogdan";
        therdCat.poroda = "Sphinx";
        therdCat.colour = "pink";
        therdCat.talk();
    }
}