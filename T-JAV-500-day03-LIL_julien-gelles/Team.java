import planet.*;
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Astronaut> list = new ArrayList<>();
    private int size = 0;

    public Team(String nameC){
        this.name = nameC;
    }

    public String getName(){
        return this.name;
    }

    public void add(Astronaut astronaut) {
        list.add(astronaut);
        this.size++;
    }

    public void remove(Astronaut astronaut) {
        list.remove(astronaut);
        this.size--;
    }

    public int countMembers() {
        return this.size;
    }

    public void showMembers() {
        if (this.size != 0){
            String res = this.name + ":";
            for(Astronaut e:list) {
                if (e.getDestination() == null){
                    res += " " + e.getName() + " on standby,";
                }else{
                    res += " " + e.getName() + " on mission,";
                }
            }
            res = res.substring(0, res.length() - 1) + ".";
            System.out.println(res);
        }
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
    }
    
    public void doActions(planet.moon.Phobos phobos) {
        for(Astronaut mate: list) {
            mate.doActions(phobos);
        }
    }  

    public void doActions(planet.Mars mars) {
        for(Astronaut mate: list) {
            mate.doActions(mars);
        }
    }

    public void doActions(chocolate.Mars mars) {
        for(Astronaut mate: list) {
            mate.doActions(mars);
        }
    } 
}