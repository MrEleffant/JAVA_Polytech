import fr.lelouet.zoo.*;

public class Main {
    public static void main(String[] args) {
        Animal Vache = new Animal("Vache");
        Humain H1 = new Humain("Thibaut", Animal.Sexe.MASCULIN);
        System.out.println(H1.getNbMammelles());

        Vache V1 = new Vache("Margueritte", Animal.Sexe.FEMININ);
        System.out.println(V1.getNbMammelles());

        Animal[] animaux = new Animal[5];
        animaux[0] = new Animal("Toto", Animal.Sexe.FEMININ);
        animaux[1] = new Mammifere("Titi", Animal.Sexe.NEUTRE);
        animaux[2] = new Humain("Tata", Animal.Sexe.MASCULIN);
        animaux[3] = new Vache("Tutu", Animal.Sexe.INDETERMINE);
        animaux[4] = new Vache("Tptp", Animal.Sexe.MASCULIN);

        for(Animal animal : animaux){
            System.out.println(animal);
        }
    }
}