package fr.lelouet.jeu_carte;
import java.util.Random;

public class Jeu {
    private int deckSize = 52;
    private CarteAJouer[] deck = new CarteAJouer[deckSize];

    public String toString() {
        for (CarteAJouer carte : deck){
            carte.toString();
        }
        return null;
    }

    public CarteAJouer getCarte(String valeur, String couleur) {
        CarteAJouer carteFound = new CarteAJouer();
        for(CarteAJouer carte : deck ) {
            if(valeur.equals(carte.getValeur()) && couleur.equals(carte.getCouleur())){
                System.out.println("Card found @" + Integer.toHexString(hashCode()));
                carteFound =  carte;
                break;
            }
        }

        return carteFound;
    }

    public CarteAJouer getCarte(CarteAJouer carteCherche) {
        CarteAJouer carteFound = new CarteAJouer();
        for(CarteAJouer carte : deck ) {
            if(carteCherche.getValeur().equals(carte.getValeur()) && carteCherche.getCouleur().equals(carte.getCouleur())){
                System.out.println("Card found @" + Integer.toHexString(hashCode()));
                carteFound =  carte;
                break;
            }
        }

        return carteFound;
    }

    public void shuffle(){
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            // Swap deck[i] and deck[j]
            CarteAJouer temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Jeu() {
        int index = 0;
        for (String couleur : CarteAJouer.getCouleurs_valides()) {
            for (String valeur : CarteAJouer.getValeurs_valides()) {
                deck[index++] = new CarteAJouer(valeur, couleur);
            }
        }
    }
}
