package obiectConstructor;

public class Masina {
    // are ca rol initializarea variabilelor unei clase
    // exista doua tipuri de constructori: default (nu are parametri/nu este definit) sau cu parametri
    // structura constructor: public (de cele mai multe ori), nume clasa, cu sau fara parametri
    // intr-o clasa putem avea mai multi cosntructori diferntiati prin numarul sau tipul de parametri
    // obiect = instanta unei clase
    // dintr-o clasa putem sa definim mai multe obiecte pe care sa le diferentiem dupa nume
    // in momentul in care instantiem un obiect se apeleaza constructorul clasei respective
    // un obiect se instantiaza folosind cuvantul new
    // un obiect instantiat are posibilitatea sa acceseze proprietatile/metodele din clasa respectiva

    public String marca;
    public String model;
    public String motorizare;
    public int numarLocuri;
    public int anFabricatie;
    public double pret;

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anFabricatie = anFabricatie;
    }

    public Masina(String marca, String model, String motorizare, int numarLocuri, int anFabricatie, double pret) {
        this.marca = marca;
        this.model = model;
        this.motorizare = motorizare;
        this.numarLocuri = numarLocuri;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
    }

    public void rezumat() {
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Motorizarea masinii este: " + motorizare);
        System.out.println("Masina are " + numarLocuri + " locuri");
        System.out.println("Anul de fabricatie al masinii este: " + anFabricatie);

        if (pret != 0) System.out.println("Pretul masinii este: " + pret);
    }
}
