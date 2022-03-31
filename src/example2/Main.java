package example2;

import example2.soldiers.bad_guys.Terrorist;
import example2.soldiers.good_guys.Marine;
import example2.weapons.Knife;
import example2.weapons.Pistol;
import example2.weapons.SniperRifle;
import example2.weapons.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SniperRifle sniperRifle = new SniperRifle("Long range Sniper", 200);
        Pistol pistol = new Pistol("Desert Eagle", 50);
        Knife knife = new Knife("Military knife", 20);

        // creati o lista care sa contina cate o arma din fiecare
        ArrayList<Weapon> weaponsList = new ArrayList<>(Arrays.asList(sniperRifle, pistol, knife));

        Marine m1 = new Marine("John", 22, weaponsList, 100);

        Terrorist t1 = new Terrorist("Abdul", 38, weaponsList, 100);

        m1.attack(t1, m1.chooseWeapon());


    }
}
