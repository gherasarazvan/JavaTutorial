package exempluInterfata;

public class RestaurantMix extends Restaurant implements Vegan, NonVegan{
    public RestaurantMix(String numeRestaurant, String locatieRestaurant, String meniuRestaurant, int capacitateRestaurant) {
        super(numeRestaurant, locatieRestaurant, meniuRestaurant, capacitateRestaurant);
    }

    @Override
    public void preparate() {

    }

    @Override
    public void alimenteProaspete() {

    }

    @Override
    public void angajati() {

    }

    @Override
    public void servire() {

    }
}
