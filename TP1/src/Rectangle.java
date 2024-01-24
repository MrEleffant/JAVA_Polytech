public class Rectangle {
    private float x;
    private float y;
    private float longueur;
    private float largeur;

    Rectangle(float x, float y, float longueur, float largeur){
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getLongueur() {
        return longueur;
    }

    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getPerimetre() {
        return (float)2*this.longueur + (float)2* this.largeur;
    }

    public float getAir(){
        return this.longueur * this.largeur;
    }

    public void printMe(){
        System.out.println("Hey i'm a rectangle");
        System.out.println("This are my coordonates : "  + this.getX() + " - " + this.getY());
        System.out.println("Longueur : " + this.getLongueur());
        System.out.println("Largeur : " + this.getLargeur());
        System.out.println("Périmetre : " + this.getPerimetre());
        System.out.println("Air : " + this.getAir());
    }

    public static void main (String[] args){
        Rectangle rect1 = new Rectangle(1F,2F,3.0F, 6F);

        rect1.printMe();

    }

}
