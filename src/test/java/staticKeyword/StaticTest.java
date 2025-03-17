package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest() {

        Elev elev1 = new Elev("Mircea","Radu",15,"7B");
        elev1.infoElev();
        System.out.println();

        Elev elev2 = new Elev("Andrei","Carmen",16,"5B");
        elev2.infoElev();
        System.out.println();

        Elev elev3 = new Elev("Ionut","Maria",14,"6A");
        elev3.infoElev();

    }
}

