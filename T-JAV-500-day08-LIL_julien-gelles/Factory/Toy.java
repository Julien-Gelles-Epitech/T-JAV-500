package Factory;

public abstract class Toy{
    private String title;

    public String getTitle(){
        return title;
    }

    public Toy(String title){
        this.title = title;
    }
}