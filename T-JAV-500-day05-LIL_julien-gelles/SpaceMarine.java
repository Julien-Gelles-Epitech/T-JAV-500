public abstract class SpaceMarine extends Unit{

    protected Weapon weapon = null;

    protected SpaceMarine(String name_, int hp_, int ap_) {
        super(name_, hp_, ap_);
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public boolean equip(Weapon weapon_) {
        if (!weapon_.isEquiped()) {
            weapon_.setEquiped(true);
            this.weapon = weapon_;
            System.out.println(this.name+" has been equipped with a "+weapon_.getName()+".");
            return true;
        }
        return false;
    }

    @Override
    public boolean attack(Fighter fighter) {
        if (this.hp == 0) {
            return false;
        }else if (this.weapon == null) {
            System.out.println(this.name+": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }else if (this.ap < this.weapon.getApcost()){
            return false;
        }else if (this.weapon.isMelee() && this.target != fighter) {
            System.out.println(this.name+": I'm too far away from "+fighter.getName()+".");
            return false;
        }else{
            this.ap -= this.weapon.getApcost();
            System.out.println(this.name+" attacks "+fighter.getName()+" with a "+this.weapon.getName()+".");
            fighter.receiveDamage(this.weapon.getDamage());
            this.weapon.attack();
            return true;
        }
    }

    @Override
    public boolean moveCloseTo(Fighter fighter) {
        if (this.weapon != null && this.weapon.isMelee()) return super.moveCloseTo(fighter);
        else return false;
    }

    @Override
    public void recoverAP() {
        this.ap += 9;
        if (this.ap > 50) this.ap = 50;
    }

}