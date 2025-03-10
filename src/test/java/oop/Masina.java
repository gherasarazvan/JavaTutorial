package oop;

public class Masina {

    // oop = programare orientata pe obiect
    // exista 4 principii = mostenire, incapsularea datelor, polimorfismul, abstractizarea
    // mostenirea = conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
    // in java putem mosteni o singura clasa
    // ca sa mostenim o clasa folosim cuvantul "extends"
    // in momentul in care clasa copil mosteneste clasa parinte, copilul trebuie sa apeleze constructorul din parinte
    // copilul apeleaza constructorul parinte folosind cuvantul "super"
    // in momentul in care clasa copil mosteneste clasa parinte, copilul are acces la variabile/metode din parinte

    public String marca;
    public String model;
    public int anFabricatie;
    public String combustibil;
    public int pret;

    public Masina(String marca, String model, int anFabricatie, String combustibil, int pret) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.combustibil = combustibil;
        this.pret = pret;
    }

    public void rezumatComanda(){
        System.out.println("Marca masini este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie al masinii este: " + anFabricatie);
        System.out.println("Motorizarea masinii este: " + combustibil);
        System.out.println("Pretul masinii este " + pret);
    }
}
