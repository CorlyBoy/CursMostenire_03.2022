package example1;

import example1.animals.mammals.Cat;
import example1.animals.mammals.Dog;
import example1.animals.birds.Pigeon;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Spike", 5, "gray", "golden");

        Cat cat = new Cat("Tom", 6, "black");
        Pigeon pigeon = new Pigeon("Rocco", 2, "multicolor");

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        pigeon.eat();
        pigeon.sleep();
        pigeon.fly();
    }
}
