package game.player;

import game.Character;

public class Hero extends Character {
    private int level;
    private Classe classe;
    private Inventaire inventaire;
    public TYPE_CLASSE typeClasse;
    public final static int LEVEL_MAX=10;



    public Hero(String name,TYPE_CLASSE typeClasse, int health, int mana, int stamina, int attak, int defense, Inventaire inventaire ) {
        super(name, TYPE.HERO, health, mana, stamina, attak, defense);
        this.level = 1;
        this.typeClasse = typeClasse;
        this.classe = new Classe(this.typeClasse);
        this.inventaire = inventaire;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }


    public void levelUp(){
        if (this.level<LEVEL_MAX)this.level++;
        else System.out.println("niveau max ateint");
    }

    public Classe getClasse() {
        return classe;
    }

    public boolean estVivant(){
        if(health<=0) return false;
        else return true;
    }

    public String getName(){
        return this.name;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }


}
