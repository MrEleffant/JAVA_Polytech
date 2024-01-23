public class Circle {
    private float x;
    private float y;
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

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRayon(10.4F);
        System.out.println(c1.getDiametre());
        System.out.println(c1.getPerimetre());
        System.out.println(c1.getSurface());
    }
}
