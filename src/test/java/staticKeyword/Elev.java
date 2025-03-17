package staticKeyword;

public class Elev {

    // static = keyword care poate sa fie folosit la proprietati sau metode
    // scopul acestui keyword este sa iti dea posibilitatea sa accesezi proprietatea/metoda fara a avea nevoie de un obiect de tipul clasei
    // in momentul cand o proprietate este statica, toate obiectele au aceeasi valoare pentru ea
    // in momentul cand o metoda este statica, o putem accesa folosind numele clasei
    // este recomandat sa nu abuzam de static si sa-l folosim cel mai des la logica pentru utilitare
    // static provoaca foarte mari probleme cand vine vorba de executii in paralel


    private String nume;
    private String prenume;
    private int varsta;
    private String clasa;

    private static String scoala = "Liviu Rebreanu";
    private static int idElev = 0;

    public Elev(String nume, String prenume, int varsta, String clasa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.clasa = clasa;
        idElev++;
    }

    public void infoElev(){
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);
        System.out.println("Clasa: " + clasa);
        System.out.println("Scoala: " + scoala);
        System.out.println("ID Elev: " + idElev);
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

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }
}
