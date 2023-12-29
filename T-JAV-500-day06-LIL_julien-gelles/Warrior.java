public class Warrior extends Character{

    public Warrior(String name_){
        super(name_, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(this.name+": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        switch(weapon) {
            case "hammer":
                super.attack(weapon);
                System.out.println(this.name+": I'll crush you with my hammer!");
                break;
            case "sword":
                super.attack(weapon);
                System.out.println(this.name+": I'll crush you with my sword!");
                break;
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right like a bad boy.");
    }
    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left like a bad boy.");
    }
    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward like a bad boy.");
    }
    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back like a bad boy.");
    }
}