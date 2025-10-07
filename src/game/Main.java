package game;

import game.player.Hero;

public class Main {
    public static void main(String[] args) {
        Combat combat = new Combat(null,null);
        combat.creationHero();
        Hero hero = combat.getHero();
        combat.creationEnnemie();
        Ennemie ennemie = combat.getEnnemie();
        combat.combat(hero,ennemie);
    }
}
