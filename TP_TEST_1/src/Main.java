import fr.lelouet.NotesDeFrais.*;

public class Main {
    public static void main(String[] args) {
        FraisDeDeplacement f1 = new FraisDeDeplacement();
        f1.setNom("John");
        f1.setPrenom("Smith");
        f1.setMoyenDeTranspot(FraisDeDeplacement.moyensDeTransport.VoitureElectrique);
        f1.setMontant(125.50);
        f1.setDistance(178);
        f1.setDd(8);
        f1.setMm(2);
        f1.setYyyy(2024);


        FraisDeDeplacement f2 = new FraisDeDeplacement("", "EMMA", FraisDeDeplacement.moyensDeTransport.APied, 0, 8, 12, 12, 2023);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        System.out.println(f1.toStringDollars());
        System.out.println(f2.toStringDollars());

    }
}