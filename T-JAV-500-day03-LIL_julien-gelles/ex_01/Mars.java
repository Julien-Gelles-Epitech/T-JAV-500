public class Mars {

    private static int globalId = 0;
    private int id;

    public Mars() {
        this.id = globalId;
        globalId++;
    }

    public int getId(){
        return this.id;
    }
}