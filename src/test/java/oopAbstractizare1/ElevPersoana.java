package oopAbstractizare1;

public class ElevPersoana extends Persoana implements Elev {

    private String scoala;
    private String clasa;

    public ElevPersoana(String nume, String prenume, int varsta, String scoala, String clasa) {
        super(nume, prenume, varsta);

        this.scoala = scoala;
        this.clasa = clasa;
    }

    public void rezumatElev() {
        infoPersoana();

        System.out.println("Scoala elevului este: " + scoala);

        System.out.println("Clasa din care elevul face parte este: " + clasa);
    }

    @Override
    public void prezenta() {

    }

    @Override
    public void studiu() {

    }

    @Override
    public void bursier() {

    }

    @Override
    public void areAbsente() {

    }
}