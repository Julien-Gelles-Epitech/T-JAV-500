public class Shark extends Animal {
    protected Boolean frenzy = false;

    public Boolean getFrenzy() {return this.frenzy;}

    public Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(Boolean bool) {
        this.frenzy = bool;
    }

    public void status() {
        if(this.frenzy) {
            System.out.println(this.getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(this.getName() + " is swimming peacefully.");          
        }
    }

    public boolean canEat(Animal possibleFood) {
        if(this == possibleFood) {
            return false;
        } else {
            return true;
        }
    }

    public void eat(Animal food) {
        if (canEat(food)) {
            System.out.println(this.getName() +  " ate a " + food.getType() + " named " + food.getName() + ".");
            this.frenzy = false;
        } else {
            System.out.println(this.getName() +  ": It's not worth my time.");
        }
    }
}