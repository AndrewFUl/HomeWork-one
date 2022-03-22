public class Duck extends Animal {

    public Duck (String name, int age, int weight, String color) {
        super(name, 1, 10, "белый");
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