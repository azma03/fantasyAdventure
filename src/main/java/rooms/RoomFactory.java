package rooms;

import behaviours.IStrategy;
import enums.Treasure;
import misc.Enemy;

import java.util.Random;

public class RoomFactory {

    public IStrategy getStrategy(){
        String requested = this.roomGenerator();
        if (requested.equalsIgnoreCase("Treasure")) {
            return new TreasureRoom("Great Hall", Treasure.PANINI86FOOTBALLSTICKER );
        }else if (requested.equalsIgnoreCase("Enemy")){
            return new EnemyRoom("Dungeon", new Enemy("Troll", 50, 10) );
        }
        return null;
    }

    public String roomGenerator(){
        int myNumber = new Random().nextInt(1);
        if(myNumber == 0){
            return "Treasure";
        }
        else return "Enemy";
    }
}
