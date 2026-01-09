package com.example.lab1;



public abstract class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    public abstract String speak();   // 子类必须实现

    public String getName() {
        return name;
    }
}

