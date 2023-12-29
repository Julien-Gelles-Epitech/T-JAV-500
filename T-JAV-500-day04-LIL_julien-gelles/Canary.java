public class Canary extends Animal {
    private int eggs = 0;

    public int getEggsCount() {return this.eggs;}

    public void layEgg() {this.eggs++;}

    public Canary(String name) {
        super(name, 2, Type.BIRD);
        this.eggs=0;
        System.out.println("Yellow and smart? Here I am!");
    }
}