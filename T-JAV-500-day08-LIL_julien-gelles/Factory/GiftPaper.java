package Factory;

public class GiftPaper{
    private Toy gift;

    public void wrap(Toy gift){
        this.gift = gift;
    }

    public Toy unwrap(){
        Toy stock = this.gift;
        this.gift = null;
        return stock; 
    }

}