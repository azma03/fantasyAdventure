package rooms;

import behaviours.IAttack;
import behaviours.IStrategy;
import enums.Treasure;
import players.Player;

public class TreasureRoom implements IStrategy {

    private String name;
    private Treasure treasure;

    public TreasureRoom(String name, Treasure treasure) {
        this.name = name;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public Treasure getTreasure() {
        return treasure;
    }

//    public void interact(Player player){
//        player.addScore(this.treasure);
//    }

    public void interact(IAttack iAttack) {
        Player player = (Player) iAttack;
        player.addScore(this.treasure);
    }
}
