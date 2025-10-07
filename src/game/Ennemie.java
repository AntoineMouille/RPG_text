package game;
import game.player.TYPE;
import game.player.item.Item;

public class Ennemie extends Character {
    private Item loot;
    public Ennemie(String name,  int health,int mana, int stamina, int attak, int defense ) {
        super(name, TYPE.ENNEMIE,health,mana,stamina,attak,defense);
        //this.loot = loot;
    }
    public Item getLoot() {
        return loot;
    }

    public void setLoot(Item loot) {
        this.loot = loot;
    }

    public boolean estVivant(){
        if(this.health<=0) return false;
        else return true;
    }

    public String getName(){
        return this.name;
    }



}
