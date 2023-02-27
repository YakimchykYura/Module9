import java.util.Arrays;

public class MyQueue<Q> {
    public Q[] information;
    private int size;

    public MyQueue() {
        this.information = (Q[]) new Object[10];
    }
    public void add(Q value) {
        if (value == null) {
            return;
        }
        if (information.length <= size) {
            var newLengthArray = information.length * 1.5;
            information = Arrays.copyOf(information, (int) newLengthArray);
        }
        information[size] = value;
        size++;
    }
    public void clear() {
        information = Arrays.copyOf(information, 0);
    }
    public int size() {
        return size;
    }
    public Q peek() {
        return information[0];
    }
    public Q poll() {
        Q returnInformation = information[0];
        information[0] = null;
        size--;
        return returnInformation;
    }
    @Override
    public String toString() {
        return "MyQueue{" +
                "information=" + Arrays.toString(information) +
                '}';
    }
}
