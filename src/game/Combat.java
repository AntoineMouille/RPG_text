package game;

import game.player.Hero;
import game.player.Inventaire;
import game.player.TYPE_CLASSE;

import java.util.Scanner;

public class Combat {
    private Hero hero;
    private Ennemie ennemie;

    public Combat(Hero hero, Ennemie ennemie) {
        this.hero = hero;
        this.ennemie = ennemie;
    }
    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public Ennemie getEnnemie() {
        return ennemie;
    }
    public void setEnneme(Ennemie ennemie) {
        this.ennemie = ennemie;
    }

    public void creationHero() {
        Hero personnage = getHero();
        Scanner scanner = new Scanner(System.in);
        TYPE_CLASSE classe = null;

        System.out.println("donnez votre nom de hero : ");
        String nom = scanner.nextLine();

        System.out.printf("choisissez votre classe : \n(1) Guerrier \n(2) Mage \n(3) Archer \nvotre classe(choisissez un nombre) : \n");
        int indClasse = scanner.nextInt();
        switch (indClasse) {
            case 1:
                classe = TYPE_CLASSE.GUERRIER;
                break;
            case 2:
                classe = TYPE_CLASSE.MAGE;
                break;
            case 3:
                classe = TYPE_CLASSE.ARCHER;
                break;
        }

        Inventaire inventaire = new Inventaire();
        Hero hero = new Hero(nom, classe, 10, 10, 10, 10, 10,inventaire);
        setHero(hero);
    }

    public void creationEnnemie() {
        Ennemie ennemie = new Ennemie("goblin",3,5,5,2,1);
        setEnneme(ennemie);
    }

    public void combat() {
        creationHero();
        Hero personnage = getHero();
        creationEnnemie();
        Ennemie ennemie = getEnnemie();

        System.out.println("votre nom de personnage : "+personnage.getName());

    }


}
