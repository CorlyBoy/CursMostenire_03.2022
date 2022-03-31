package example2.soldiers.bad_guys;

import example2.soldiers.Soldier;
import example2.weapons.Weapon;

import java.util.ArrayList;

public class Terrorist extends Soldier {

    public Terrorist(String name, int age, ArrayList<Weapon> weapons, int health) {
        super(name, age, weapons, health);
    }
}
