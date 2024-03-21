package fr.lelouet.cc2;

public class The {
    private String nom;
    public enum types {blanc, noir, vert, oolong, aromatise};
    private types categorie;
    private String PaysOrigine;
    private int tempInfusion;
    private float noteUtilisateur;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom == null || nom == ""){
            throw  new IllegalArgumentException("nom ne doit pas être null");
        }
        this.nom = nom;
    }

    public types getCategorie() {
        return categorie;
    }

    public void setCategorie(types categorie) {
        this.categorie = categorie;
    }

    public String getPaysOrigine() {
        return PaysOrigine;
    }

    public void setPaysOrigine(String paysOrigine) {
        PaysOrigine = paysOrigine;
    }

    public int getTempInfusion() {
        return tempInfusion;
    }

    public void setTempInfusion(int tempInfusion) {
        if(tempInfusion > 15){
            this.tempInfusion = tempInfusion;
        } else {
            throw new IllegalArgumentException("La temperature voulue n'est pas suppérieur à 15°c");
        }
    }

    public float getNoteUtilisateur() {
        return noteUtilisateur;
    }

    public void setNoteUtilisateur(float noteUtilisateur) {
        if(noteUtilisateur > 0.0 && noteUtilisateur <= 10.0){
            this.noteUtilisateur = noteUtilisateur;
        } else {
            throw new IllegalArgumentException("La note données n'est pas comprise entre 0 et 10");
        }
    }

    public String toString(){
        String cache = "\n" + getNom() + " - " + getCategorie() +
                "\nOrigine : " + getPaysOrigine() +
                "\nTemperature d'inffusion : " + getTempInfusion() +
                "\nNote Utilisateur : " + getTempInfusion();
        return cache;
    }

    public The(String nom, types cate, String paysOrigine, int tempInfusion, float noteUtilisateur) {
        setNom(nom);
        setCategorie(cate);
        setPaysOrigine(paysOrigine);
        setTempInfusion(tempInfusion);
        setNoteUtilisateur(noteUtilisateur);
    }

}
