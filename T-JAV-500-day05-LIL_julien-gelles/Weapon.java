public abstract class Weapon {

    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    protected boolean equiped = false;

    protected Weapon(String name_, int apcost_, int damage_, boolean melee_) {
        this.name = name_;
        this.apcost = apcost_;
        this.damage = damage_;
        this.melee = melee_;
    }

    public String getName() {
        return this.name;
    }
    public int getApcost() {
        return this.apcost;
    }
    public int getDamage() {
        return this.damage;
    }
    public boolean isMelee() {
        return this.melee;
    }
    public boolean isEquiped() {
        return this.equiped;
    }
    public void setEquiped(boolean status) {
        this.equiped = status;
    }

    public abstract void attack();

}