public class Example {
    public static void main(String[] args) {
        Canary titi = new Canary("Titi");
        Shark willy = new WhiteShark("Willy"); //Yes Willy is a shark here !
        Shark marc = new Shark("Marc");

        willy.smellBlood(true);
        willy.eat(willy);
        willy.status();
        willy.eat(titi);
        willy.status();
        willy.eat(marc);
        willy.status();

    }
}