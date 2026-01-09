package com.example.lab1;


public abstract class Mood {
    private String date;

    public Mood() {
        this.date = "2026-01-09";
    }

    public Mood(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public abstract String getMoodDescription();
}

