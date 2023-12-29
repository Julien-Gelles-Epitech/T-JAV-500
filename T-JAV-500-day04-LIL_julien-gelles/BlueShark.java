public class BlueShark extends Shark{

    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal possibleFood) {
        if(possibleFood.getType().equals("fish") && this != possibleFood) {
            return true;
        } else {
            return false;
        }
    }   
}
