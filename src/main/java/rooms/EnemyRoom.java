package rooms;

import behaviours.IAttack;
import behaviours.IDamage;
import behaviours.IStrategy;
import misc.Enemy;
import players.Player;

public class EnemyRoom implements IStrategy {

    private String name;
    private Enemy enemy;

    public EnemyRoom(String name, Enemy enemy) {
        this.name = name;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void interact(IAttack iAttack){
        Player player = (Player) iAttack;
        while (player.getHealthValue() > 0 && this.enemy.getHealthValue() > 0){
            iAttack.attack(this.enemy);

            if(this.enemy.getHealthValue() > 0){
                this.enemy.attack((IDamage) iAttack);
            }
        }


    }
}
