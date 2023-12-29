public class Mage extends Character{

    public Mage(String name_){
        super(name_, "Warrior");
        this.life = 70;
        this.strength = 3;
        this.agility = 10;
        this.wit = 10;
        System.out.println(this.name+": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if(weapon.equals("")) {
            throw new WeaponException(this.name + ": I refuse to fight with my bare hands.");
        } else if (!weapon.equals("wand") && !weapon.equals("magic")) {
            throw new WeaponException(this.name + ": I don't need this stupid " + weapon + "! Don't misjudge my powers!");
        } else {
            super.attack(weapon);
            System.out.println(this.name + ": Feel the power of my " + weapon + "!");
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