package enums;

public enum Spell {

    FIREBALL (2),
    LIGHTNING (3),
    TORNADO (4);

    private final int attackValue;

    Spell(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
