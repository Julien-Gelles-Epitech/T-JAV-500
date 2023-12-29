package Composite;

public class Word implements Sentence{
    
    private String str;

    public Word(String str_) {
        this.str = str_;
    }

    @Override
    public void print() {
        System.out.println(str);
    }
}
