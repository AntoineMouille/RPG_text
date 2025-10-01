package player;

import player.item.Item;

public class Inventaire {
    private Hero hero;
    public final static int MAX_ITEM=20;
    private Item[] items;

    public Inventaire(Hero hero){
        this.hero = hero;
        this.items = new Item[MAX_ITEM];
    }

    public Hero getHero() {
        return hero;
    }
    public Item[] getItems() {
        return items;
    }

    public void addItem(String item){
        for (int i=0;i<MAX_ITEM;i++){
            if (this.items[i]==null){
                this.items[i]=rechercheItem(item);
                System.out.println("item ajouter");
                return;
            }
        }
        System.out.println("inventaire plein");
    }

    public void removeItem(String item){
        for (int i=0;i<MAX_ITEM;i++){
            if (this.items[i]==rechercheItem(item)){
                this.items[i]=null;
                System.out.println("item supprimer");
                return;
            }
        }
        System.out.println("item non trouver");
    }

    public Item rechercheItem(String itemName){
        for (int i=0;i<MAX_ITEM;i++){
            if (this.items[i]!=null && this.items[i].toString().equals(itemName)){
                System.out.println("item trouver");
                return this.items[i];
            }
        }
        System.out.println("item non trouver");
        return null;
    }


}
