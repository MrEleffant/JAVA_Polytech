package fr.lelouet.revision;

import java.util.HashMap;
import java.util.HashSet;

public class Collection extends HashMap<Support, HashSet<Jeu>> {

    public void addJeu(Support support, Jeu jeu){
        if (!this.containsKey(support)){
            this.put(support, new HashSet<Jeu>());
        }
        get(support).add(jeu);
    }


    public String toString(){
        StringBuilder cache = new StringBuilder();

        this.forEach((sup, jeux) -> {
            cache.append("\nPour la console : " + sup);
            jeux.forEach((jeu)-> {
                cache.append("\n"+jeu);
            });
        });

        return cache.toString();
    }

}
