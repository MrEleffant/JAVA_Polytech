package fr.lelouet.NoteDeFrais;
public class Personne  {
    private String nom;
    private String prenom;
    public Date dateDeNaissance;

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


    public String toString(){
        return getNom() + " - " + getPrenom() + "\nDate de naissance " + dateDeNaissance.toString();
    }


    public Personne(String nom, String prenom){
        setNom(nom);
        setPrenom(prenom);
        dateDeNaissance = new Date();
    }



    public Personne(){
        setNom("");
        setPrenom("");
        dateDeNaissance = new Date();
    }


}
