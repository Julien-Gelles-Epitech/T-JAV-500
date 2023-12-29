public class Example {
    public static void main(String[] args) {
        Gecko john = new Gecko("John", 4);
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();

        arthur.setAge(2);
        benjy.setAge(0);
        john.status();
        arthur.status();
        benjy.status();
    }
}