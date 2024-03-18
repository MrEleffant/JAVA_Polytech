package fr.lelouet.exerciceComplementaire;

import java.util.HashMap;

public class Etudiant {
    private String nom;
    private HashMap<Matiere, ListeDeNotes> notes = new HashMap<Matiere, ListeDeNotes>();

    public void addNote(Matiere mat, float note) {
        if (!notes.containsKey(mat)){
            notes.put(mat, new ListeDeNotes());
        }
        notes.get(mat).add(note);
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
