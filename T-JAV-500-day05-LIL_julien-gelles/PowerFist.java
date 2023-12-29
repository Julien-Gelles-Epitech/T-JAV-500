public class PowerFist extends Weapon {

    private String output = "SBAM";

    public PowerFist() {
        super("Power Fist", 8, 50, true);
    }

    @Override
    public void attack() {
        System.out.println(this.output);
    }
}