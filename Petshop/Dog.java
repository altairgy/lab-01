package com.example.lab1;



// Dog.java
public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name); // 调用父类构造器
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {
        System.out.println(getName() + " wags tail.");
    }
}



