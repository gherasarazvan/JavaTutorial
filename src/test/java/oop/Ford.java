package oop;

import java.util.List;

public class Ford extends Masina{

    public List<String> dotariExterioare;
    public List<String> dotariInterioare;

    public Ford(String marca, String model, int anFabricatie, String combustibil, int pret, List<String> dotariExterioare,List<String> dotariInterioare) {
        super(marca, model, anFabricatie, combustibil, pret);
        this.dotariExterioare = dotariExterioare;
        this.dotariInterioare = dotariInterioare;
    }

    public void rezumatFord(){
        rezumatComanda();
        System.out.println("Masina are si urmatoarele dotari exterioare: " + dotariExterioare);
        System.out.println("Masina are si urmatoarele dotari interioare: " + dotariInterioare);
    }
}
