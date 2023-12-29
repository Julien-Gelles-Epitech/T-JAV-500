public class Example {
    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        mimi.hello("Titi");
        mimi.hello(2);
        mimi.hello("Titi", "Tata", 5, 15);
        mimi.hello();
    }
}