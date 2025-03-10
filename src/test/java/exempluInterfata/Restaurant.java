package exempluInterfata;

public class Restaurant {

    private String numeRestaurant;
    private String locatieRestaurant;
    private String meniuRestaurant;
    private int capacitateRestaurant;

    public Restaurant(String numeRestaurant, String locatieRestaurant, String meniuRestaurant, int capacitateRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.locatieRestaurant = locatieRestaurant;
        this.meniuRestaurant = meniuRestaurant;
        this.capacitateRestaurant = capacitateRestaurant;
    }

    public void infoRestaurant(){
        System.out.println("Numele restaurantului este " + numeRestaurant);
        System.out.println("Locatia restaurantului este " + locatieRestaurant);
        System.out.println("Meniul restaurantului este " + meniuRestaurant);
        System.out.println("Capacitatea restaurantului este de " + capacitateRestaurant + " persoane");
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getLocatieRestaurant() {
        return locatieRestaurant;
    }

    public void setLocatieRestaurant(String locatieRestaurant) {
        this.locatieRestaurant = locatieRestaurant;
    }

    public String getMeniuRestaurant() {
        return meniuRestaurant;
    }

    public void setMeniuRestaurant(String meniuRestaurant) {
        this.meniuRestaurant = meniuRestaurant;
    }

    public int getCapacitateRestaurant() {
        return capacitateRestaurant;
    }

    public void setCapacitateRestaurant(int capacitateRestaurant) {
        this.capacitateRestaurant = capacitateRestaurant;
    }
}
