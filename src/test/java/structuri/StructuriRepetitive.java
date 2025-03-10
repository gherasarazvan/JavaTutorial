package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive
{

    // structuri repetitive: for, while, for each

    @Test
    public void metodaTest()
    {

//        afisamNnumereFor(10);
//        afisamNnumereWhile(11);
//        afisamNrPareN(100);
//        afisamNrPareN2(252);

    }

    //Afisam primele n numere

    public void afisamNnumereFor(int n)
    {
        for (int i=0; i<n;i++)
            System.out.println(i);
    }

    public void afisamNnumereWhile(int m)
    {
        int i = 0;
        while(i<m)
        {
            System.out.println(i);
            i=i+1;
        }
    }

    //Afisam nr pare de la 0 la n

    public void afisamNrPareN(int n)
    {
        for (int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

    //Afisam cate nr pare si impare sunt

    public void afisamNrPareN2(int n)
    {
        int nr_par =0;
        int nr_impar =0;
        for (int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                nr_par++;
            }
            else
                nr_impar++;
        }
        System.out.println("Avem " + nr_par + " numere pare");
        System.out.println("Avem " + nr_impar + " numere impare");
    }



}
