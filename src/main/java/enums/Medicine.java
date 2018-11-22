package enums;

public enum Medicine {
    POTION (-2),
    HERB (-3),
    INJECTION (-4);

    private final int attackValue;

    Medicine(int attackValue) {
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
