public class GreatWhite extends Shark{

    public GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal possibleFood) {
        if(possibleFood instanceof Canary || this == possibleFood) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void eat(Animal food) {
        if (canEat(food) && food instanceof Shark) {
            System.out.println(this.getName() +  " ate a " + food.getType() + " named " + food.getName() + ".");
            this.frenzy = false;
            System.out.println(this.getName() + ": The best meal one could wish for.");
        } else if (canEat(food)) {
            System.out.println(this.getName() +  " ate a " + food.getType() + " named " + food.getName() + ".");
            this.frenzy = false;
        } else if (food instanceof Canary) {
            System.out.println(this.getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
        } else {
            System.out.println(this.getName() +  ": It's not worth my time.");
        }
    }    
}