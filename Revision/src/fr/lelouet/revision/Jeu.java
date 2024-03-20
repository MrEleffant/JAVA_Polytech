package fr.lelouet.revision;

import java.util.ArrayList;

public class Jeu {
    private String nom;
    private int pegi;
    private int nbrHeure;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public int getNbrHeure() {
        return nbrHeure;
    }

    public void setNbrHeure(int nbrHeure) {
        this.nbrHeure = nbrHeure;
    }

    public String toString(){
        return getNom()  + " pegi " + getPegi() + " " + getNbrHeure() + "h";
    }


    public Jeu(String nom, int pegi, int nbrHeure){
        setNom(nom);
        setPegi(pegi);
        setNbrHeure(nbrHeure);
    }

    public Jeu(){
        this("Minecraft", 0, 0);
    }


}
