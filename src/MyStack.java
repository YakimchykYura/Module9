import java.util.Arrays;

public class MyStack<S> {
    private S[] data;
    private int size;

    public MyStack() {
        this.data = (S[]) new Object[10];
    }

    public void push(S value) {
        if (value == null) {
            return;
        }
        if (data.length == 0) {
            data = (S[])new Object[10];
        }
        if (data.length <= size) {
            var newSize = data.length * 1.5;
            data = Arrays.copyOf(data, (int) newSize);
        }
        data[size] = value;
        size++;
    }
    public void remove(int index) {
        if (index < 0) {
            return;
        }
        data[index] = null;
        size--;
    }
    public void clear() {
        data = Arrays.copyOf(data, 0);
        size = 0;
    }
    public int size() {
        return size;
    }
    public S peek() {
        return data[size -1];
    }
    public S pop() {
        S firstElement = data[size -1];
        data[size -1] = null;
        size--;
        return firstElement;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "information=" + Arrays.toString(data) +
                '}';
    }
}
