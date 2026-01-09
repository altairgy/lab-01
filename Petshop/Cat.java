package com.example.lab1;



// Cat.java
public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name); // 调用父类构造器
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {
        // 被抚摸的行为，随便定义
        System.out.println(getName() + " purrs happily."); // 打呼噜
    }
}



