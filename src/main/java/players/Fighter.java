package players;

import behaviours.IAttack;
import behaviours.IDamage;
import enums.Weapon;

public class Fighter extends Player implements IAttack, IDamage{

    private Weapon weapon;

    public Fighter(String name, int healthValue, Weapon weapon) {
        super(name, healthValue);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack(IDamage idamage) {
        return idamage.takeDamage(this.weapon.getAttackValue());
    }

    public int takeDamage(int damage) {
        return this.updateHealthValue(damage);
    }


}
