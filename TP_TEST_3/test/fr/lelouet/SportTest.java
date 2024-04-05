package fr.lelouet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SportTest {

    @Test
    void vitesseMoyenne() {
        Seance VTT = new Seance(Seance.sport.VTT, 49, 120, 3, 4, "", "17/03/2024", "18:00");
        Assertions.assertEquals(24.5, VTT.getVitesseMoyenne());
    }

    @Test
    void natationRythmeMoyen() {
        Seance natation = new Seance(Seance.sport.NATATION, 4, 60, 5, 4, "L'eau mouille", "07/03/2024", "7:00");
        Assertions.assertEquals(15,natation.getRythmeMoyen());
    }

    @Test
    void sportCoIllegalDuree() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Seance(Seance.sport.SPORT_CO, 0, -60, 4, 2, "", "04/04/2024", "20:00") );

    }
}