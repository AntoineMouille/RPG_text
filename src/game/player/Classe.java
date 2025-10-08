package game.player;

public class Classe {
    private TYPE_CLASSE type;
    public Classe(TYPE_CLASSE type){
        this.type = type;
    }

    public int statsBaseAttaque(){
        int attaque = 0;
        if (this.type== TYPE_CLASSE.GUERRIER){
                attaque = 15;
        }else if(this.type==TYPE_CLASSE.MAGE){
                 attaque= 10;
        }else if(this.type==TYPE_CLASSE.ARCHER){
            attaque = 20;
        }
        return attaque;
    }

    public int statsBaseMana(){
        int mana = 0;
        if (this.type== TYPE_CLASSE.GUERRIER){
            mana = 10;
        }else if (this.type==TYPE_CLASSE.MAGE){
            mana = 20;
        }else if (this.type==TYPE_CLASSE.ARCHER){
            mana = 15;
        }
        return mana;
    }

    public int statsBaseDefense(){
        int defense = 0;
        if (this.type== TYPE_CLASSE.GUERRIER){
            defense = 20;
        }else if (this.type==TYPE_CLASSE.MAGE){
            defense = 15;
        }else if (this.type==TYPE_CLASSE.ARCHER){
            defense = 10;
        }
        return defense;
    }

    public int statsbaseStamina(){
        return 15;
    }


}
