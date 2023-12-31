public class Mage extends Character{

    public Mage(String name_){
        super(name_, "Mage");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name+": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        switch(weapon) {
            case "magic":
                super.attack(weapon);
                System.out.println(this.name+": Feel the power of my magic!");
                break;
            case "wand":
                super.attack(weapon);
                System.out.println(this.name+": Feel the power of my wand!");
                break;
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name+": moves right furtively.");
    }
    @Override
    public void moveLeft() {
        System.out.println(this.name+": moves left furtively.");
    }
    @Override
    public void moveForward() {
        System.out.println(this.name+": moves forward furtively.");
    }
    @Override
    public void moveBack() {
        System.out.println(this.name+": moves back furtively.");
    }
}