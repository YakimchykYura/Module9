import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList <T> implements Iterable<T> {
    private T[] information;
    private int size;

    public MyArrayList() {
        this.information = (T[]) new Object[10];
    }
    public void add(T value) {
        if (value == null) {
            return;
        }
        if (information.length <= size) {
            var newSize = (int) (information.length * 1.5);
            information = Arrays.copyOf(information, newSize);
        }
       information[size] = value;
        size++;
    }
    public void remove(int index) {
        if (index < 0) {
            return;
        }
        for (; index < size - 1; index++) {
            information[index] = information[index + 1];
        }
        information[size -1] = null;
        size--;
    }
    public void clear() {
        T[] emptyArrays = Arrays.copyOf(information, 0);
        System.out.println(Arrays.toString(emptyArrays));
    }
    public int size() {
        System.out.println(size);
        return size;
    }
    public void get(int index) {
        if (index < 0) {
            return;
        }
        var valueUnderIndex = information[index];
        System.out.println(valueUnderIndex);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator<>();
    }

    public class MyArrayListIterator<T> implements Iterator<T> {
        private int current;

        public boolean hasNext() {
            if (current >= MyArrayList.this.information.length) {
                return false;
            }
            if (MyArrayList.this.information[current] == null) {
                return false;
            }
            return true;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = (T) information[current++];
            return value;
        }
    }
}
