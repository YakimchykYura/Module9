public class MyLinkedList <L> {
    private L value;
    class Node<L> {
        L value;
        Node next;

        public Node(L data) {
            this.value = data;
            this.next = null;
        }
        public Node first = null;
        public Node last = null;

        public void addNode(L data) {
            Node newNode = new Node(data);

            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }
    }

    private MyLinkedList() {
        this.value = value;
    }
    private Node<L> node = new Node<>(value);
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
    public L get(int index) {
        if (index < 0) {
            return null;
        }
        int count = 0;
        Node current = node.first;
        L getNode = null;

        System.out.println("Node ");
        while (current != null) {
            if (count == index) {
                getNode = (L) current.value;
                return getNode;
            }
            current = current.next;
            count++;
        }
        return getNode;
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
