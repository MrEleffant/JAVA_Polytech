package fr.lelouet.zoo;

public class Humain extends Mammifere{

    public String toString(){
        return super.toString() + " Je suis un humain.";
    }

    public Humain(String nom, Sexe sex){
        super(nom, sex);
        setNbMammelles(2);
    }

    public Humain(String nom){
        this(nom, Sexe.NEUTRE);
    }

}
