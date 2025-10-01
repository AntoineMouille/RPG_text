package player;

public class Hero extends Character {
    private int level;
    private Classe classe;
    private Inventaire inventaire;
    public TYPE_CLASSE typeClasse;
    public final static int LEVEL_MAX=10;


    public Hero(String name,TYPE_CLASSE typeClasse, int health, int mana, int stamina, int attak, int defense ) {
        super(name,TYPE.HERO, health, mana, stamina, attak, defense);
        this.level = 1;
        this.typeClasse = typeClasse;
        this.classe = new Classe(this.typeClasse);
    }


    public int getLevel() {
        return level;
    }

    public void levelUp(){
        if (this.level<LEVEL_MAX)this.level++;
        else System.out.println("niveua max ateint");
    }

    public Classe getClasse() {
        return classe;
    }





}
