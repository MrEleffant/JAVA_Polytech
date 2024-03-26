import fr.lelouet.Heure;

public class Main {
    public static void main(String[] args) {
        try {
            Heure petiteHeure = new Heure((byte)1, (byte)30);
            System.out.println(petiteHeure.toString());


            Heure heureDefault = new Heure();
            System.out.println(heureDefault.toString());
            heureDefault.avancerMinutes(3);
            System.out.println(heureDefault.toString());

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}