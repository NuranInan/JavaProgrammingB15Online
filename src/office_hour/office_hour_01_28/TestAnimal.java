package office_hour.office_hour_01_28;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        dog.eat();

        System.out.println("==================");
        Cat cat = new Cat();
        cat.eat();
        cat.call();


    }
}
