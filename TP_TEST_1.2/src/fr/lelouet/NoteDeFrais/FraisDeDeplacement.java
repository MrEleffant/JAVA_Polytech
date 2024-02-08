package fr.lelouet.NoteDeFrais;

public class FraisDeDeplacement {
    public Personne profile;
    public Date date;
    private double montant;
    private double distance;

    public enum moyensDeLocomotion {
            VOITURE,
            VELO,
            PIED
    };
    moyensDeLocomotion moyenDeTransport;

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public moyensDeLocomotion getMoyenDeTransport() {
        return moyenDeTransport;
    }

    public void setMoyenDeTransport(moyensDeLocomotion moyenDeTransport) {
        this.moyenDeTransport = moyenDeTransport;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPersonne(Personne personne) {
        this.profile= personne;
    }

    public String toString(){
        return profile.toString() + "\n" + date.toString() + "\n" + getMoyenDeTransport() + "\n" + getDistance() + "\n" + getMontant();
    }


    private void setupFraisDeDeplacement(Personne personne, Date date, moyensDeLocomotion moyenDeTransport, double distance, double montant){
        setPersonne(personne);
        setDate(date);
        setMoyenDeTransport(moyenDeTransport);
        setDistance(distance);
        setMontant(montant);
    }

    public FraisDeDeplacement() {
        setupFraisDeDeplacement(new Personne(), new Date(), moyensDeLocomotion.PIED, 0,0);

    }
    public FraisDeDeplacement(Personne personne, Date date, moyensDeLocomotion moyenDeTransport, int distance, int montant) {
        setupFraisDeDeplacement(personne, date, moyensDeLocomotion.PIED, distance,montant);
    }
}

