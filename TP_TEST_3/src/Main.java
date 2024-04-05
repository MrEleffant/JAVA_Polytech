import fr.lelouet.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        MesSeance Seances = new MesSeance();
        Seances.add(new Seance(Seance.sport.VTT, 49, 120, 3, 4, "", "17/03/2024", "18:00"));
        Seances.add(new Seance(Seance.sport.SPORT_CO, 0, 180, 4, 2, "", "04/04/2024", "20:00"));
        Seances.add(new Seance(Seance.sport.NATATION, 4, 60, 5, 4, "L'eau mouille", "07/03/2024", "7:00"));

        System.out.println("Seances");
        System.out.println(Seances);
        Collections.sort(Seances, Seance.sportDureeComparator);
        System.out.println("Seances triées par durées");
        System.out.println(Seances);

        System.out.println("Seances.laPlusLongue()");
        System.out.println(Seances.laPlusLongue());

    }
}