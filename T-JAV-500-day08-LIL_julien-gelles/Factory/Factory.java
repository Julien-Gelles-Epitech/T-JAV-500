package Factory;

import java.util.*;

public class Factory{

    public Toy create(String toyToCreate) throws NoSuchToyException{
        if(toyToCreate.equals("teddy")){
            return new TeddyBear();
        }else if(toyToCreate.equals("gameboy")){
            return new Gameboy();
        }else{
            throw new NoSuchToyException("No such toy: " + toyToCreate + ".");
        }
    }

    public List<GiftPaper> getPapers(int n){
        List<GiftPaper> liste = new ArrayList<GiftPaper>();
        for(int i = 0; i< n; i++){
            GiftPaper paper = new GiftPaper();
            liste.add(paper);
        }
        return liste;
    }
}