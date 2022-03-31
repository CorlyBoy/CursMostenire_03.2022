package example1.animals;

public class Animal {

    public String name;
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating..");
    }

    public void sleep(){
        System.out.println(name + " is sleeping..");
    }


}
