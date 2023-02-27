public class MyHashMap<H, M> {
public int size = 0;
    NodeMyHashMap<H, M> lastNode = null;
    NodeMyHashMap<H, M> firstNode = null;
    public void put(H key, M value) {
       if (contanceKey(key)) {
           return;
       }
       var newNode = new NodeMyHashMap<>(key, value);
       if (firstNode == null) {
           firstNode = newNode;
           lastNode = newNode;
           return;
       }
       lastNode.next = newNode;
       lastNode = newNode;
    }
    private boolean contanceKey(H key) {
        var current = firstNode;
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void remove(H key) {
        var current = firstNode;
        NodeMyHashMap<H, M> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                var next = current.next;
                previous.next = next;
                return;
            }
            previous = current;
            current = current.next;
        }
    }
    public void clear() {
        var current = firstNode;
        while (current != null) {
            firstNode = null;
            lastNode = null;
            current = current.next;
        }
    }
    public int size() {
        var current = firstNode;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    public M get(H key) {
        M returnValue = null;
        var current = firstNode;
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return returnValue;
    }
    public void print() {
        NodeMyHashMap current = firstNode;
        if (firstNode == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes : ");
        while (current != null) {
            System.out.print("key= " + current.key + " " + "value= " + current.value + "; ");
            current = current.next;
        }
        System.out.println();
    }
}
