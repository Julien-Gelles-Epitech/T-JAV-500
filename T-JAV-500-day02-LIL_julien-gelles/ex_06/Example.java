public class Example {
    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        System.out.println(mimi.getEnergy());
        mimi.eat("Vegetable");
        System.out.println(mimi.getEnergy());
        mimi.eat("meat");
        mimi.eat("MEAT");
        System.out.println(mimi.getEnergy());
    }
}