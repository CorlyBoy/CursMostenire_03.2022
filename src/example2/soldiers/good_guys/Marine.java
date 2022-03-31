package example2.soldiers.good_guys;

import example2.soldiers.Soldier;
import example2.weapons.Weapon;

import java.util.ArrayList;

public class Marine extends Soldier {

    public Marine(String name, int age, ArrayList<Weapon> weapons, int health) {
        super(name, age, weapons, health);
    }
}
