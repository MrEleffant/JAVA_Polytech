package fr.lelouet.exerciceComplementaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Promo {
    private int annee;
    public ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    public HashMap<String, Matiere> matieres = new HashMap();


    public Matiere getMatiere(String matiere){
        return matieres.get(matiere);
    }
    public Etudiant getEtudiant(String etu){
        return etudiants.stream().filter(e -> e.getNom().equals(etu)).findFirst().get();
    }

    public void addNote(Etudiant etu, Matiere mat, float note){
        etu.addNote(mat, note);
    }

    public void addNote(String etu, String mat, float note){
        addNote(getEtudiant(etu), getMatiere(mat), note);

    }

    public void addMatiere(String nom, int coeff){
        matieres.put(nom, new Matiere(nom, coeff));
    }
    public void addEtudiant(String nom){
        etudiants.add(new Etudiant(nom));
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String toString(){
        return "Promo " + annee + "\n"+etudiants.toString() + "\n" + matieres;
    }

    public Promo(int annee){
        setAnnee(annee);
    }
}
