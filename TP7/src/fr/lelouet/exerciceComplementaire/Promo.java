package fr.lelouet.exerciceComplementaire;

import java.util.ArrayList;
import java.util.HashMap;

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

    public float getMoyenneGeneral() {
        var moy = new Object() {
            float general = 0;
        };
        etudiants.forEach((etu) -> {
            moy.general += etu.getMoyenneGeneral();
        });

        return moy.general /etudiants.size();
    }


    public HashMap<Matiere, ArrayList<Float>> getAllNotes(){
        HashMap<Matiere, ArrayList<Float>> moyennes = new HashMap<Matiere, ArrayList<Float>>();
        etudiants.forEach((etu) -> {
            matieres.forEach((titre, mat) -> {
                if(!moyennes.containsKey(mat)){
                    moyennes.put(mat, new ArrayList<Float>());
                }
                moyennes.get(mat).add(etu.getMoyenne(mat));
            });

        });
        return moyennes;
    }


    public String getBWNotes() {
        StringBuffer output = new StringBuffer();
        HashMap<Matiere, ArrayList<Float>> allNotes = getAllNotes();
        output.append(allNotes);
        /*allNotes.forEach((mat, notes) -> {
            output.append(notes);
            output.append("\n"+mat.getNom() + " - min " + notes.stream().min(Float::compare));
            output.append("\n"+mat.getNom() + " - max " + notes.stream().max(Float::compare));
        });*/
        return output.toString();
    }


    public HashMap<Matiere, Float> getMoyenneMatiers() {
        HashMap<Matiere, Float> moyenne = new HashMap<Matiere, Float>();
        HashMap<Matiere, ArrayList<Float>> notes = getAllNotes();

        etudiants.forEach((etu) -> {
            matieres.forEach((titre, mat) -> {
                if(!notes.containsKey(mat)){
                    notes.put(mat, new ArrayList<Float>());
                }
                notes.get(mat).add(etu.getMoyenne(mat));
            });

        });

        notes.forEach((mat, note) -> {
            moyenne.put(mat, (float)note.stream().mapToDouble(Float::doubleValue).average().orElse(0F));
        });

        return moyenne;
    }




    public Promo(int annee){
        setAnnee(annee);
    }
}
