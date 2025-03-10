
package variabilaMetoda;

import org.testng.annotations.Test;

public class Student{
    //intr un fisier java recunoastem o clasa dupa cuvantul "class"
    //orice clasa trebuie sa aiba un nume
    //intr un fisier java putem avea mai multe clase diferentiate prin nume
    //nu este un best practice sa ai mai multe clase intr un fisier
    //tot codul care apartie unei clase se regaseste intre acolade
    //clasa=sablon care contine variabile si metode despre un anumit exemplu
    //intr o clasa putem sa avem n variabile si n metode
    //proprietate=variabila in java
    //variabila=proprietatea unei clase
    //exista 2 tipuri de variabile:globala si locala
    //variabila globala=proprietate care este vizibila peste tot in programul nostru
    //structura variabila globala:public tip variabila nume variabila;
    //variabila locala=proprietate care este vizibila doar in locul unde ai declarat o
    //structura variabila locala: tip variabila nume variabila;
    //nu este obligatoriu ca o variabila sa aiba o valoare
    //in java exista conceptul de primitiva si non primitiva
    //primitiva se bazeaza pe nitializarea unei valori in functie de tipul de date definitit
    //nonprimitiva-se bazeaza pe instantierea unei variabile prin referinta
    //metoda=actiunea unei clase
    //exista 2 tipuri de metode:void si return
    //void-in momentul in care le executi iti dau rezultatul pe loc(nu te face sa astepti)
    //structura metoda void:public void nuume metoda () {}

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;


    @Test
    public void prezentareStudent() {
        nume = "Gherasă";
        prenume = "Răzvan";
        varsta = 23;
        adresa = "9 Mai, Numărul 20";
        inaltime = 1.77;
        greutate = 79.9f;
        sex = 'M';
        areBursa = true;

        System.out.println("Numele si prenumele studentului sunt:" + nume + ' ' + prenume);
        System.out.println("Varsta studentului este:" + varsta);
        System.out.println("Adresa studentului este:" + adresa);
        System.out.println("Inaltimea studentului este:" + inaltime);
        System.out.println("Greutatea studentului este:" + greutate);
        System.out.println("Sexul studentului este:" + sex);
        System.out.println("Are studentul bursa?:" + areBursa);

        calculMedieStudent();

    }

    //o noua metoda care calculeaza media unui student
    //o metoda poate sa contina sau nu parametri

    public void calculMedieStudent() {
        double nota1 = 9;
        double nota2 = 8;
        double medie = (nota1 + nota2) / 2;
        System.out.println("Media studentului este " + medie);

    }

    public void calculMedieStudent(double nota1, double nota2) {
        double medie = (nota1 + nota2) / 2;
        System.out.println("Media studentului este " + medie);
    }

    public void calculMedieStudent3(double nota1, double nota2, double nota3) {
        double medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este " + medie);

    }

}

