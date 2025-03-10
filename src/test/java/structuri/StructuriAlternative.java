package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = IF (CONDITIE) ... ELSE; SWITCH (VALUE) ... CASE


    @Test
    public void metodaTest() {

        afisamZi(10);

    }

        //verificam care numar este mai mare dintre 2 valori
    public void afisamNrMaiMare(int nr1, int nr2)
    {

        if (nr1>nr2)
        {
            System.out.println("nr1 = " + nr1 +" este mai mare decat nr2 = " + nr2);
        }
        else
        {
            System.out.println("nr2 = " + nr2 +" este mai mare decat nr1 = " + nr1);
        }
    }


        // verificam paritate nr si daca este pozitiv
    public void verificamPar(int nr)
    {

        if (nr>0)
            if (nr%2==0)
                System.out.println(nr + " este pozitiv si este par");
            else
                System.out.println(nr + " este pozitiv si este impar");
        else
        {
            if(nr==0)
                System.out.println(nr + " este 0 si este par");
            else
                if (nr%2==0)
                    System.out.println(nr + " este negativ si este par");
                else
                    System.out.println(nr + " este negativ si este impar");
        }
    }


        //afisam una dintre zilele saptamanii
    public void afisamZi(int zi)
    {
        switch (zi)
        {
            case 1:
                System.out.println("Astazi este luni.");
                break;
            case 2:
                System.out.println("Astazi este marti.");
                break;
            case 3:
                System.out.println("Astazi este miercuri.");
                break;
            case 4:
                System.out.println("Astazi este joi.");
                break;
            case 5:
                System.out.println("Astazi este vineri.");
                break;
            case 6:
                System.out.println("Astazi este sambata.");
                break;
            case 7:
                System.out.println("Astazi este duminica.");
                break;
            default:
                System.out.println("Nu sunt zile pentru asta!");
        }
    }



}
