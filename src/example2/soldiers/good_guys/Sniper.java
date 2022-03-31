package example2.soldiers.good_guys;

import example2.soldiers.Soldier;
import example2.weapons.Weapon;

import java.util.ArrayList;

public class Sniper extends Soldier {
    public Sniper(String name, int age, ArrayList<Weapon> weapons, int health) {
        super(name, age, weapons, health);
    }
}
