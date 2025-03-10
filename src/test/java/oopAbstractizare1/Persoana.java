package oopAbstractizare1;

public class Persoana {

    // abstractizare = conceptul prin care se poate defini cu exactitate comportamentul unei clase
    // abstractizarea se poate realiza in doua feluri: folosind interfete, folosind clasa abstracta
    // printr-o interfata intelegem o structura care contine doar metode abstracte
    // pe langa faptul ca toate metodele sunt abstracte, mai sunt si publice
    // o interfata se recunoaste prin cuvantul interface
    // o interfata se implementeaza
    // o interfata poate sa fie implementata de una sau mai multe clase
    // clasa care implementeaza interfata trebuie sa implementeze toate metodele din interfata
    // o clasa poate sa implementeze mai multe interfete
    // o interfata poate sa fie implementata de o clasa abstracta
    //! o interfata nu poate sa contina un constructor => nu putem face un obiect

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Numele persoanei este:" + nume);
        System.out.println("Prenumele persoanei este:" + prenume);
        System.out.println("Varsta persoanei este:" + varsta);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
