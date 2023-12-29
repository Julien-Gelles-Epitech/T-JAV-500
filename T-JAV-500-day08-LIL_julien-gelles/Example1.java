import Factory.*;

public class Example1 {
    public static void main(String args[]) {

        System.out.println("--- Ex01 ---");
        Factory factory = new Factory();
        try {
            Toy teddy = factory.create("teddy");
            System.out.println(teddy);
            System.out.println(factory.create("gameboy"));
            GiftPaper paper = new GiftPaper();
            System.out.println(">>>>>> test wrap unwrap >>>>>");
            System.out.println(paper.unwrap());
            paper.wrap(teddy);
            System.out.println(paper.unwrap().getTitle());
            System.out.println(paper.unwrap());
            System.out.println(">>>>>> test wrap unwrap >>>>>");
            System.out.println(factory.create("other"));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(factory.getPapers(3));

        System.out.println("--- Ex02 ---");
        Elf toby = new Elf(factory);
        try {
            toby.pickToy("power rangers");
            toby.pickToy("teddy");
            toby.pickToy("gameboy");
        } catch (Exception e) {}
        toby.pickPapers(1);
        System.out.println(toby.pack());
        System.out.println(toby.pack());
        toby.pickToy("gameboy");
        System.out.println(toby.pack());
        toby.pickPapers(2);
        System.out.println(toby.pack());
        System.out.println(toby.pack());

    }
}