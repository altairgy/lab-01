package com.example.lab1;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorpy");


        HappyMood happyMood = new HappyMood("2026-01-09");
        SadMood sadMood = new SadMood();


        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        for (Pet p : petList) {
            Log.d("DEMO", p.getName() + " says " + p.speak());
        }

        Log.d("DEMO", "Mood: " + happyMood.getMoodDescription() + ", Date: " + happyMood.getDate());
        Log.d("DEMO", "Mood: " + sadMood.getMoodDescription() + ", Date: " + sadMood.getDate());

        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);

        for (Pettable pt : pettablePets) {
            pt.pet();
        }

    }
}









