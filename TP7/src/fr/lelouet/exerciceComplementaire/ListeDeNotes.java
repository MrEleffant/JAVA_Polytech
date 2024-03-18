package fr.lelouet.exerciceComplementaire;
import java.util.ArrayList;

public class ListeDeNotes extends ArrayList<Float> {
    public double moyenne(){
        return stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
    }
}
