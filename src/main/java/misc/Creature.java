package misc;

import behaviours.IAttack;
import behaviours.IDamage;

public class Creature implements IAttack {

    private String name;
    private int attackValue;

    public Creature(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int attack(IDamage idamage) {
        return idamage.takeDamage(this.getAttackValue());
    }

}
