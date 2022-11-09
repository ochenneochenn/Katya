package com.example.arturaandkakatya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat firstCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCat = new Cat(1, "Boris", "Maine Coon", "gray");
        firstCat.talk();

        Cat secondCat = new Cat(3, "Maurizio", "British", "orange");
        secondCat.talk();

        Cat therdCat = new Cat();
        therdCat.age = 15;
        therdCat.name = "Bogdan";
        therdCat.poroda = "Sphinx";
        therdCat.colour = "pink";
        therdCat.talk();
    }
}