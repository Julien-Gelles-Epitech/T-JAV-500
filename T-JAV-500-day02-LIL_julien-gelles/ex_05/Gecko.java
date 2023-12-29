public class Gecko {

    private String name;
    private int age;

    public Gecko() {
        this.name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String nameC) {
        this.name = nameC;
        System.out.println("Hello "+name+"!");
    }
    public Gecko(String nameC, int ageC) {
        this.name = nameC;
        this.age = ageC;
        System.out.println("Hello "+name+"!");

    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int ageS){
        this.age = ageS;
    }

    public void status(){
        switch (this.age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;

        }
    }

    public void hello(String str){
        System.out.println("Hello "+str+", I'm "+this.name+"!");
    }

    public void hello(int nb){
        for (int i=0; i<nb; i++) {
            System.out.println("Hello, I'm "+this.name+"!");
        }
    }

    public void hello(Object... args){
    }

}
