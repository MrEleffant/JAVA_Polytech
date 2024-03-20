package fr.lelouet.exerciceComplementaire;
import java.util.ArrayList;

public class ListeDeNotes extends ArrayList<Float> {
    public float moyenne(){
        return (float)stream().mapToDouble(Float::doubleValue).average().orElse(0.0);
    }
}
