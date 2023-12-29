public abstract interface Fighter {
    boolean equip(Weapon weapon);
    boolean attack(Fighter fighter);
    boolean moveCloseTo(Fighter fighter);
    void receiveDamage(int damage);
    void recoverAP();
    String getName();
    int getAp();
    int getHp();
}