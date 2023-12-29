import java.util.*;

public class Battalion {

    List<Character> characters = new ArrayList<Character>();

    public <T extends Character> void add(List<T> characters_) {
        for (T c:characters_) {
            this.characters.add(c);
        }
    }
    public void display() {
        for (Character c:this.characters) {
            System.out.println(c.getName());
        }
    }

    public boolean fight() {
        if (characters.size() >= 2) {
            Character character1 = characters.get(0);
            Character character2 = characters.get(1);
            int res = character1.compareTo(character2);
            switch (res) {
                case -1:
                    characters.remove(character1);
                    break;
                case 1:
                    characters.remove(character2);
                    break;
                case 0:
                    characters.remove(character1);
                    characters.remove(character2);
                    break;
            }
            return true;
        }else return false;
    }
}