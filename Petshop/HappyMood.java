package com.example.lab1;


public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(String date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Happy";
    }
}
