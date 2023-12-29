public abstract class Drink implements Food{

    protected float price;
    protected int calories;
    protected boolean aCan = false;

    protected Drink(float price_, int calories_) {
        this.price = price_;
        this.calories = calories_;
    }

    public float getPrice() {
        return this.price;
    }

    public int getCalories() {
        return this.calories;
    }

    public boolean isACan() {
        return this.aCan;
    }

}
