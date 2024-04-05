package fr.lelouet.UT2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CarteJouerTest {

    @Test
    @DisplayName("Test valeur et couleur valide sans exception")
    void testSansExceptionSurCouleur() {
        assertDoesNotThrow(() -> new CarteJouer("AS", "TREFLE"));
    }

    @Test
    @DisplayName("Test avec exception sur couleur invalide")
    void testAvecExceptionSurCouleur() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer("AS", "INVALIDE"));
    }

    @Test
    @DisplayName("Test sans exception sur valeur")
    void testSansExceptionSurValeur() {
        assertDoesNotThrow(() -> new CarteJouer("AS", "TREFLE"));
    }

    @Test
    @DisplayName("Test avec exception sur valeur invalide")
    void testAvecExceptionSurValeur() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer("INVALIDE", "TREFLE"));
    }

    @ParameterizedTest
    @CsvSource({
            "AS, TREFLE",
            "ROI, PIQUE",
            "DAME, CARREAU",
            "VALET, COEUR"
    })
    @DisplayName("Test sans exception sur couleur et valeur")
    void testSansExceptionSurCouleurEtValeur(String valeur, String couleur) {
        assertDoesNotThrow(() -> new CarteJouer(valeur, couleur));
    }

    @Test
    @DisplayName("Test avec valeur null")
    void testAvecValeurNull() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer(null, "TREFLE"));
    }

    @Test
    @DisplayName("Test avec couleur null")
    void testAvecCouleurNull() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer("AS", null));
    }

    @Test
    @DisplayName("Test avec valeur et couleur null")
    void testAvecValeurEtCouleurNull() {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer(null, null));
    }

    @ParameterizedTest
    @CsvSource({
            "AS, ",
            " , TREFLE",
            " , ",
            "INVALIDE, INVALIDE"
    })
    @DisplayName("Test avec valeur ou couleur vide")
    void testAvecValeurOuCouleurVide(String valeur, String couleur) {
        assertThrows(IllegalArgumentException.class, () -> new CarteJouer(valeur, couleur));
    }

    @Test
    @DisplayName("Test avec des valeurs non standard")
    void testAvecValeursNonStandard() {
        assertDoesNotThrow(() -> new CarteJouer("10", "TREFLE"));
        assertDoesNotThrow(() -> new CarteJouer("6", "CARREAU"));
        assertDoesNotThrow(() -> new CarteJouer("2", "PIQUE"));
    }

}
