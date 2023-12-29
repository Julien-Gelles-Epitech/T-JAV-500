import java.util.*;

public class Ex06 {

    public static ArrayList<String> str_to_blocarray(String str){
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str.split("")));
        ArrayList<String> arr2 = new ArrayList<String>();
        String current = arr.get(0);
        String str2 = "";
        for (String value : arr) {
            if (value.equals(current)) {
                str2 += value;
            } else {
                arr2.add(str2);
                current = value;
                str2 = value;
            }
        }
        arr2.add(str2);
        return arr2;
    }

    public static String blocarray_to_str(ArrayList<String> arr){
        String str = "";
        for (String value : arr) {
            str += value.length();
            String car = new ArrayList<String>(Arrays.asList(value.split(""))).get(0);
            str += car;
        }
        return str;
    }

    public static void sequence(int nbr){
        String line = "1";
        System.out.println(line);
        for (int i=0; i<nbr; i++) {
            ArrayList<String> arr = str_to_blocarray(line);
            String str = blocarray_to_str(arr);
            System.out.println(str);
            line = str;
        }
    }
}