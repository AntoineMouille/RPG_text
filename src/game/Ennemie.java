package game;
import player.Character;
import player.TYPE;
import player.item.Item;

public class Ennemie extends Character{
    private Item loot;
    public Ennemie(String name,  int health,int mana, int stamina, int attak, int defense, Item loot) {
        super(name,TYPE.ENNEMIE,health,mana,stamina,attak,defense);
        this.loot = loot;
    }
    public Item getLoot() {
        return loot;
    }

    public void setLoot(Item loot) {
        this.loot = loot;
    }


}
