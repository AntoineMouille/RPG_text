package game;

import game.player.Hero;
import game.player.Inventaire;
import game.player.TYPE_CLASSE;

import java.util.Random;
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

        do {
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
                default:
                    System.out.println("choisissez un nombre valide");
                    break;
            }
        }while(classe == null);

        Inventaire inventaire = new Inventaire();
        Hero hero = new Hero(nom, classe, 15, 10, 10, 10, 10,inventaire);
        setHero(hero);
    }

    public void creationEnnemie() {
        Ennemie ennemie = new Ennemie("goblin",10,5,5,2,1);
        setEnneme(ennemie);
    }

    public void combat(Hero personnage, Ennemie ennemie) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        System.out.println(personnage.getName()+"[" + personnage.getHealth() + "]                   "+ennemie.getName()+"[" + ennemie.getHealth() + "]");
        System.out.printf("\n\n\n1 : attaquer \n2 : soin\nchoisissez votre action(1,2) : ");
        choix = scanner.nextInt();
        switch (choix) {
                    case 1:
                        ennemie.setHealth(ennemie.getHealth() - 2);
                        break;
                    case 2:
                        personnage.setHealth(personnage.getHealth() + 1);
                        break;
                    default:
                        System.out.println("vous ne faite rien");
        }
        Random random = new Random();
        int choixIA = random.nextInt(1,4);
        switch(choixIA) {
            case 1 : ennemie.setHealth(ennemie.getHealth()+2);
            System.out.println("l'ennemeie se soigne");
            break;
            case 2 : personnage.setHealth(personnage.getHealth()-1);
            System.out.println("l'ennemeie fait 1 de degats");
            break;
            default: System.out.println("ne fait rien");break;
        }

        if(ennemie.getHealth()<=0 && personnage.getHealth()<=0) {
            System.out.println("egalite");
            System.out.println("voulez vous reesayer");
            System.out.printf("\n1: oui\n2: non\n");
            int reset = scanner.nextInt();
            if(reset==1) {
                personnage.setHealth(15);
                ennemie.setHealth(10);
                combat(personnage, ennemie);
            }
        }else if(personnage.getHealth()<=0){
            System.out.println(ennemie.getName()+" a gagné");
            System.out.println("");
            System.out.println("voulez vous reesayer");
            System.out.printf("\n1: oui\n2: non\n");
            int reset = scanner.nextInt();
            if(reset==1) {
                personnage.setHealth(15);
                ennemie.setHealth(10);
                combat(personnage, ennemie);
            }
        }else if( ennemie.getHealth()<=0 ){
            System.out.println(personnage.getName()+" a gagné");
            System.out.println("voulez vous reesayer");
            System.out.printf("\n1: oui\n2: non\n");
                int reset = scanner.nextInt();
                if(reset==1) {
                    personnage.setHealth(15);
                    ennemie.setHealth(10);
                    combat(personnage, ennemie);
                }
        }else {
            combat(personnage, ennemie);
        }
        scanner.close();


    }


}
