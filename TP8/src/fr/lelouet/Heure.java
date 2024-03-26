package fr.lelouet;

import java.time.LocalDateTime;

public class Heure {
    /*Variables Privées*/
    private byte heures = 0;
    private byte minutes = 0;

    /*Getter*/
    public byte getHeures(){return  heures;}
    public byte getMinutes(){return minutes;}

    /*Setter*/
    public void setHeures(int hh) throws ValueException {
        if(hh < 0 || hh > 23){throw new ValueException("Heure non valide");}
        heures = (byte)hh;
    }
    public void setMinutes(int mm) throws ValueException
    {
        if(mm < 0 || mm > 59){throw new ValueException("Minute non valide");}
        minutes = (byte)mm;
    }
    public void setHeuresMinutes(int hh, int mm) throws ValueException
    {
        setHeures(hh);
        setMinutes(mm);
    }

    /*Constructeurs*/
    public Heure(int hh, int mm) throws ValueException
    {
        setHeures(hh);
        setMinutes(mm);
    }
    public Heure() throws Exception
    {
        setHeures(LocalDateTime.now().getHour());
        setMinutes(LocalDateTime.now().getMinute());
    }

    /*Méthodes*/

    public String toString()
    {
        return (getHeures()>9?getHeures():"0"+getHeures()) + ":" + (getMinutes()>9?getMinutes():"0"+getMinutes());
    }
    public void avancerMinutes(int min) {
        int TotalMinutes = this.heures * 60 + this.minutes + min;
        int MinutesOrga = (TotalMinutes >= 0) ? (TotalMinutes % 1440) : (1440 - (-TotalMinutes % 1440));
        heures = (byte) ((MinutesOrga + 1440) / 60 % 24);
        minutes = (byte) (MinutesOrga % 60);
    }

}