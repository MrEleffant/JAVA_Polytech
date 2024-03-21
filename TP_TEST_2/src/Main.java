import fr.lelouet.cc2.*;

public class Main {
    public static void main(String[] args) {
        // Création de deux thés
        The Gyokuro = new The("Gyokuro", The.types.vert, "Japon", 78, 9.5F);
        The Carrefour = new The("Carrefour", The.types.noir, "France", 100, 2F);

        // Création du stock
        StockDeThe Stock = new StockDeThe();

        // Ajout des thés au stock
        Stock.ajouter(Gyokuro, 10);
        Stock.ajouter(Carrefour, 1000);

        //System.out.println(Stock.toString());

        // Soustraire une qty à un thé
        Stock.sortir(Gyokuro, 1);
        //System.out.println(Stock.toString());

        // Visualiser le nombre de thé dans une catégorie
        // System.out.println(Stock.thesDeCategorie(The.types.noir).toString());

        // Visualiser le nombre de thés ayant une note sup ou égale
        // System.out.println(Stock.quantiteDeThesDontLaNoteEstSupOuEgaleA(3));

        // Visualiser la quantité Stock de thés ayant une note sup ou égale
        // System.out.println(Stock.quantiteStockDeThesDontLaNoteEstSupOuEgaleA(3));

        // Question 4
        StockDeThe Stock2 = new StockDeThe();
        The t1 = new The("thé 1", The.types.vert, "Chine",80,8);
        The t2 = new The("thé 2", The.types.noir, "Inde",95,6.5F);
        Stock2.ajouter(t1, 50);
        Stock2.ajouter(t2, 60);
        System.out.println(Stock2);
        Stock2.sortir(t1, 20);
        System.out.println(Stock2);


    }
}