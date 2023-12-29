public abstract class Unit implements Fighter{

    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter target = null;

    protected Unit(String name_, int hp_, int ap_) {
        this.name = name_;
        this.hp = hp_;
        this.ap = ap_;
    }

    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }
    public int getAp() {
        return this.ap;
    }
    public Fighter getTarget() {
        return this.target;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
    }

    public boolean equip(Weapon weapon) {
        if (this.hp == 0) return false;
        else {
            return true;
        }
    }

    public boolean attack(Fighter fighter) {
        if (this.hp == 0) return false;
        else {
            return true;
        }
    }
    

    public boolean moveCloseTo(Fighter fighter) {
        if (this.hp == 0 || fighter == this || fighter == this.target) return false;
        else {
            this.target = fighter;
            System.out.println(this.name+" is moving closer to "+fighter.getName()+".");
            return true;
        }
    }

    public void recoverAP() {
        this.ap += 7;
        if (this.ap > 50) this.ap = 50;
    }
}