package temaSporitivi;

import org.testng.annotations.Test;

public class SportivTest {

    @Test

    public void testMethod(){
        Sportivi sportiv1 = new Sportivi("Radoi",22,5,66.44,4,"FC Euroclass");
        sportiv1.rezumat();

        System.out.println();

        Sportivi sportiv2 = new Sportivi("Popescu", 25, 7, 72.5, 10, "Steaua");
        sportiv2.rezumat();

        System.out.println();

        Sportivi sportiv3 = new Sportivi("Ionescu", 19, 2, 68.0, 5, "Dinamo");
        sportiv3.rezumat();

        System.out.println();

        Sportivi sportiv4 = new Sportivi("Dumitrescu", 30, 12, 80.3, 15, "CFR Cluj");
        sportiv4.rezumat();

        System.out.println();

        Sportivi sportiv5 = new Sportivi("Georgescu", 27, 9, 75.6, 8, "Universitatea Craiova");
        sportiv5.rezumat();

        System.out.println();

        Sportivi sportiv6 = new Sportivi("Mihailescu", 22, 4, 70.2, 6, "Rapid București");
        sportiv6.rezumat();

        System.out.println();

        Sportivi sportiv7 = new Sportivi("Stanescu",32,"Viitorul");

    }
}
