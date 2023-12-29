public class Duet {

    public static <T extends Comparable<T>> T min(T t1, T t2){
        if (t1.compareTo(t2) > 0) return t2;
        else return t1;
	}

    public static <T extends Comparable<T>> T max(T t1, T t2){
        if (t1.compareTo(t2) > 0) return t1;
        else return t2;
	}
}