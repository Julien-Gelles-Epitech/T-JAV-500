public class Gecko {

    private String name;

    public Gecko(String nameC) {
        this.name = nameC;
        System.out.println("Hello "+name+"!");
    }

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }

    public String getName(){
        return name;
    }

}
