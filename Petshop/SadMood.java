package com.example.lab1;


public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(String date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Sad";
    }
}

