package planet.moon;

public class Phobos{

    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars marsC, String landingSiteC){
        if (mars != null) {
            this.mars = marsC;
            this.landingSite = landingSiteC;
            System.out.println("Phobos placed in orbit.");
        } else {
            this.mars = null;
            this.landingSite = null;
            System.out.println("No planet given.");
        }
        
    }

    public planet.Mars getMars() {
        return this.mars;
    }

    public String getLandingSite(){
        return this.landingSite;
    }
}