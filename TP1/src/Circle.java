public class Circle {
    private float x;
    private float y;

    Circle (){ // default constructor
        this.x = 0;
        this.y = 0;
    }

    Circle (float x, float y, float r) { // constructor with x,y parameter
        this.x = x;
        this.y = y;
        this.rayon = r;
    }

    private float rayon;
    private void setRayon(float rayon) {
        this.rayon = rayon;
    }

    private void setCoordonnes(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private float getDiametre() {
        return 2 * this.rayon;
    }

    private float getPerimetre(){
        return 2 * (float)Math.PI * this.rayon ;
    }

    private float getSurface() {
        return (float) Math.PI * this.rayon * this.rayon;
    }

    private void printMe(){
        System.out.println("Hey, i'm a cirle");
        System.out.println("Les coordonnées du centre sont : " + this.x + " - " + this.y);
        System.out.println("Rayon : " + this.rayon);
        System.out.println("Perimetre : " + this.getPerimetre());
        System.out.println("Surface : " + this.getSurface());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3F, 1F, 10.4F);

        c1.setRayon(10.4F);
        System.out.println(c1.getDiametre());
        System.out.println(c1.getPerimetre());
        System.out.println(c1.getSurface());

        Circle c2 = new Circle(34.0F, 12.3F, 18.0F);
        c2.printMe();
    }
}
