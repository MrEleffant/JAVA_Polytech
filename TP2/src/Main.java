import fr.lelouet.jeu_carte.CarteAJouer;
import fr.lelouet.jeu_carte.Jeu;

public class Main {
    public static void main(String[] args) {
        Jeu deck = new Jeu();
        deck.toString();

        CarteAJouer carteCherche = deck.getCarte("ROI", "TREFLE");
        carteCherche.toString();


        CarteAJouer carteLookingFor  = new CarteAJouer("TREFLE", "AS");
        carteLookingFor  = deck.getCarte(carteLookingFor);
        carteLookingFor.toString();
    }
}