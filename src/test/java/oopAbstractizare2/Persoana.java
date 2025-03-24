package oopAbstractizare2;

public abstract class Persoana {
    //o clasa abstracta functioneaza in mare parte ca o clasa normala
    //o clasa abstracta poate sau nu sa contina metode abstracte
    //recunoastem o clasa abstracta dupa cuvantul abstract
    //pentru a face o metoda abstracta in clasa, trebuie sa punem cuvantul abstract
    //intr-o clasa abstracta putem avea metode public, private, protected, static
    //intr-o clasa abstracta putem avea un constructor => nu putem face un obiect
    //o clasa abstracta se mosteneste => clasa care mosteneste
    // trebuie sa implementeze toate metodele abstracte

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

    public abstract void munceste();

    public abstract void tipProgram();

    public abstract void saPrimestiSalar();

    public abstract void prezenta();

    public abstract void studiu();

    public abstract void bursier();

    public abstract void areAbsente();

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

