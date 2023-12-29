import java.util.ArrayList;

public class Ex05 {

    public static ArrayList<String> myGetArgs(String... var){
        ArrayList<String> vars = new ArrayList<String>();
        for (String str : var) {
            vars.add(str);
        }
        return vars;
    }
}