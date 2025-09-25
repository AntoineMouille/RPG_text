public class Hero extends Character {
    private int level;
    private Classe classe;
    public TYPE_CLASSE typeClasse;

    public Hero(String name,TYPE_CLASSE typeClasse,int level, int health, int mana, int stamina, int attak, int defense ) {
        super(name, TYPE.HERO, health, mana, stamina, attak, defense);
        this.level = level;
        this.typeClasse = typeClasse;
        this.classe = new Classe(this.typeClasse);
    }
}
