public class Animal {
    private static int numberOfAnimals;

    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;
    
    protected enum Type { MAMMAL, FISH, BIRD }

    private String name;
    private int legs;
    private Type type;

    protected Animal(String name, int nbLegs, Type type) {
        this.name = name;
        this.legs = nbLegs;
        this.type = type;
        numberOfAnimals++;
        switch(type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }
        System.out.println("My name is " + this.name + " and I am a " + this.type.toString().toLowerCase() + "!");
    }

    public String getName()         {return this.name;}
    
    public int getLegs()            {return this.legs;}
    
    public String getType()         {return this.type.toString().toLowerCase();}
   
    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }        
        return numberOfAnimals;
    }
    
    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }  
        return numberOfMammals;
    }
    
    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }  
        return numberOfFish;
    }
    
    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");

        }  
        return numberOfBirds;
    }
}