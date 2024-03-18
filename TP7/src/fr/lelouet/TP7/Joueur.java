package fr.lelouet.TP7;

import java.util.Date;

public class Joueur {
    private String nom;
    private String ntel;
    private String email;
    private String nLisence;
    private boolean certifMedic;
    private boolean cotisation;
    private int nbrSeance;
    private String prenom;
    public Date dateDeNaissance;


    public boolean isCertifMedic() {
        return certifMedic;
    }

    public void setCertifMedic(boolean certifMedic) {
        this.certifMedic = certifMedic;
    }

    public boolean isCotisation() {
        return cotisation;
    }

    public void setCotisation(boolean cotisation) {
        this.cotisation = cotisation;
    }

    public int getNbrSeance() {
        return nbrSeance;
    }

    public void setNbrSeance(int nbrSeance) {
        this.nbrSeance = nbrSeance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNtel() {
        return ntel;
    }

    public void setNtel(String ntel) {
        this.ntel = ntel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getnLisence() {
        return nLisence;
    }

    public void setnLisence(String nLisence) {
        this.nLisence = nLisence;
    }

    public String toString(){
        return prenom + " - " + nom;
    }
}
