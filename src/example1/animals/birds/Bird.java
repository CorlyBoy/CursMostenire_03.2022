package example1.animals.birds;

import example1.animals.Animal;

public class Bird extends Animal {

    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    public void fly(){
        System.out.println(name + " is flying..");
    }
}
