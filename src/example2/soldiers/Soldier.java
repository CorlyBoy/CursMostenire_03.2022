package example2.soldiers;

import example2.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class Soldier {

    String name;
    int age;
    int health;
    ArrayList<Weapon> weapons;

    public Soldier(String name, int age, ArrayList<Weapon> weapons, int health) {
        this.name = name;
        this.age = age;
        this.weapons = weapons;
        this.health = health;
    }

    public Weapon chooseWeapon(){
        Random rnd = new Random();
        int weaponIndex = rnd.nextInt(weapons.size());
        return weapons.get(weaponIndex);
    }

    public void attack(Soldier enemy, Weapon weapon){

        while (true){
            if(enemy.health > 0) {
                enemy.health -= weapon.damage;
                System.out.println(this.name + " attacked " + enemy.name + " with " + weapon.brand);
            }
            else{
                System.out.println("You won!");
                break;
            }
        }
    }
}
