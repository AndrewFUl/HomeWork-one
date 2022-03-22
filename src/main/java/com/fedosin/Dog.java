public class Dog extends Animal {

    public Dog(String name, int age, int weight, String color) {
        super(name, 1, 10, "белый");
    }

    public Dog() {
        super();
    }




    @Override
    public void say() {
        System.out.println("Гав");
    }
}
