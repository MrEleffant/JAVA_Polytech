package fr.lelouet.NoteDeFrais;

public class Date {
    private int dd;
    private int mm;
    private int yyyy;

    public void setDd(int dd) {
        this.dd = dd;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public int getDd() {
        return dd;
    }

    public int getMm() {
        return mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setDate(int dd, int mm, int yyyy){
        setDd(dd);
        setMm(mm);
        setYyyy(yyyy);
    }

    public String toString() {
        return getDd()+"/"+getMm()+"/"+getYyyy();
    }

    public Date(int dd, int mm, int yyyy){
        setDd(dd);
        setMm(mm);
        setYyyy(yyyy);
    }
    public Date(){
        this(java.time.LocalDate.now().getDayOfMonth(), java.time.LocalDate.now().getMonthValue(), java.time.LocalDate.now().getYear());
    }

}
