package Factory;

import java.util.*;

public class Elf {
    
    private Toy toy = null;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory_) {
        this.factory = factory_;
    }

    public boolean pickToy(String toy_) {
        if (this.toy == null) {
            try {
                Toy res = factory.create(toy_);
                this.toy = res;
                System.out.println("What a nice one! I would have liked to keep it...");
                return true;
            } catch (Exception e) {
                System.out.println("I didn't find any "+toy_+".");
                return false;
            }
        } else {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }

    }

    public boolean pickPapers(int nb) {
        this.papers  = this.factory.getPapers(nb);
        return true;
    }

    public GiftPaper pack() {
        if (this.papers.size() == 0 && this.toy == null) {
            return null;
        } else if (this.papers.size() == 0) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        } else if (this.toy == null){
            System.out.println("I don't have any toy, but I've some paper !");
            return null;
        } else {
            System.out.println("And another kid will be happy!");
            GiftPaper paper = papers.get(0);
            this.papers.remove(papers.get(0));
            paper.wrap(this.toy);
            this.toy = null;
            return paper;
        }
    }
}
