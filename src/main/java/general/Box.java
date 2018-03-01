package general;
public class Box<T> {
    public T getObject() {
        return object;
    }

    public Box(T object) {
        this.object = object;
    }

    private T  object;
    public void setObject(T object) {
        this.object = object;
    }
}
