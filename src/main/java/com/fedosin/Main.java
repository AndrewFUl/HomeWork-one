

import javafx.animation.ScaleTransition;

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
                        System.out.println ("Уточните: имя, возраст, вес, цвет");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String name = reader.readLine();
                        int age = Integer.parseInt(reader.readLine());
                        int weight = Integer.parseInt(reader.readLine());
                        String color = reader.readLine();
                        Animal cat = new Animal(name, age, weight, color);
                        animals.add(cat);
                    } else if (com.equals("dog")) {
                        System.out.println("Уточните: имя, возраст, вес, цвет");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String name = reader.readLine();
                        int age = Integer.parseInt(reader.readLine());
                        int weight = Integer.parseInt(reader.readLine());
                        String color = reader.readLine();
                        Animal dog = new Animal( name, age, weight, color);
                        animals.add(dog);
                    } else if (com.equals("duck")) {
                        System.out.println("Уточните: имя, возраст, вес, цвет");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String name = reader.readLine();
                        int age = Integer.parseInt(reader.readLine());
                        int weight = Integer.parseInt(reader.readLine());
                        String color = reader.readLine();
                        Animal duck = new Animal(name, age, weight, color);
                        animals.add(duck);
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
}