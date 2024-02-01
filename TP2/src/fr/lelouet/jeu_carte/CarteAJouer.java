package fr.lelouet.jeu_carte;

import java.security.PublicKey;

public class CarteAJouer {
    private String couleur = "";
    private String valeur = "";
    private static String[] couleurs_valides = {"TREFLE", "PIQUE", "CARREAU", "COEUR"};
    private static String[] valeurs_valides = {"AS", "ROI", "DAME", "VALET", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    public static String[] getCouleurs_valides() {
        return couleurs_valides;
    }

    public static String[] getValeurs_valides() {
        return valeurs_valides;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        if(isColorValide(couleur)){
            this.couleur = couleur;
        } else {
            throw new IllegalArgumentException("Couleur invalide " + couleur);
        }
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        if (isValeurValide(valeur)){
            this.valeur = valeur;
        } else {
            throw new IllegalArgumentException("Valeur invalide " + valeur);
        }
    }

    public String toString(){
        System.out.println(valeur + " - " + couleur);
        return null;
    }

    private boolean isColorValide(String couleur){
        boolean found = false;
        for (String color : couleurs_valides){
            if (couleur.equals(color)){
                found = true;
            }
        }
        return found;
    }
    private boolean isValeurValide(String valeur){
        boolean found = false;
        for (String value: valeurs_valides){
            if (valeur.equals(value)){
                found = true;
            }
        }
        return found;
    }

    public CarteAJouer(String couleur, String valeur){
        setCouleur(couleur);
        setValeur(valeur);
    }

    protected CarteAJouer(){

    }

}
