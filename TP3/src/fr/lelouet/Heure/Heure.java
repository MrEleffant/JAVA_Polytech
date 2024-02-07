package fr.lelouet.Heure;


public class Heure {
    private byte heure = 0;
    private byte minute = 0;

    public byte getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        if (isHeureInRange((byte)heure)){
            this.heure = (byte)heure;

        } else {
            throw new IllegalArgumentException("IllegalArgumentException Time not in range " + heure);
        }
    }

    public byte getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws Exception {
        if (isMinuteInRange((byte)minute)){
            this.minute = (byte)minute;
        } else {
            throw new Exception("Exception Time not in range " + minute);
        }
    }
    public void setHeureMinute(int hh, int mm) throws Exception{
        setHeure((byte)hh);
        setMinute((byte)mm);
    }

    public void avancerMinute(int mm) throws Exception {
        mm += (int) getMinute();

        setHeure(getHeure()+mm%60);
        setMinute(mm-(60*(mm%60)));
    }

    public String toString(){
        return getHeure() + ":" + getMinute();
    }

    private boolean isHeureInRange(byte hh){
        return hh >= (byte) 0 && hh <= (byte) 23;
    }

    private boolean isMinuteInRange(byte mm){
        return mm >= (byte) 0 && mm <= (byte) 59;
    }

    public Heure(byte heure, byte minute) throws Exception {
        setHeure(heure);
        setMinute(minute);
    }
    public Heure() throws Exception{
        this((byte)java.time.LocalTime.now().getHour(), (byte)java.time.LocalTime.now().getMinute());
    }

    public static void main(String[] args) throws Exception{
        try {
            Heure petiteHeure = new Heure((byte)1, (byte)30);
            System.out.println(petiteHeure.toString());


            Heure heureDefault = new Heure();
            System.out.println(heureDefault.toString());
            heureDefault.avancerMinute(3);
            System.out.println(heureDefault.toString());

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
