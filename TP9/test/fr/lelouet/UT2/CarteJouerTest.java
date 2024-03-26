package fr.lelouet.UT2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteJouerTest {

    @Test
    void testSansExceptionSurCouleur() {
        assertDoesNotThrow(() -> new CarteJouer("AS", "TREFLE"));
    }

    @Test
    void testAvecExceptionSurCouleur() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer("AS", "INVALIDE"));
    }

    @Test
    void testSansExceptionSurValeur() {
        assertDoesNotThrow(() -> new CarteJouer("AS", "TREFLE"));
    }

    @Test
    void testAvecExceptionSurValeur() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer("INVALIDE", "TREFLE"));
    }

}