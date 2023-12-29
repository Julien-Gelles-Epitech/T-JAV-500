public class Example {

    public static void main(String[] args) {
        Monster monster1 = new Monster("Monster1", 50, 20); // Cas classique
        Monster monster2 = new Monster("Monster2", 0, 20); // Supposé deja mort
        Monster monster3 = new Monster("Monster3", 50, -1); // Pas de mana

        PlasmaRifle rifle = new PlasmaRifle();

        System.out.println("---Monster 1---");
        monster1.equip(rifle);
        monster1.attack(monster2);
        monster1.moveCloseTo(monster2);
        monster1.attack(monster2);

        System.out.println("---Monster 2---");
        monster2.equip(rifle);
        monster2.attack(monster3);
        monster2.moveCloseTo(monster3);
        monster2.attack(monster3);

        System.out.println("---Monster 3---");
        monster3.equip(rifle);
        monster3.attack(monster1);
        monster3.moveCloseTo(monster1);
        monster3.attack(monster1); 

    }
}