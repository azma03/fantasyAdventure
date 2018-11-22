package misc;

import behaviours.IAttack;
import behaviours.IDamage;

public class Enemy implements IAttack, IDamage{

    private String name;
    private int healthValue;
    private int attackValue;

    public Enemy(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int attack(IDamage idamage) {
        return idamage.takeDamage(this.getAttackValue());
    }

    public int takeDamage(int damage) {
        return this.healthValue -= damage;
    }


    public int getAttackValue() {
        return attackValue;
    }
}
