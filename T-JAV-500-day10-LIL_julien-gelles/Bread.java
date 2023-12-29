public abstract class Bread implements Food{
    
    protected float price;
    protected int calories;
    protected int bakingTime = 0;

    protected Bread(float price_, int calories_) {
        this.price = price_;
        this.calories = calories_;
    }

    public float getPrice() {
        return this.price;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getBakingTime() {
        return this.bakingTime;
    }
}