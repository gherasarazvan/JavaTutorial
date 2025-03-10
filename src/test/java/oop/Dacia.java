package oop;

import java.util.List;

public class Dacia extends Masina{

    public List<String> dotariExterioare;

    public Dacia(String marca, String model, int anFabricatie, String combustibil, int pret, List<String> dotariExterioare) {
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void rezumatDacia(){
        rezumatComanda();
        System.out.println("Masina va avea si urmatoarele dotari exterioare: " + dotariExterioare);
    }

}
