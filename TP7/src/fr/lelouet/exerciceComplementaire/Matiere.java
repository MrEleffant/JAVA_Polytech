package fr.lelouet.exerciceComplementaire;

public class Matiere {
    private String nom;
    private int coeff;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }


    /*public String toString(){
        return nom + " - " + coeff;
    }*/

    public Matiere(String nom, int coeff){
        setNom(nom);
        setCoeff(coeff);
    }
}
