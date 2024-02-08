package fr.lelouet.NotesDeFrais;

public class FraisDeDeplacement {
    private static final double tauxChangeDollars = 1.0763;
    public enum moyensDeTransport {
        VoitureElectrique,
        VoitureThermique,
        VoitureHybride,
        Train,
        RER,
        Tram,
        Metro,
        Velo,
        APied
    }
    moyensDeTransport moyenDeTranspot;
    private String nom;
    private String prenom;
    private double montant;
    private double distance;

    private int dd;
    private int mm;
    private int yyyy;

    public moyensDeTransport getMoyenDeTranspot() {
        return moyenDeTranspot;
    }

    public void setMoyenDeTranspot(moyensDeTransport moyenDeTranspot) {
        this.moyenDeTranspot = moyenDeTranspot;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        if (isMontantValide(montant)){
            this.montant = montant;
        } else {
            throw new IllegalArgumentException("Montant invalide " + montant);
        }
    }
    private boolean isMontantValide(double montant) {
        return montant >= 0;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (isDistanceValide(distance)){
            this.distance = distance;
        } else {
            throw new IllegalArgumentException("Distance invcalide " + distance);
        }

    }

    private boolean isDistanceValide(double dst) {
        return dst >= 0;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public double getMontantEnDollars(){
        return montant * tauxChangeDollars;
    }

    public String toString(){
        return getNom() + " " + getPrenom() + " a effectué un déplacement de " + getDistance() + "km le " + getDd() + "/" + getMm() + "/" + getYyyy() + ".\nIl a voyagé en " + getMoyenDeTranspot() + " pour un cout totale de " + getMontant() + " EUROS";
    }
    public String toStringDollars(){
        return getNom() + " " + getPrenom() + " a effectué un déplacement de " + getDistance() + "km le " + getDd() + "/" + getMm() + "/" + getYyyy() + ".\nIl a voyagé en " + getMoyenDeTranspot() + " pour un cout totale de " + getMontantEnDollars() + " DOLLARS";
    }


    public FraisDeDeplacement(String nom, String prenom, moyensDeTransport mdt, int montant, int distance, int dd, int mm, int yyyy){
        this.nom = nom;
        this.prenom = prenom;
        this.moyenDeTranspot = mdt;

        setMontant(montant);
        setDistance(distance);

        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    public FraisDeDeplacement(){
        this ("","", moyensDeTransport.APied, 0, 0, 1, 1, 2024);
    }


}