import fr.lelouet.NoteDeFrais.*;

public class Main {
    public static void main(String[] args) {
        Personne Pauline = new Personne("Pauline", "Charbon");
        Date date = new Date();
        FraisDeDeplacement.moyensDeLocomotion  transport = FraisDeDeplacement.moyensDeLocomotion.PIED;

        FraisDeDeplacement f2 = new FraisDeDeplacement(Pauline, date, transport, 0, 0);
        System.out.println(f2.toString());

        FraisDeDeplacement f3 = new FraisDeDeplacement();
        System.out.println(f3.toString());

        f3.profile.setPrenom("Thibaut");
        f3.profile.setNom("Coucou");
        f3.profile.dateDeNaissance.setDate(2, 11, 2000);
        f3.setMoyenDeTransport(FraisDeDeplacement.moyensDeLocomotion.VELO);

        f3.date.setYyyy(1990);
        f3.date.setMm(1);
        f3.date.setDd(14);
        f3.setDistance(10);
        f3.setMontant(30.4);

        System.out.println(f3.toString());

    }
}