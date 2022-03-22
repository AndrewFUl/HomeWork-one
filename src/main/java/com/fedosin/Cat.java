public class Cat extends Animal {

    public Cat(String name, int age, int weight, String color) {

    }

    public Cat () {
        super();
    }

    @Override
    public void say(){
        System.out.println("Мяу");
    }
}
