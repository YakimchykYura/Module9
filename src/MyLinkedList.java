public class MyLinkedList <L> {
    private L value;

    public MyLinkedList() {
        this.value = value;
    }
    Node<L> node = new Node<>(value);
    public void add(L value) {
    node.addNode(value);
    }
    public int size() {
        int count = 0;
        Node current = node.first;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void print() {
        Node current = node.first;
        if (node.first == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes : ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void remove(int index) {
        int count = 0;
        Node current = node.first;

        while (current != null) {
            if (count == index) {
                current.value = null;
            }
            current = current.next;
            count++;
        }
    }
    public void get(int index) {
        if (index < 0) {
            return;
        }
        int count = 0;
        Node current = node.first;

        System.out.println("Node ");
        while (current != null) {
            if (count == index) {
                System.out.println(current.value);
            }
            current = current.next;
            count++;
        }
    }
    public void clear() {
        Node current = node.first;

        while (current != null){
            node.first = null;
            node.last = null;
            current = current.next;
        }
    }
}
