package obiectConstructor;

import org.testng.annotations.Test;

public class MasinaTest {

    @Test
    public void testMethod() {
        Masina comanda1 = new Masina("Audi", "A4", "diesel", 5, 2010);
        comanda1.rezumat();

        System.out.println();

        Masina comanda2 = new Masina("Volvo", "XC90", "electrica", 5, 2023);
        comanda2.rezumat();

        System.out.println();

        Masina comanda3 = new Masina("Mercedes", "AMG", "benzina", 5, 2024, 44442.4);
        comanda3.rezumat();

        System.out.println();

        Masina comanda4 = new Masina("BMW", "M5", "benzina", 4, 2023, 52300.0);
        comanda4.rezumat();

        System.out.println();

        Masina comanda5 = new Masina("Audi", "RS7", "benzina", 5, 2022, 68500.5);
        comanda5.rezumat();

        System.out.println();

        Masina comanda6 = new Masina("Tesla", "Model S", "electric", 5, 2024, 79999.9);
        comanda6.rezumat();

    }
}
