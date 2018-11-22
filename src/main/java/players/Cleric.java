package players;

import behaviours.IAttack;
import behaviours.IDamage;
import enums.Medicine;

public class Cleric extends Player implements IAttack, IDamage {

    private Medicine medicine;

    public Cleric(String name, int healthValue, Medicine medicine) {
        super(name, healthValue);
        this.medicine = medicine;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }


    public int attack(IDamage idamage) {
        return idamage.takeDamage(this.medicine.getAttackValue());
    }

    public int takeDamage(int damage) {
        return this.updateHealthValue(damage);
    }
}
