import java.util.Arrays;

public class MyArrayList <T> {
    private T[] data;

    private int size;

    public MyArrayList() {
        this.data = (T[]) new Object[10];
    }

    public void add(T value) {
        if (value == null) {
            return;
        }
        if (data.length == 0) {
            data = (T[])new Object[10];
        }
        if (data.length <= size) {
            var newSize = (int) (data.length * 1.5);
            data = Arrays.copyOf(data, newSize);
        }
        data[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0) {
            return;
        }
        for (; index < size - 1; index++) {
            data[index] = data[index + 1];
        }
        data[size - 1] = null;
        size--;
    }

    public void clear() {
        data = Arrays.copyOf(data, 0);
        size = 0;
        System.out.println(Arrays.toString(data));
    }

    public int size() {
        System.out.println(size);
        return size;
    }

    public T get(int index) {
        if (index < 0) {
            return null;
        }
        return data[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "information=" + Arrays.toString(data) +
                '}';
    }
}

