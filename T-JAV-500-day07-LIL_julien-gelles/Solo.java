public class Solo<T> {

    private T value;

    public Solo(T value_) {
        this.value = value_;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value_) {
        this.value = value_;
    }
}