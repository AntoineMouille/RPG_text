package game;

import game.player.TYPE;

public abstract class Character {
    public int health,mana,stamina,attak,defense;
    public String name;
    public TYPE type;
    public Character(String name, TYPE type, int health, int mana, int stamina, int attak, int defense){
        this.name = name;
        this.type = type;
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.attak = attak;
        this.defense = defense;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttaque() {
        return this.attak;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttaque(int attaque) {
        this.attak = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

}
