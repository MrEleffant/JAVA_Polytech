package fr.lelouet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeureTest {

    Heure h1;
    @BeforeEach
    public void initialize() throws Exception {
        h1 = new Heure(8, 14);
    }

    @Test
    void TestavancerMinute_8_14_12() throws Exception {
        h1.avancerMinutes(12);
        Assertions.assertEquals(8, h1.getHeures());
        Assertions.assertEquals(26, h1.getMinutes());
    }

    @Test
    void TestavancerMinute_8_14_51() throws Exception {
        h1.avancerMinutes(51);
        Assertions.assertEquals(9, h1.getHeures());
        Assertions.assertEquals(5, h1.getMinutes());
    }

    @Test
    void TestavancerMinute_8_14_73() throws Exception {
        h1.avancerMinutes(73);
        Assertions.assertEquals(9, h1.getHeures());
        Assertions.assertEquals(27, h1.getMinutes());
    }

    @Test
    void TestavancerMinute_8_14_125() throws Exception {
        h1.avancerMinutes(125);
        Assertions.assertEquals(10, h1.getHeures());
        Assertions.assertEquals(19, h1.getMinutes());
    }

    @Test
    void TestavancerMinute_20_04_303() throws Exception {
        h1.setHeures(20);
        h1.setMinutes(4);
        h1.avancerMinutes(303);

        Assertions.assertEquals(1, h1.getHeures());
        Assertions.assertEquals(7, h1.getMinutes());
    }

    @Test
    void testAddition_3_56_plus_1441() throws Exception {
        Heure h = new Heure(3, 56);
        h.avancerMinutes(1441);
        Assertions.assertEquals(3, h.getHeures());
        Assertions.assertEquals(57, h.getMinutes());
    }

    @Test
    void testSoustraction_8_14_moins_12() throws Exception {
        Heure h = new Heure(8, 14);
        h.avancerMinutes(-12);
        Assertions.assertEquals(8, h.getHeures());
        Assertions.assertEquals(2, h.getMinutes());
    }

    @Test
    void testSoustraction_8_14_moins_16() throws Exception {
        Heure h = new Heure(8, 14);
        h.avancerMinutes(-16);
        Assertions.assertEquals(7, h.getHeures());
        Assertions.assertEquals(58, h.getMinutes());
    }

    @Test
    void testSoustraction_8_14_moins_70() throws Exception {
        Heure h = new Heure(8, 14);
        h.avancerMinutes(-70);
        Assertions.assertEquals(7, h.getHeures());
        Assertions.assertEquals(4, h.getMinutes());
    }

    @Test
    void testSoustraction_8_14_moins_121() throws Exception {
        Heure h = new Heure(8, 14);
        h.avancerMinutes(-121);
        Assertions.assertEquals(6, h.getHeures());
        Assertions.assertEquals(13, h.getMinutes());
    }

    @Test
    void testSoustraction_3_56_moins_241() throws Exception {
        Heure h = new Heure(3, 56);
        h.avancerMinutes(-241);
        Assertions.assertEquals(23, h.getHeures());
        Assertions.assertEquals(55, h.getMinutes());
    }

    @Test
    void testSoustraction_3_56_moins_1441() throws Exception {
        Heure h = new Heure(3, 56);
        h.avancerMinutes(-1441);
        Assertions.assertEquals(3, h.getHeures());
        Assertions.assertEquals(55, h.getMinutes());
    }



}