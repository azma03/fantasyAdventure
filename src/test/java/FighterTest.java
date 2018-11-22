import enums.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Fighter;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;

    @Before
    public void setUp() throws Exception {
        fighter = new Fighter("Brian", 10, Weapon.SWORD);
    }

    @Test
    public void canGerName() {
        assertEquals("Brian", fighter.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(10, fighter.getHealthValue());
    }

    @Test
    public void canGetWeaponAttachValue() {
        assertEquals(2, fighter.getWeapon().getAttackValue());
    }

    @Test
    public void canSetName() {
        fighter.setName("Stephen");
        assertEquals("Stephen", fighter.getName());
    }

    @Test
    public void canSetWeapon() {
        fighter.setWeapon(Weapon.AXE);
        assertEquals(3, fighter.getWeapon().getAttackValue());
    }

    @Test
    public void canSetHealthValue() {
        fighter.setHealthValue(6);
        assertEquals(6, fighter.getHealthValue());
    }

    @Test
    public void canAttack() {
        Fighter fighter2 = new Fighter("Stephen", 10, Weapon.CLUB);
        fighter2.attack(fighter);
        assertEquals(6, fighter.getHealthValue());
        assertEquals(10, fighter2.getHealthValue());

    }
}
