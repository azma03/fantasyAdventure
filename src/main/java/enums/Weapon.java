package enums;

public enum Weapon {

    SWORD (2),
    AXE (3),
    CLUB (4);

    private final int attackValue;

    Weapon(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
