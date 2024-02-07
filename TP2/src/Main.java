import fr.lelouet.jeu_carte.CarteAJouer;
import fr.lelouet.jeu_carte.Jeu;

public class Main {
    public static void main(String[] args) {
/*
        Jeu deck = new Jeu();
        deck.toString();

        CarteAJouer carteCherche = deck.getCarte("ROI", "TREFLE");
        carteCherche.toString();

        deck.shuffle();
        deck.toString();

        CarteAJouer carteCherche2  = new CarteAJouer("ROI", "TREFLE");
        carteCherche2  = deck.getCarte(carteCherche2);
        carteCherche2.toString();
*/

        for (CarteAJouer.couleurs coul : CarteAJouer.couleurs.values()){
            System.out.println(coul);
        }

        // CarteAJouer test = new CarteAJouer("ROI", "TREFLE");
        // System.out.print(test);
    }
}