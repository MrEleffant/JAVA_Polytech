package fr.lelouet;

import java.util.ArrayList;
import java.util.Collections;

public class MesSeance extends ArrayList<Seance> {

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("TYPE - DATE - HEURE - DUREE - DISTANCE - FEELING - EFFORT - CONDITION");
        forEach(seance -> {
                str.append("\n" + seance.toString());
        });

        return str.toString();
    }

    public Seance laPlusLongue(){
        Collections.sort(this, Seance.sportDureeComparator);
        return this.stream().findFirst().get();
    }
}
