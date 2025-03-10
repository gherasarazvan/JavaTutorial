package homeworks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Tema3 {
//    Rezolvam urmatoarele cerinte:
//1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
//2. Afisam in consola primele 3 numere de la 1 la 3;
//3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
//6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
//7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//8. Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
//10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
//11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

    @Test
    public void totalTema()
    {
//        t1(5);
//        t2(3);
//        t3(15,20);
//        t4(4.5,3.25);
//        t5(10);
//        t6(10);
//        t7(100,4,5); // sfarsit nr - capat; inceput nr - start; div - numar cu care sa se divida
//        t8(100,1,3,3);
//        t9(235,10);
//        t10(10);
//        t11(5);


    }

    //1. Afisam in consola de n ori cuvantul "DA" pe acelasi rand cu un spatiu intre;

    public void t1(int n)
    {
        for (int i=1;i<=n;i++)
            System.out.print("DA ");
    }

    //2. Afisam in consola primele n numere de la 1 la n;

    public void t2(int n)
    {
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }

    //3. Afisam in consola numarul cel mai mare dintre x(15) si y(20); Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void t3(int x, int y)
    {
        System.out.println("Cel mai mare numar este: ");

        if(x>y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    //4. Afisam in consola numarul cel mai mic dintre x (4.5) si y (3.25); Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void t4(double x, double y)
    {
        System.out.println("Cel mai mic numar este: ");
        if(x<y)
            System.out.println(x);
        else
            System.out.println(y);
    }

    //5. Afisam in consola numerele pare si numerele impare pana la n(10) (utilizam "for");

    public void t5(int n)
    {
        List<Integer> pare = new ArrayList<>();
        List<Integer> impare = new ArrayList<>();

        for (int i=0;i<=n;i++)
            if(i%2==0)
                pare.add(i);
            else
                impare.add(i);

        System.out.println("Numerele pare sunt: ");

        for(int j1 = 0; j1 < pare.size(); j1++)
            System.out.print(pare.get(j1) + " ");

        System.out.println("\n" + "Numerele impare sunt: ");

        for(int j2 = 0; j2<impare.size(); j2++)
            System.out.print(impare.get(j2) + " ");

    }

    //6. Afisam in consola doar numerele pare pana la n(10) (utilizam "for");

    public void t6(int n)
    {
        List<Integer> pare = new ArrayList<>();

        for (int i=0;i<=n;i++)
            if(i%2==0)
                pare.add(i);

        System.out.println("Numerele pare sunt: ");

        for(int j1 = 0; j1 < pare.size(); j1++)
            System.out.print(pare.get(j1) + " ");
    }

    //7. Afisam in consola numerele divizibile cu div(5); Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void t7(int sfarsitNr, int inceputNr, int div)
    {
        List<Integer> numereDivizibile = new ArrayList<>();

        int originalInceputNr = inceputNr;

        while(inceputNr<= sfarsitNr)
        {
            if(inceputNr%div==0)
                numereDivizibile.add(inceputNr);
            inceputNr++;
        }

        System.out.println("Numerele de la " + originalInceputNr + " la " + sfarsitNr + " divizibile cu " + div + " sunt:");
        for(int j=0; j<numereDivizibile.size(); j++)
        System.out.print(numereDivizibile.get(j) + " ");
    }

    //8. Afisam in consola primele sfarsitNr numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void t8(int sfarsitNr, int inceputNr, int div, int panaLaCatAfisam)
    {
        List<Integer> numereDivizibile = new ArrayList<>();

        int originalInceputNr = inceputNr;

        while(inceputNr<= sfarsitNr)
        {
            if(inceputNr%div==0)
                numereDivizibile.add(inceputNr);
            inceputNr++;
        }

        System.out.println("Primele " + panaLaCatAfisam + " numere divizibile cu " + div + " pana la " + sfarsitNr + " sunt: ");

        int j=0;
        while(j<panaLaCatAfisam)
        {
            System.out.print(numereDivizibile.get(j) + " ");
            j++;
        }
    }

    //9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;

    public void t9(int x, int y)
    {
        System.out.println(x+y);
    }

    //10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;

    public void t10(int n)
    {
        int suma = 0;
        for(int i=1;i<=n;i++)
            suma=suma+i;
        System.out.println("Suma este = " + suma);
    }

    //11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

    public void t11(int n)
    {
        int produs = 1;
        for(int i=1;i<=n;i++)
            produs = produs * i;
        System.out.println(n + "! = " + produs);
    }

}
