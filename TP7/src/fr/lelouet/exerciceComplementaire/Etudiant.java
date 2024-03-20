package fr.lelouet.exerciceComplementaire;

import java.util.HashMap;

public class Etudiant {
    private String nom;
    private HashMap<Matiere, ListeDeNotes> notes = new HashMap<Matiere, ListeDeNotes>();


    private float moyGeneral;

    public void addNote(Matiere mat, float note) {
        // notes.putIfAbsent(mat, new ListeDeNotes()); // même chose
        if (!notes.containsKey(mat)){
            notes.put(mat, new ListeDeNotes());
        }
        notes.get(mat).add(note);
    }

    public float getMoyenne(Matiere mat){
        return (float)notes.get(mat).moyenne();
    }

    public String getMoyennes(){
        StringBuffer moy = new StringBuffer();

        notes.forEach((m, n) -> {
            moy.append(m.getNom());
            moy.append(" - Coeff ");
            moy.append(m.getCoeff());
            moy.append(" - Moyenne ");
            moy.append(notes.get(m).moyenne());
            moy.append("\n");
        });
        return moy.toString();
    }

    public Float getMoyenneGeneral(){
        StringBuffer moy = new StringBuffer();

        var moyenne = new Object() {
            Float somme = 0F;
            int sommeCoeffs = 0;
        };

        notes.forEach((mat, notes) -> {
            moyenne.somme += (float)notes.moyenne() * (float)mat.getCoeff();
            moyenne.sommeCoeffs += mat.getCoeff();
        });
        return moyenne.somme / moyenne.sommeCoeffs;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString(){
        return getNom() + " - " + notes  + "\n"  + getMoyennes();
    }

    public Etudiant(String nom){
        setNom(nom);
    }
}
