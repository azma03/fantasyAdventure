package enums;

public enum Treasure {

    APPLE(10),
    GOLD(50),
    DIAMOND(100),
    DRAGONGLASS(200),
    PANINI86FOOTBALLSTICKER(1000);

    private final int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
