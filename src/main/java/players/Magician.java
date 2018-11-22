package players;

import behaviours.IAttack;
import behaviours.IDamage;
import enums.Spell;

public class Magician extends Player implements IAttack, IDamage {

    private Spell spell;


    public Magician(String name, int healthValue, Spell spell) {
        super(name, healthValue);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public int attack(IDamage idamage) {
        return idamage.takeDamage(this.spell.getAttackValue());
    }

    public int takeDamage(int damage) {
        return this.updateHealthValue(damage);
    }
}
