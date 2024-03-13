package fr.lelouet.zoo;

public class Vache extends Mammifere {

    public String toString(){
        return super.toString() + " Je suis une vache.";
    }

    public Vache(String nom, Sexe sex){
        super(nom, sex);
        if (sex == Sexe.FEMININ){
            setNbMammelles(4);
        } else {
            setNbMammelles(2);
        }
    }
    public Vache(String nom){
        this(nom, Sexe.NEUTRE);
    }
}
