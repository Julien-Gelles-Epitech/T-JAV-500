public class Gecko {

    public String name;

    public Gecko(String nameC) {
        this.name = nameC;
        System.out.println("Hello "+name+"!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

}
