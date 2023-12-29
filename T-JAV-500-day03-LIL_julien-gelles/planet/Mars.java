package planet;

public class Mars {

    private static int globalId = 0;
    private int id;
    private String landingSite;

    public Mars(String landingSiteC) {
        this.landingSite = landingSiteC;
        this.id = globalId;
        globalId++;
    }

    public int getId(){
        return this.id;
    }

    public String getLandingSite(){
        return this.landingSite;
    }
}