package exempluInterfata;

public class RestaurantVegan extends Restaurant {

    private String desertVegan;
    private boolean lasagnaVegan;

    public RestaurantVegan(String numeRestaurant, String locatieRestaurant, String meniuRestaurant, int capacitateRestaurant, String desertVegan, boolean lasagnaVegan) {
        super(numeRestaurant, locatieRestaurant, meniuRestaurant, capacitateRestaurant);
        this.desertVegan = desertVegan;
        this.lasagnaVegan = lasagnaVegan;
    }

    public void rezumatRestaurantVegan() {
        infoRestaurant();
        System.out.println("Mai putem face doar " + desertVegan);
        if (lasagnaVegan) {
            System.out.println("Da, lasagna vegana este disponibila");
        } else {
            System.out.println("Din pacate nu avem lasagna vegana");
        }
    }
}
