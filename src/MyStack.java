import java.util.Arrays;

public class MyStack<S> {
    private S[] information;
    private int size;

    public MyStack() {
        this.information = (S[]) new Object[10];
    }

    public void push(S value) {
        if (value == null) {
            return;
        }
        if (information.length <= size) {
            var newSize = information.length * 1.5;
            information = Arrays.copyOf(information, (int) newSize);
        }
        information[size] = value;
        size++;
    }
    public void remove(int index) {
        if (index < 0) {
            return;
        }
        information[index] = null;
        size--;
    }
    public void clear() {
        information = Arrays.copyOf(information, 0);
    }
    public int size() {
        return size;
    }
    public S peek() {
        return information[size -1];
    }
    public S pop() {
        S firstElement = information[size -1];
        information[size -1] = null;
        size--;
        return firstElement;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "information=" + Arrays.toString(information) +
                '}';
    }
}
