package fr.lelouet.zoo;
public class Animal {
    public static int compteur = 0;
    private String nom;

    public enum Sexe {MASCULIN,FEMININ,NEUTRE,INDETERMINE;}
    private Sexe sex;

    public Sexe getSex() {
        return sex;
    }

    public void setSex(Sexe sex) {
        this.sex = sex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return "Je suis un animal de nom " + getNom() + ". Et de sex " + getSex()+".";
    }

    public Animal(String nom, Sexe sex){
        compteur++;
        setNom(nom);
        setSex(sex);
    }

    public Animal(String nom){
        this(nom, Sexe.NEUTRE);
    }
}
