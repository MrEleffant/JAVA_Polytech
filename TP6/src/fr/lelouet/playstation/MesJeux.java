package fr.lelouet.playstation;
import java.util.HashSet;

public class MesJeux {
    private HashSet<JeuPS4> collec = new HashSet<JeuPS4>();

    public void addJeu(JeuPS4 jeu){
        collec.add(jeu);
    }

    public void addJeu(String titre, int pegi){
        addJeu(new JeuPS4(titre, pegi));
    }

    public String toString(){
        return collec.toString();
    }

    public boolean removeJeu(JeuPS4 jeu){
        if (collec.contains(jeu)){
            collec.remove(jeu);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeJeu(String titre){
        if (collec.removeIf(jeu -> titre.equals(jeu.getTitre()))) {
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return collec.size();
    }

    public MesJeux(){

    }
}
