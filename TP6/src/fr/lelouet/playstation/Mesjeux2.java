package fr.lelouet.playstation;

import java.util.HashSet;

public class Mesjeux2 extends HashSet<JeuPS4> {

    public boolean remove(String titre){
        if (removeIf(jeu -> titre.equals(jeu.getTitre()))) {
            return true;
        } else {
            return false;
        }
    }

    public JeuPS4 getJeu(String name){
        return stream().filter(e -> e.getTitre().equals(name)).findFirst().get();
    }

    /*
    public boolean add(JeuPS4 jeu){
        if (stream().noneMatch(e -> jeu.equals(e))){
            super.add(jeu);
            return true;
        } else {
            return false;
        }
    }*/

    public boolean add(String jeu , int pegi) {
        return add(new JeuPS4(jeu, pegi));
    }

}
