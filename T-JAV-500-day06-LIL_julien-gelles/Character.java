public abstract class Character implements Movable{

    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    final String RPGClass;

    protected Character(String name_, String RPGClass_) {
        this.name = name_;
        this.RPGClass = RPGClass_;
    }
    public String getName(){
        return this.name;
    }
    public int getLife(){
        return this.life;
    }
    public int getAgility(){
        return this.agility;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getWit(){
        return this.wit;
    }
    public String getRPGClass(){
        return this.RPGClass;
    }

    public void attack(String str) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    public void moveRight() {
        System.out.println(this.name+": moves right");
    }
    public void moveLeft() {
        System.out.println(this.name+": moves left");
    }
    public void moveForward() {
        System.out.println(this.name+": moves forward");
    }
    public void moveBack() {
        System.out.println(this.name+": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.name+": unsheathes his weapon.");
    }
}