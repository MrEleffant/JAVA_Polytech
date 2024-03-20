package fr.lelouet.zoo;

public class Mammifere extends Animal{
    private int nbMammelles;

    public int getNbMammelles() {
        return nbMammelles;
    }

    protected void setNbMammelles(int nbMammelles) {
        this.nbMammelles = nbMammelles;
    }

    public String toString(){
        return super.toString() + " Je suis un mamifère.";
    }

    public Mammifere(String nom, Sexe sex) {
        super(nom, sex);
    }
    public Mammifere(String nom){
        this(nom, Sexe.NEUTRE);
    }
}
