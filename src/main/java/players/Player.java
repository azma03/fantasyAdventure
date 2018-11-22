package players;

import behaviours.IAttack;
import behaviours.IDamage;
import enums.Treasure;

public abstract class Player {

    private String name;
    private int healthValue;
    private int score;

    public Player(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int updateHealthValue(int damage){
        return this.healthValue -= damage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(Treasure treasure){
        this.score += treasure.getValue();
    }
}
