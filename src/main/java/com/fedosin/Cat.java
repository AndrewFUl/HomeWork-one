package com.fedosin;

public class Cat extends Animal {

       public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Cat() {
       super();
    }

    @Override
    public void say(){
        System.out.println("Мяу");
    }
}
