package fr.lelouet.cc2;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StockDeThe extends HashMap<The, Integer> {

    // Ajoute une certaine quantité de stock à un thé
    public void ajouter(The the, int nbGrammes){
        if(nbGrammes<=0){
            throw new IllegalArgumentException("Nombre de grammes négatif");
        }

        if(containsKey(the)){
            put(the, get(the)+nbGrammes);
        } else {
            put(the, nbGrammes);
        }
    }

    // Vérifie si un thé est dans le stock
    public boolean contientThe(The the){
        return containsKey(the);
    }

    // Permet de retirer une quantité de thé à un the
    public void sortir(The the, int nbGrammes){
        if(nbGrammes<=0){
            throw new IllegalArgumentException("Nombre de grammes négatif");
        }
        if(containsKey(the)){
            if(get(the)-nbGrammes >= 0){
                put(the, get(the)-nbGrammes);
            } else {
                throw new IllegalArgumentException("La quantité de stock est insuffisante pour y retirer " + nbGrammes +"g");
            }
        } else {
            throw new IllegalArgumentException("Le The fourni est inconnu");
        }
    }

    // Retourne une liste de the faisant partie de la catégorie voulue
    public List<Entry<The, Integer>> thesDeCategorie(The.types cat){
        return this.entrySet().stream().filter(e-> e.getKey().getCategorie().equals(cat)).collect(Collectors.toList());
    }

    // reourne le nombre de thé ayant une note suppérieure ou égale
    public int quantiteDeThesDontLaNoteEstSupOuEgaleA(double seuilNote){
        // la quantite de the retourné est le nombre de the a proprement parlé et non la quantité en stock
        return this.entrySet().stream().filter(e -> e.getKey().getNoteUtilisateur()>=seuilNote).toList().size();
    }

    // on utilisera le méthode suivante pour connaitre la quantité stock
    public int quantiteStockDeThesDontLaNoteEstSupOuEgaleA(double seuilNote){
        AtomicInteger qty = new AtomicInteger();
        this.entrySet().stream().filter(e -> e.getKey().getNoteUtilisateur()>=seuilNote).forEach((q)-> {
            qty.getAndAdd(q.getValue());
        });
        return qty.get();
    }




}
