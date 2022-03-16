package com.fedosin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//System.out.println("спросить какое животное(cat/dog/duck)");
//System.out.println("Выбери пункт меню = add/list/exit");

//System.out.println("Выбери пункт меню = add/list/exit");
//String menu1 = scanner.next().toUpperCase(Locale.ROOT);
//String menu1 = scanner.next().toUpperCase(Locale.ROOT);

// Если list

//      Вывести на экран метод toString() для всех елементов массива

//   Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
//Cat cat = new Cat();
//List<Cat>cats = new ArrayList<>();

//System.out.println();


// #Если add
//       спросить какое животное(cat/dog/duck)
//     Спросить имя, возраст, вес, цвет

//        ##Если list
//      Вывести на экран метод toString() для всех елементов массива
//    ##Если exit
//  выйти из программы


//        Animal animal = new Animal("Бобик", 5, 15, "черный");
//        System.out.println();
//

//        Duck duck = new Duck("Даг", 5, 12, "Серый");
//        duck.say();
//        duck.fly();

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        //  boolean isExit = true;
        // System.out.println("Выбери пункт меню = add/list/exit");
        Scanner scanner = new Scanner(System.in);

        // String menu = scanner.next().toUpperCase(Locale.ROOT);
//        System.out.println ("спросить какое животное(cat/dog/duck)");
//        Command add = Command.ADD;
//        Command list = Command.LIST;
//        Command exit = Command.EXIT;
        //boolean cat = true;
        //Dog dog = new Dog();
        Cat cat = new Cat("Боб", 1, 10, "белый");
        cat.say();

        Dog dog = new Dog("Альфа", 3, 17, "белый");
        dog.say();

        Duck duck = new Duck("Даг", 5, 12, "Серый");
        duck.say();


        while (true) {
            System.out.println("Выбери пункт меню = add/list/exit");
            Command command = Command.valueOf(scanner.next().toUpperCase(Locale.ROOT));
            switch (command) {
                case ADD:
                    System.out.println("Какое животное(cat/dog/duck)");
                case LIST:
                    System.out.println("Выбери пункт меню = add/list/exit");
                    break;
                case EXIT:
                    System.out.println("Выход");
                    System.exit(1);
                    //isExit = false;
                    break;

            }
        }
    }
}