package com.fedosin;

public class Duck extends Animal {

    public Duck (String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public Duck() {
        super();
    }
        public void fly() {
            System.out.println("Я лечу");

        }


        @Override
    public void say() {
        System.out.println("Кря");
    }


}