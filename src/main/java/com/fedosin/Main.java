package com.fedosin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выбери пункт меню = add/list/exit");
            Command command = Command.valueOf(scanner.next().toUpperCase(Locale.ROOT));
            switch (command) {
                case ADD:
                    System.out.println ("спросить какое животное(cat/dog/duck)");
                    String com = scanner.next();
                    if (com.equals("cat")) {
                        Animal cat = new Cat();
                        generetAnimal(cat, scanner);
                        animals.add(cat);
                        cat.say();

                    } else if (com.equals("dog")) {
                        Animal dog = new Dog();
                        generetAnimal(dog, scanner);
                        animals.add(dog);
                        dog.say();

                    } else if (com.equals("duck")) {
                        Animal duck = new Duck();
                        generetAnimal(duck, scanner);;
                        animals.add(duck);
                        duck.say();
                    }
                    break;

                case LIST:
                    for ( int i = 0; i < animals.size(); i++) {
                    System.out.println (animals.get(i));
                    }
                    break;

                case EXIT:
                    System.out.println ("Выход");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void generetAnimal(Animal animal, Scanner scanner) {
        System.out.println("Имя");
        animal.setName(scanner.next());
        System.out.println("Возраст");
        animal.setAge(scanner.nextInt());
        System.out.println("Вес");
        animal.setWeight(scanner.nextInt());
        System.out.println("Цвет");
        animal.setColor(scanner.next());
    }
}

