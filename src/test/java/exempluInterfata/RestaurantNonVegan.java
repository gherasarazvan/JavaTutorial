package exempluInterfata;

public class RestaurantNonVegan extends Restaurant {

    private boolean areBBQ;
    private String meniulZilei;


    public RestaurantNonVegan(String numeRestaurant, String locatieRestaurant, String meniuRestaurant, int capacitateRestaurant, boolean areBBQ, String meniulZilei) {
        super(numeRestaurant, locatieRestaurant, meniuRestaurant, capacitateRestaurant);
        this.areBBQ = areBBQ;
        this.meniulZilei = meniulZilei;
    }

    public void rezumatRestaurantNonVegan() {
        infoRestaurant();
        if (areBBQ) {
            System.out.println("Da, BBQ este in functiune");
        } else {
            System.out.println("Din pacate BBQ nu este disponibil astazi");
        }
    }
}
