package example1.animals.mammals;

import example1.animals.Animal;

public class Dog extends Animal {

    String leashColor;

    public Dog(String name, int age, String color, String leashColor) {
        super(name, age, color);

        this.leashColor = leashColor;
    }
}
