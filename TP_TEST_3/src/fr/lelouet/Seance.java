package fr.lelouet;

import java.time.temporal.ValueRange;
import java.util.Comparator;

public class Seance {
    public enum sport { COURSE_A_PIEDS, VTT, NATATION, SPORT_CO;};
    private sport sport;
    private float distance;
    private float duree;
    private int feeling;
    private int effort;
    private String conditions;
    public String date;
    public String time;

    public Seance.sport getSport() {
        return sport;
    }

    public void setSport(Seance.sport sport) {
        this.sport = sport;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        if(duree>0){
            this.duree = duree;
        } else {
            throw new IllegalArgumentException("La durée ne peut être négative");
        }
    }

    public int getFeeling() {
        return feeling;
    }

    public void setFeeling(int feeling) {
        if(ValueRange.of(0,5).isValidValue(feeling)){
            this.feeling = feeling;
        } else {
            throw new IllegalArgumentException("Le feeling doit être compris entre 0 et 5.");
        }
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        if(ValueRange.of(0,5).isValidValue(effort)){
            this.effort = effort;
        } else {
            throw new IllegalArgumentException("L'effort doit être compris entre 0 et 5.");
        }
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getVitesseMoyenne(){
        return (getDistance()*60/getDuree());
    }

    public float getRythmeMoyen(){
        return (getDuree()/getDistance());
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(getSport());
        str.append(" - " + getDate());
        str.append(" - " + getTime());
        str.append(" - " + getDuree());
        str.append(" - " + getDistance());
        str.append(" - " + getFeeling());
        str.append(" - " + getEffort());
        str.append(" - " + getConditions());
        return str.toString();
    }

    public static Comparator<Seance> sportDureeComparator = new Comparator<Seance>(){
        @Override
        public int compare(Seance o1, Seance o2) {
            return Float.compare(o2.getDuree(), o1.getDuree());
        }
    };

    public Seance(Seance.sport sport, float distance, float duree, int feeling, int effort, String conditions, String date, String time) {
        setSport(sport);
        setDistance(distance);
        setDuree(duree);
        setFeeling(feeling);
        setEffort(effort);
        setConditions(conditions);
        setDate(date);
        setTime(time);
    }

    public Seance(Seance.sport sport, String date, String time, int duree){
        this(sport, 0, duree, 0, 0, "", date, time);
    }

}
