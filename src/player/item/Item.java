package player.item;

public abstract class Item {
    protected String name;
    protected int numberUse;
    protected int price;
    public Item(String name, int numberUse,int price) {
     this.name = name;
     this.numberUse = numberUse;
     this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getNumberUse() {
        return numberUse;
    }

    public abstract boolean isUsed();
    public abstract void use();
    public abstract boolean destroy();
    public abstract void upgrade();

}