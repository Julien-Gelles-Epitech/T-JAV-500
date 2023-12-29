public class Pair<T, V> {

    private T first;
    private V second;

    public Pair(T first_, V second_) {
        this.first = first_;
        this.second = second_;
    }

    public T getFirst() {
        return first;
    }
    public V getSecond() {
        return second;
    }

    public void display() {
        System.out.println("first: "+this.first+", second: "+this.second+".");
    }
}