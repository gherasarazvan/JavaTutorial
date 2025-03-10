package homeworks;

import org.testng.annotations.Test;

public class Tema1
{

    //Tema 1

//Afiseaza pe ecran urmatoarele:
//PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
//
//1. Hello World

    @Test
    public void t1()
    {
        String v1 = "Hello World";
        System.out.println(v1);
    }

//2. Varsta ta (numar)

    @Test
    public void t2()
    {
        int varsta = 23;
        System.out.print("\n"+varsta+"\n");
    }

//3. Numele si prenumele pe 2 randuri

    @Test
    public void t3()
    {
        String v1="Gherasă";
        String v2="Răzvan";

        System.out.println(v1);
        System.out.println(v2);
    }

//4. Adauga la "Salut" caracterul "M" la final

    @Test
    public void t4()
    {
        System.out.println("Salut" + "M");
    }

//5. Adauga la "Hello" caracterul "H" la inceput

    @Test
    public void t5()
    {
        System.out.println("H" + "ello");
    }

//6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"

    @Test
    public void t6()
    {
        String text = "Ana are mere, pere, prune";
        String updateText = text.replaceAll("([AEIOUaeiou])", "$1Z");
        System.out.println(updateText);
    }

//7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"

    @Test
    public void t7()
    {
        String text = "Ana are mere, pere, prune";
        String updateText = text.replaceAll("([AEIOUaeiou])", "$1Z");
        System.out.println(updateText + "\n" + "Poti pleca acasa dupa ce iti verific munca!");
    }

//8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;

    @Test
    public void t8()
    {
        String [] nume = {"Ana", "Mihai" , "Mircea", "Andrei"};
        int [] salariu = {100, 200, 300, 400};

        for(int i = 1; i<= nume.length-1; i++)
        {
            if(nume[i]=="Andrei")
                System.out.print("Andrei are un salariu de " +  salariu[i]);
        }
    }

//9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"

    @Test
    public void t9()
    {
        String [] angajati = {"Sendroiu", "Mirciulica", "Popescu", "Marinescu"};
        String [] departament = {"it", "invatamant", "constructii", "gunoieri"};
        int [] id = {1,2,3,4};
        for (int i=0; i< angajati.length;i++)
        {
            if(angajati[i].equals("Popescu"))
                System.out.println(departament[i] + " " + id[i]);

        }
    }

//10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;

    @Test
    public void t10()
    {
        String [] numeDepartament = {"Constructii", "IT", "HoReCa", "Economie"};
        int [] idDepartament = {200,43,536,773};
        for (int i = 0; i< numeDepartament.length; i++)
        {
            if(idDepartament[i]>287)
                System.out.println(numeDepartament[i] + ", ID = " + idDepartament[i] + "\n");
        }
    }
//
//
//! BONUS !
//Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
//  Rezultatul corect este: {rezultatul}

    @Test
    public void t11()
    {
        System.out.print("Rezultatul corect este: " + ((2+(3*4)-3)/3));
    }

}