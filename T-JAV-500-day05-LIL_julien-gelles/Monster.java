public abstract class Monster extends Unit{

    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String name_, int hp_, int ap_) {
        super(name_, hp_, ap_);
    }

    public int getDamage() {
        return this.damage;
    }
    public int getApcost() {
        return this.apcost;
    }

    @Override
    public boolean equip(Weapon weapon) {
        if (this.hp != 0) System.out.println("Monsters are proud and fight with their own bodies.");
            return false;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if (this.hp == 0 || this.ap < this.apcost) {
            return false;
        }else if (this.target != fighter) {
            System.out.println(this.name+": I'm too far away from "+fighter.getName()+".");
            return false;
        }else{
            this.ap -= this.apcost;
            System.out.println(this.name+" attacks "+fighter.getName()+".");
            fighter.receiveDamage(this.damage);
            return true;
        }
    }

}