import fr.lelouet.TP7.*;
import fr.lelouet.exerciceComplementaire.*;

public class Main {

    public static void main(String[] args) {
        Promo p1 = new Promo(2024);

        p1.addMatiere("math", 12);

        System.out.println(p1.getMatiere("math"));


        p1.etudiants.add(new Etudiant("Tom"));
        p1.addNote("Tom", "math", 3F);
        System.out.println(p1.getEtudiant("Tom"));

        /*p1.addMatiere("physique", 8);


        p1.addEtudiant("Thomas");

        p1.addNote(p1.getEtudiant("Tom"), p1.getMatiere("math"), 10F);
        p1.addNote(p1.getEtudiant("Tom"), p1.getMatiere("math"), 11F);
        p1.addNote(p1.getEtudiant("Tom"), p1.getMatiere("physique"), 6F);
        p1.addNote(p1.getEtudiant("Tom"), p1.getMatiere("physique"), 14F);

        p1.addNote("Thomas", "math", 3F);
        p1.addNote("Thomas", "math", 10F);
        p1.addNote("Thomas", "physique", 12F);
        p1.addNote("Thomas", "physique", 1F);
        p1.addNote("Thomas", "physique", 1F);
        p1.addNote("Thomas", "physique", 1F);

        System.out.println("Moyennes " + p1.getEtudiant("Thomas"));

        System.out.println("p1.getMoyenneGeneral()");
        System.out.println(p1.getMoyenneGeneral());
        System.out.println("p1.getMoyenneMatiers()");
        System.out.println(p1.getMoyenneMatiers());

        System.out.println("p1.getBWNotes()");
        System.out.println(p1.getBWNotes());*/


        /*
        Joueur j1 = new Joueur();
        j1.setNom("Tibo");
        j1.setPrenom("Le LLT");

        Equipe E1 = new Equipe();
        E1.add(j1);
        E1.toString();
         */
    }
}