package fr.lelouet.UT2;

public class CarteJouer {
    private String couleur = "";
    private String valeur = "";
    private static final String[] COULEURS_VALIDES = {"TREFLE", "PIQUE", "CARREAU", "COEUR"};
    private static final String[] VALEURS_VALIDES = {"AS", "ROI", "DAME", "VALET", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    public static String[] getCouleursValides() {
        return COULEURS_VALIDES;
    }

    public static String[] getValeursValides() {
        return VALEURS_VALIDES;
    }

    public String getCouleur() {
        return couleur;
    }

    private void setCouleur(String couleur) {
        if(isColorValide(couleur)){
            this.couleur = couleur.toUpperCase();
        } else {
            throw new IllegalArgumentException("Couleur invalide " + couleur);
        }
    }

    public String getValeur() {
        return valeur;
    }

    private void setValeur(String valeur) {
        if (isValeurValide(valeur)){
            this.valeur = valeur.toUpperCase();
        } else {
            throw new IllegalArgumentException("Valeur invalide " + valeur);
        }
    }

    public String toString(){
        return valeur + " - " + couleur;
    }

    private static boolean isColorValide(String couleur){
        if(couleur == null) return false;
        boolean found = false;
        for (String color : COULEURS_VALIDES){
            if (couleur.equals(color)){
                found = true;
                break;
            }
        }
        return found;
    }
    private static boolean isValeurValide(String valeur){
        if(valeur == null) return false;
        boolean found = false;
        for (String value: VALEURS_VALIDES){
            if (valeur.equals(value)){
                found = true;
                break;
            }
        }
        return found;
    }

    public CarteJouer(String valeur, String couleur){
        setCouleur(couleur);
        setValeur(valeur);
    }

}

