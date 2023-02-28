import java.util.Arrays;

public class MyQueue<Q> {
    private Q[] data;
    private int size;

    public MyQueue() {
        this.data = (Q[]) new Object[10];
    }
    public void add(Q value) {
        if (value == null) {
            return;
        }
        if (data.length == 0) {
            data = (Q[])new Object[10];
        }
        if (data.length <= size) {
            var newLengthArray = data.length * 1.5;
            data = Arrays.copyOf(data, (int) newLengthArray);
        }
        data[size] = value;
        size++;
    }
    public void clear() {
        data = Arrays.copyOf(data, 0);
        size = 0;
    }
    public int size() {
        return size;
    }
    public Q peek() {
        return data[0];
    }
    public Q poll() {
        Q returnInformation = data[0];
        data[0] = null;
        size--;
        return returnInformation;
    }
    @Override
    public String toString() {
        return "MyQueue{" +
                "information=" + Arrays.toString(data) +
                '}';
    }
}
