package oop;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OopTest {

    @Test

    public void testMethod() {
        Volvo comanda1 = new Volvo("Volvo", "XC90", 2024, "Electric", 50033, Arrays.asList("geamuri electrice", "oglinzi rabatabile",
                "scaune incalzite"));
        comanda1.rezumatVolvo();

        System.out.println();

        Volvo comanda2 = new Volvo("Volvo", "S90", 2022, "Diesel", 47000, Arrays.asList("volan incalzit", "senzori parcare", "cameră 360°"));
        comanda2.rezumatVolvo();

        System.out.println();

        Dacia comanda3 = new Dacia("Dacia","Sandero",2005,"motorina",4000, Arrays.asList("geamuri electrice fata"));
        comanda3.rezumatDacia();

        System.out.println();

        Ford comanda4 = new Ford("Ford", "Focus", 2010, "benzina", 5500, Arrays.asList("tuning toba"), Arrays.asList("led in plafon"));
        comanda4.rezumatFord();


    }
}
