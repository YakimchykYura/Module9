public class MyHashMap<H, M> {
public int size =0;
    NodeMyHashMap data = null;
    public void put(H key, M value) {
        var newNode = new NodeMyHashMap(key, value);
        var current = data;
        if (data == null) {
            data = newNode;
        } else {
            data.next = newNode;
            data = newNode;
        }
    }
    public void remove(H key) {
        var current = data;
        while (current.key.equals(key)) {
            current = null;
            size--;
            current = data.next;
        }
    }
    public void clear() {
        var current = data;
        while (current != null) {
            current = null;
            current = data.next;
        }
    }
    public int size() {
        var current = data;
        while (current != null) {
            size++;
            current = data.next;
        }
        return size;
    }
    public M get(H key) {
        M returnValue = null;
        var current = data;
        while (current.key.equals(key)) {
            returnValue = (M) current.value;
            current = data.next;
        }
        return returnValue;
    }
    public void print() {
        NodeMyHashMap current = data;
        if (data == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes : ");
        while (current != null) {
            System.out.print("key= " + current.key + " " + "value= " + current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
